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
import java.util.ArrayList;
import java.util.List;

@RestController
public class OperationController {
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

        modelAndView.addObject("pageTopBarInfo","???????????????");
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

        modelAndView.addObject("pageTopBarInfo","????????????");
        modelAndView.addObject("activeUrl1","operationActive");
        modelAndView.addObject("activeUrl2","uploadActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/operation/upload");

        return modelAndView;
    }

    @PostMapping("/uploadProfile")
    public Msg uploadProfile(List<MultipartFile> files) {
        boolean flag = false;
        List<String> finalNames = new ArrayList<>();
        List<InputStream> inputStreams = new ArrayList<>();
        try {
            for (MultipartFile f : files) {
                finalNames.add(f.getOriginalFilename().substring(0,f.getOriginalFilename().lastIndexOf("."))+".jpg");
                inputStreams.add(f.getInputStream());
            }
//            // ????????????????????????
//            InputStream inputStream = files.get(0).getInputStream();
//            // ????????????????????????
//            String fileName = files.get(0).getOriginalFilename();
//            // ???????????????
//            String prefix = fileName.substring(0,fileName.lastIndexOf("."));
//            // ???????????????
//            String finalName = prefix + ".jpg";
            // ???????????????????????????
            FtpUtil.uploadFiles(finalNames, inputStreams);
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
