package cn.ksling.examination.controller;

import cn.ksling.examination.entity.FacialFeaturesInfo;
import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.FacialFeaturesInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

// 五官科信息
@RestController
public class FacialFeatureInfoController {
    @Autowired
    private FacialFeaturesInfoService facialFeaturesInfoService;

    @GetMapping("/admin/facialFeatures/{pageNum}/{pageSize}")
    public ModelAndView toFacialFeaturesInfo(@PathVariable("pageNum") Integer pageNum,
                                             @PathVariable("pageSize") Integer pageSize,
                                             @RequestParam(value = "name",required = false) String name,
                                             HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<FacialFeaturesInfo> list = facialFeaturesInfoService.queryFacialFeaturesInfoByName(name);
        PageInfo<FacialFeaturesInfo> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("facialFeaturesInfoPageInfo",pageInfo);
        modelAndView.addObject("facialFeaturesInfoList", list);
        modelAndView.addObject("activeUrl1","infoActive");
        modelAndView.addObject("activeUrl2","facialFeaturesInfoActive");
        modelAndView.addObject("pageTopBarInfo","各科体检信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/info/facialFeaturesInfo");

        return modelAndView;
    }

    @PutMapping("/admin/editFacialFeaturesInfo")
    public Msg editFacialFeaturesInfo(FacialFeaturesInfo facialFeaturesInfo) {
        Integer res = facialFeaturesInfoService.editFacialFeaturesInfoByEntity(facialFeaturesInfo);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }
}
