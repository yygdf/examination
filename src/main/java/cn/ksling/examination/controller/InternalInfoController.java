package cn.ksling.examination.controller;

import cn.ksling.examination.entity.InternalInfo;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.InternalInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

// 内科信息
@RestController
public class InternalInfoController {
    @Autowired
    private InternalInfoService internalInfoService;

    @GetMapping("/internal/{pageNum}/{pageSize}")
    public ModelAndView toInternalInfo(@PathVariable("pageNum") Integer pageNum,
                                       @PathVariable("pageSize") Integer pageSize,
                                       @RequestParam(value = "name",required = false) String name,
                                       HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<InternalInfo> list = internalInfoService.queryInternalInfoByName(name);
        PageInfo<InternalInfo> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("internalInfoPageInfo",pageInfo);
        modelAndView.addObject("internalInfoList", list);
        modelAndView.addObject("activeUrl1","infoActive");
        modelAndView.addObject("activeUrl2","internalInfoActive");
        modelAndView.addObject("pageTopBarInfo","内科信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/internalInfo");

        return modelAndView;
    }
}