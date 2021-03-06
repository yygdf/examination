package cn.ksling.examination.controller;

import cn.ksling.examination.entity.EyeInfo;
import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.EyeInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

// 眼科信息
@RestController
public class EyeInfoController {
    @Autowired
    private EyeInfoService eyeInfoService;

    @GetMapping("/admin/eye/{pageNum}/{pageSize}")
    public ModelAndView toEyeInfo(@PathVariable("pageNum") Integer pageNum,
                                  @PathVariable("pageSize") Integer pageSize,
                                  @RequestParam(value = "name",required = false) String name,
                                  HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<EyeInfo> list = eyeInfoService.queryEyeInfoByName(name);
        PageInfo<EyeInfo> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("eyeInfoPageInfo",pageInfo);
        modelAndView.addObject("eyeInfoList", list);
        modelAndView.addObject("activeUrl1","infoActive");
        modelAndView.addObject("activeUrl2","eyeInfoActive");
        modelAndView.addObject("pageTopBarInfo","各科体检信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/info/eyeInfo");

        return modelAndView;
    }

    @PutMapping("/admin/editEyeInfo")
    public Msg editEyeInfo(EyeInfo eyeInfo) {
        Integer res = eyeInfoService.editEyeInfoByEntity(eyeInfo);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }
}
