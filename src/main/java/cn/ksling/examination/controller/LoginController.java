package cn.ksling.examination.controller;

import cn.ksling.examination.entity.Msg;
import cn.ksling.examination.entity.SysLog;
import cn.ksling.examination.service.SysLogService;
import cn.ksling.examination.service.UserService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;

/**
 * 有一个地方,只有你知道
 * https://ksling.cn
 *
 * @author KS
 * @date 2021/11/29 20:31
 */
@RestController
public class LoginController {
    @Autowired
    private SysLogService sysLogService;
    @Autowired
    private UserService userService;

    @PostMapping("/verifyLogin")
    public Msg verifyLogin(@RequestParam("username") String username, @RequestParam("password") String password, HttpServletRequest request) {
        Subject subject = SecurityUtils.getSubject();
        subject.logout();
        if (!subject.isAuthenticated()) {
            SimpleHash hash = new SimpleHash("md5", password, "ksl", 2);
            UsernamePasswordToken token = new UsernamePasswordToken(username, hash.toString());
            try {
                subject.login(token);
                subject.getSession().setAttribute("loginUser", userService.queryUserByUsername(username));
                SysLog sysLog = new SysLog();
                sysLog.setLoginName(username);
                sysLog.setLoginIp(request.getRemoteAddr());
                sysLog.setLoginTime(new Date());
                sysLogService.addSysLog(sysLog);
            } catch (UnknownAccountException | IncorrectCredentialsException e) {
                return Msg.fail();
            }
        }

        if(subject.hasRole("admin")) {
            return Msg.success().add("url", "/examination/admin/index");
        } else if (subject.hasRole("user")) {
            return Msg.success().add("url", "/examination/user/index");
        }

        return Msg.fail();
    }

    @GetMapping("/logout")
    public ModelAndView logout() {
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("/login");
        SecurityUtils.getSubject().getSession().stop();

        return modelAndView;
    }
}
