package cn.ksling.examination.controller;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.service.BookService;
import cn.ksling.examination.service.BookOrderService;
import cn.ksling.examination.service.ThemeService;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {
    @Autowired
    private ThemeService themeService;
    @Autowired
    private BookService bookService;
    @Autowired
    private BookOrderService bookOrderService;

    @GetMapping("/user/guide")
    public ModelAndView guide(HttpSession httpSession) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        User user = (User) httpSession.getAttribute("loginUser");
        Theme theme = themeService.queryThemeByUsername(user.getUsername());
        httpSession.setAttribute("theme", theme);
        List<Book> bookList = bookService.queryBook();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for (Book b : bookList) {
                if(1 == b.getSession()) {
                    Date date = sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(b.getDate()) + " " +"12:00:00");
                    if(date.getTime() < new Date().getTime()) {
                        b.setAvailable(3);
                    }
                }
            if(2 == b.getSession()) {
                Date date = sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(b.getDate()) + " " +"17:00:00");
                if(date.getTime() < new Date().getTime()) {
                    b.setAvailable(3);
                }
            }
        }

        modelAndView.addObject("bookInfoList",bookList);
        modelAndView.addObject("pageTopBarInfo","预约");
        modelAndView.addObject("activeUrl1","processActive");
        modelAndView.addObject("activeUrl2","guideInfoActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/user/process/guide");

        return modelAndView;
    }

    @PutMapping("/user/book")
    public Msg book(BookOrder bookOrder) {
        BookOrder bookO = bookOrderService.queryBookOrderByNum(bookOrder.getNum());
        if (null != bookO) {
            return Msg.fail().add("err", "同一批次只能预约一次！");
        }
        SimpleHash hash = new SimpleHash("md5", bookOrder.getPayCode(), "ksl", 2);
        bookOrder.setPayCode(hash.toString());
        Integer res = bookOrderService.addBookOrder(bookOrder);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail().add("err", "预约失败！");
    }

    @DeleteMapping("/user/removeOrder/{id}")
    public Msg removeOrder(@PathVariable("id") Integer id) {
        Integer res = bookOrderService.removeBookOrder(id);
        if(1 == res) {
            return Msg.success();
        }

        return Msg.fail();
    }

    @GetMapping("/user/order")
    public ModelAndView order(HttpSession httpSession) throws ParseException {
        ModelAndView modelAndView = new ModelAndView();
        User user = (User) httpSession.getAttribute("loginUser");
        Theme theme = themeService.queryThemeByUsername(user.getUsername());
        httpSession.setAttribute("theme", theme);
        List<BookOrder> bookOrderList = bookOrderService.queryBookOrder(user.getId());
        List<Book> bookList = bookService.queryBook();
        List<BookOrderVo> bookOrderVoList = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        for (BookOrder bo : bookOrderList) {
            for (Book b : bookList) {
                if(bo.getBookId() == b.getId()) {
                    BookOrderVo bookOrderVo = new BookOrderVo();
                    if(1 == b.getSession()) {
                        Date date = sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(b.getDate()) + " " +"12:00:00");
                        bookOrderVo.setBook(b);
                        bookOrderVo.setBookOrder(bo);
                        bookOrderVo.setOverdue(0);
                        if(date.getTime() < new Date().getTime()) {
                            bookOrderVo.setOverdue(1);
                        }
                        bookOrderVoList.add(bookOrderVo);
                    }
                    if(2 == b.getSession()) {
                        Date date = sdf.parse(new SimpleDateFormat("yyyy-MM-dd").format(b.getDate()) + " " +"17:00:00");
                        bookOrderVo.setBook(b);
                        bookOrderVo.setBookOrder(bo);
                        bookOrderVo.setOverdue(0);
                        if(date.getTime() < new Date().getTime()) {
                            bookOrderVo.setOverdue(1);
                        }
                        bookOrderVoList.add(bookOrderVo);
                    }
                }
            }
        }

        modelAndView.addObject("bookOrderVoInfoList",bookOrderVoList);
        modelAndView.addObject("pageTopBarInfo","订单");
        modelAndView.addObject("activeUrl1","processActive");
        modelAndView.addObject("activeUrl2","orderInfoActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/user/process/order");

        return modelAndView;
    }

    @GetMapping("/user/queryPayStatus")
    public Msg getPayStatus(Integer id) {
        BookOrder bookOrder = bookOrderService.queryBookOrderById(id);
        if(1 == bookOrder.getIsPay()) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @GetMapping("/pay")
    public Msg pay(String payCode) {
        SimpleHash hash = new SimpleHash("md5", payCode, "ksl", 2);
        Integer res = bookOrderService.editBookOrderByPayCode(hash.toString());
        if(1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @DeleteMapping("/user/removeBookOrder/{id}")
    public Msg removeBookOrder(@PathVariable("id") Integer id) {
        Integer res = bookOrderService.removeBookOrder(id);
        if(1 == res) {
            return Msg.success();
        }

        return Msg.fail();
    }
}
