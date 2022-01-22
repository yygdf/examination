package cn.ksling.examination.controller;

import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.ResultInfo;
import cn.ksling.examination.entity.SurgeryInfo;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.SurgeryInfoService;
import cn.ksling.examination.service.ThemeService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

// 外科信息
@RestController
public class SurgeryInfoController {
    @Autowired
    private ThemeService themeService;
    @Autowired
    private SurgeryInfoService surgeryInfoService;

    @GetMapping("/surgery/{pageNum}/{pageSize}")
    public ModelAndView toSurgeryInfo(@PathVariable("pageNum") Integer pageNum,
                                      @PathVariable("pageSize") Integer pageSize,
                                      @RequestParam(value = "name",required = false) String name,
                                      HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<SurgeryInfo> list = surgeryInfoService.querySurgeryInfoByName(name);
        PageInfo<SurgeryInfo> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("surgeryInfoPageInfo",pageInfo);
        modelAndView.addObject("surgeryInfoList", list);
        modelAndView.addObject("activeUrl1","infoActive");
        modelAndView.addObject("activeUrl2","surgeryInfoActive");
        modelAndView.addObject("pageTopBarInfo","各科体检信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/surgeryInfo");

        return modelAndView;
    }

    @PutMapping("/admin/editSurgeryInfo")
    public Msg editSurgeryInfo(SurgeryInfo surgeryInfo) {
        Integer res = surgeryInfoService.editSurgeryInfoByEntity(surgeryInfo);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }
}
