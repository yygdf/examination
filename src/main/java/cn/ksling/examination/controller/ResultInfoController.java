package cn.ksling.examination.controller;

import cn.ksling.examination.entity.InternalInfo;
import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.ResultInfo;
import cn.ksling.examination.entity.Theme;
import cn.ksling.examination.service.ResultInfoService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

// 体检结果
@RestController
public class ResultInfoController {
    @Autowired
    private ResultInfoService resultInfoService;

    @GetMapping("/result/{pageNum}/{pageSize}")
    public ModelAndView toResultInfo(@PathVariable("pageNum") Integer pageNum,
                                     @PathVariable("pageSize") Integer pageSize,
                                     @RequestParam(value = "name",required = false) String name,
                                     HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<ResultInfo> list = resultInfoService.queryResultInfoByName(name);
        PageInfo<ResultInfo> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("resultInfoPageInfo",pageInfo);
        modelAndView.addObject("resultInfoList", list);
        modelAndView.addObject("activeUrl1","infoActive");
        modelAndView.addObject("activeUrl2","resultInfoActive");
        modelAndView.addObject("pageTopBarInfo","各科体检信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/resultInfo");

        return modelAndView;
    }

    @PutMapping("/admin/editResultInfo")
    public Msg editResultInfo(ResultInfo resultInfo) {
        Integer res = resultInfoService.editResultInfoByEntity(resultInfo);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }
}
