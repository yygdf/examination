package cn.ksling.examination.controller;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.service.*;
import cn.ksling.examination.utils.FtpUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.InputStream;
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
        Theme theme = (Theme) httpSession.getAttribute("theme");
        GeneralInfo generalInfo = null;
        EyeInfo eyeInfo = null;
        FacialFeaturesInfo facialFeaturesInfo = null;
        InternalInfo internalInfo = null;
        SurgeryInfo surgeryInfo = null;
        ResultInfo resultInfo = null;
        String[] date = null;
        SimpleDateFormat dateFm = new SimpleDateFormat("yyyy-MM-dd");
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

    @GetMapping("/upload")
    public ModelAndView upload(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        Theme theme = (Theme) httpSession.getAttribute("theme");

        modelAndView.addObject("pageTopBarInfo","上传头像");
        modelAndView.addObject("activeUrl1","operationActive");
        modelAndView.addObject("activeUrl2","uploadActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/operation/upload");

        return modelAndView;
    }

    @PostMapping("/uploadProfile")
    public Msg uploadProfile(MultipartFile file) {
        boolean flag = false;
        try {
            System.out.println(file);
            // 获取上传的文件流
            InputStream inputStream = file.getInputStream();
            // 获取上传的文件名
            String fileName = file.getOriginalFilename();
            // 截取文件名
            String prefix = fileName.substring(0,fileName.lastIndexOf("."));
            // 最终文件名
            String finalName = prefix + ".jpg";
            // 调用文件上传工具类
            FtpUtil.uploadFile(finalName, inputStream);
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (flag) {

            return Msg.success();
        }

        return Msg.fail();
    }
}
