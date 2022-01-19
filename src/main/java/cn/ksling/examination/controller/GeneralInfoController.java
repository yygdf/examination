package cn.ksling.examination.controller;

import cn.ksling.examination.entity.GeneralInfo;
import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.GeneralInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// 基本信息
@RestController
public class GeneralInfoController {
    @Autowired
    private GeneralInfoService generalInfoService;

    @GetMapping("/general/{pageNum}/{pageSize}")
    public ModelAndView toGeneralInfo(@PathVariable("pageNum") Integer pageNum,
                                      @PathVariable("pageSize") Integer pageSize,
                                      @RequestParam(value = "name",required = false) String name,
                                      HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<GeneralInfo> list = generalInfoService.queryGeneralInfoByName(name);
        PageInfo<GeneralInfo> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("generalInfoPageInfo",pageInfo);
        modelAndView.addObject("generalInfoList", list);
        modelAndView.addObject("activeUrl1","infoActive");
        modelAndView.addObject("activeUrl2","generalInfoActive");
        modelAndView.addObject("pageTopBarInfo","基本信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/generalInfo");

        return modelAndView;
    }

    @PutMapping("/admin/editGeneralInfo")
    public Msg editGeneralInfo(GeneralInfo generalInfo) {
        Integer res = generalInfoService.editGeneralInfoByEntity(generalInfo);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @DeleteMapping("/admin/removeGeneralInfo/{id}")
    public Msg removeGeneralInfo(@PathVariable("id") Integer id) {
        Integer res = generalInfoService.removeGeneralInfoById(id);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    // 日期格式化
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
