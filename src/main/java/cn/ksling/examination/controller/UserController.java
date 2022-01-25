package cn.ksling.examination.controller;

import cn.ksling.examination.entity.*;
import cn.ksling.examination.service.ThemeService;
import cn.ksling.examination.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpSession;
import java.util.List;

// 用户信息
@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @Autowired
    private ThemeService themeService;

    @GetMapping("/admin/user/{pageNum}/{pageSize}")
    public ModelAndView toUserInfo(@PathVariable("pageNum") Integer pageNum,
                                   @PathVariable("pageSize") Integer pageSize,
                                   @RequestParam(value = "name",required = false) String name,
                                   HttpSession session) {
        ModelAndView modelAndView = new ModelAndView();
        PageHelper.startPage(pageNum, pageSize);
        List<User> list = userService.queryUserByName(name);
        PageInfo<User> pageInfo =new PageInfo<>(list, 5);
        Theme theme = (Theme) session.getAttribute("theme");

        modelAndView.addObject("userInfoPageInfo",pageInfo);
        modelAndView.addObject("userInfoList", list);
        modelAndView.addObject("activeUrl1","userActive");
        modelAndView.addObject("activeUrl2","userInfoActive");
        modelAndView.addObject("pageTopBarInfo","用户信息");
        modelAndView.addObject("name", name);
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/user/userInfo");

        return modelAndView;
    }

    @DeleteMapping("/admin/removeUserById/{id}")
    public Msg removeUser(@PathVariable("id") Integer id) {
        Integer res = userService.removeUserById(id);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @GetMapping("/verifyUsername/{username}")
    public Msg verifyUsername(@PathVariable("username") String username) {
        User user = userService.queryUserByUsername(username);
        if (null == user) {

            return Msg.fail();
        }

        return Msg.success();
    }

    @PostMapping("/admin/addUserByEntity")
    public Msg addUserByEntity(User user) {
        SimpleHash hash = new SimpleHash("md5", user.getPassword(), "ksl", 2);
        user.setPassword(hash.toString());
        user.setRole(2);
        user.setStatus(0);
        Integer res = userService.addUserByEntity(user);
        if (1 == res) {
            Theme theme = new Theme();
            theme.setUsername(user.getUsername());
            theme.setSiteTheme("default");
            theme.setLogoBg("default");
            theme.setHeaderBg("default");
            theme.setSidebarBg("default");
            themeService.addUserThemeByTheme(theme);

            return Msg.success();
        }

        return Msg.fail();
    }

    @PutMapping("/admin/editUserByEntity")
    public Msg editUserByEntity(User user) {
        Integer res = userService.editUserByEntity(user);
        if (1 == res) {

            return Msg.success();
        }

        return Msg.fail();
    }

    @GetMapping("/admin/editUserPwd")
    public ModelAndView editUserPwd(HttpSession httpSession) {
        ModelAndView modelAndView = new ModelAndView();
        Theme theme = (Theme) httpSession.getAttribute("theme");

        modelAndView.addObject("pageTopBarInfo","修改用户密码");
        modelAndView.addObject("activeUrl1","userActive");
        modelAndView.addObject("activeUrl2","editUserPwdActive");
        modelAndView.addObject("theme",theme);
        modelAndView.setViewName("/admin/user/editUserPwd");

        return modelAndView;
    }

    @PutMapping("/admin/editUserPwdByUsername")
    public Msg editUserPwdByUsername(String username, String password) {
        User user = userService.queryUserByUsername(username);
        if (null == user) {
            return Msg.fail();
        }
        SimpleHash hash = new SimpleHash("md5", password, "ksl", 2);
        user.setPassword(hash.toString());
        Integer res = userService.editUserByEntity(user);

        return Msg.success();
    }
}
