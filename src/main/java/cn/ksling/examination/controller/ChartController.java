package cn.ksling.examination.controller;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.service.EyeInfoService;
import cn.ksling.examination.service.GeneralInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

@RestController
public class ChartController {
    @Autowired
    private GeneralInfoService generalInfoService;
    @Autowired
    private EyeInfoService eyeInfoService;

    @GetMapping("/admin/gender")
    public ModelAndView genderChart(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        Theme theme = (Theme) httpSession.getAttribute("theme");
        List<GeneralInfo> list = generalInfoService.queryGeneralInfoByName("%");
        Integer manCount = 0;
        for (GeneralInfo g : list) {
            if("男".equals(g.getGender())) {
                manCount++;
            }
        }

        modelAndView.addObject("pageTopBarInfo","统计分析");
        modelAndView.addObject("activeUrl1","chartActive");
        modelAndView.addObject("activeUrl2","genderActive");
        modelAndView.addObject("theme",theme);
        modelAndView.addObject("manCount",manCount);
        modelAndView.addObject("womCount",(list.size() - manCount));
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/chart/gender");

        return modelAndView;
    }

    @GetMapping("/admin/degree")
    public ModelAndView degreeChart(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        Theme theme = (Theme) httpSession.getAttribute("theme");
        List<EyeInfo> list = eyeInfoService.queryEyeInfoByName("%");
        Integer[] leftDegree = {0,0,0,0,0,0};
        Integer[] rightDegree = {0,0,0,0,0,0};
        for (EyeInfo e : list) {
           if(e.getDegreeLeft() <= 100) {
               leftDegree[0]++;
           } else if (e.getDegreeLeft() <= 200) {
               leftDegree[1]++;
           } else if(e.getDegreeLeft() <= 300) {
               leftDegree[2]++;
           } else if(e.getDegreeLeft() <= 400) {
               leftDegree[3]++;
           } else if(e.getDegreeLeft() <= 500) {
               leftDegree[4]++;
           } else {
               leftDegree[5]++;
           }
            if(e.getDegreeRight() <= 100) {
                rightDegree[0]++;
            } else if (e.getDegreeRight() <= 200) {
                rightDegree[1]++;
            } else if(e.getDegreeRight() <= 300) {
                rightDegree[2]++;
            } else if(e.getDegreeRight() <= 400) {
                rightDegree[3]++;
            } else if(e.getDegreeRight() <= 500) {
                rightDegree[4]++;
            } else {
                rightDegree[5]++;
            }
        }

        modelAndView.addObject("pageTopBarInfo","统计分析");
        modelAndView.addObject("activeUrl1","chartActive");
        modelAndView.addObject("activeUrl2","degreeActive");
        modelAndView.addObject("theme",theme);
        modelAndView.addObject("leftDegree", leftDegree);
        modelAndView.addObject("rightDegree", rightDegree);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/chart/degree");

        return modelAndView;
    }
}
