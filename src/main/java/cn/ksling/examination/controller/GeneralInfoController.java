package cn.ksling.examination.controller;

import cn.ksling.examination.entity.GeneralInfo;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.GeneralInfoService;
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
}
