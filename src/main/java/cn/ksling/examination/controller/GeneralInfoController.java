package cn.ksling.examination.controller;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.service.GeneralInfoService;
import cn.ksling.examination.service.ThemeService;
import cn.ksling.examination.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

// 基本信息
@RestController
public class GeneralInfoController {
    @Autowired
    private GeneralInfoService generalInfoService;
    @Autowired
    private UserService userService;
    @Autowired
    private ThemeService themeService;

    @GetMapping("/admin/general/{pageNum}/{pageSize}")
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
        modelAndView.addObject("pageTopBarInfo","各科体检信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/info/generalInfo");

        return modelAndView;
    }

    @PutMapping("/admin/editGeneralInfo")
    public Msg editGeneralInfo(GeneralInfo generalInfo) {
        Integer res = generalInfoService.editGeneralInfoByEntity(generalInfo);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @DeleteMapping("/admin/removeGeneralInfo/{id}")
    public Msg removeGeneralInfo(@PathVariable("id") Integer id) {
        Integer res = generalInfoService.removeGeneralInfoById(id);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @GetMapping("/verifyNo/{no}")
    public Msg verifyNo(@PathVariable("no") Integer no) {
        GeneralInfo generalInfo = generalInfoService.queryGeneralInfoByNo(no);
        if (null == generalInfo) {

            return Msg.fail();
        }

        return Msg.success();
    }

    @PostMapping("/admin/addGeneralInfoByEntity")
    public Msg addGeneralInfoByEntity(GeneralInfo generalInfo, EyeInfo eyeInfo, FacialFeaturesInfo facialFeaturesInfo, InternalInfo internalInfo, SurgeryInfo surgeryInfo, ResultInfo resultInfo) {
        String[] other = eyeInfo.getOther().split(",");
        String[] physicianOpinion = eyeInfo.getPhysicianOpinion().split(",");
        eyeInfo.setOther(other[0]);
        eyeInfo.setPhysicianOpinion(physicianOpinion[0]);
        facialFeaturesInfo.setOther(other[1]);
        facialFeaturesInfo.setPhysicianOpinion(physicianOpinion[1]);
        internalInfo.setOther(other[2]);
        internalInfo.setPhysicianOpinion(physicianOpinion[2]);
        surgeryInfo.setOther(other[3]);
        surgeryInfo.setPhysicianOpinion(physicianOpinion[3]);
        String username = generalInfo.getNo().toString();
        Integer res = generalInfoService.addGeneralInfoByEntity(generalInfo,eyeInfo,facialFeaturesInfo,internalInfo,surgeryInfo,resultInfo);
        if (1 == res) {

            User user = new User();
            Theme theme = new Theme();
            user.setUsername(username);
            user.setPassword("83ab62dd6f6d8a2c858e8764cb128b9e");
            user.setRole(3);
            user.setStatus(0);
            userService.addUserByEntity(user);
            theme.setUsername(username);
            theme.setHeaderBg("default");
            theme.setLogoBg("default");
            theme.setSidebarBg("default");
            theme.setSiteTheme("default");
            themeService.addUserThemeByTheme(theme);

            return Msg.success();
        }

        return Msg.fail();
    }

    // 日期格式化
    @InitBinder
    public void initBinder(ServletRequestDataBinder binder){
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));
    }
}
