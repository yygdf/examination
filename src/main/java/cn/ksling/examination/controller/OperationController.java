package cn.ksling.examination.controller;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;

@RestController
public class OperationController {
    @Autowired
    private ThemeService themeService;
    @Autowired
    private GeneralInfoService generalInfoService;
    @Autowired
    private EyeInfoService eyeInfoService;
    @Autowired
    private FacialFeaturesInfoService facialFeaturesInfoService;
    @Autowired
    private InternalInfoService internalInfoService;
    @Autowired
    private SurgeryInfoService surgeryInfoService;
    @Autowired
    private ResultInfoService resultInfoService;

    @GetMapping("/print")
    public ModelAndView print(@RequestParam(value = "no",required = false) Integer no, HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        User user = (User) httpSession.getAttribute("loginUser");
        Theme theme = themeService.queryThemeByUsername(user.getUsername());
        httpSession.setAttribute("theme", theme);
        GeneralInfo generalInfo = null;
        EyeInfo eyeInfo = null;
        FacialFeaturesInfo facialFeaturesInfo = null;
        InternalInfo internalInfo = null;
        SurgeryInfo surgeryInfo = null;
        ResultInfo resultInfo = null;
        String[] date = null;
        SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd");
        String dateTime = dateFm.format(new java.util.Date());
        if (null != no) {
            generalInfo = generalInfoService.queryGeneralInfoByNo(no);
            eyeInfo = eyeInfoService.queryEyeInfoByNo(no);
            facialFeaturesInfo = facialFeaturesInfoService.queryFacialFeaturesInfoByNo(no);
            internalInfo = internalInfoService.queryInternalInfoByNo(no);
            surgeryInfo = surgeryInfoService.querySurgeryInfoByNo(no);
            resultInfo = resultInfoService.queryResultInfoByNo(no);
            date = dateFm.format(generalInfo.getEntryTime()).split("-");
        }

        modelAndView.addObject("pageTopBarInfo","打印与导出");
        modelAndView.addObject("activeUrl1","operationActive");
        modelAndView.addObject("activeUrl2","printWordActive");
        modelAndView.addObject("generalInfo", generalInfo);
        modelAndView.addObject("eyeInfo", eyeInfo);
        modelAndView.addObject("facialFeaturesInfo", facialFeaturesInfo);
        modelAndView.addObject("internalInfo", internalInfo);
        modelAndView.addObject("surgeryInfo", surgeryInfo);
        modelAndView.addObject("resultInfo", resultInfo);
        modelAndView.addObject("no", no);
        modelAndView.addObject("theme",theme);
        modelAndView.addObject("date",date);
        modelAndView.setViewName("/admin/operation/printWord");

        return modelAndView;
    }
}
