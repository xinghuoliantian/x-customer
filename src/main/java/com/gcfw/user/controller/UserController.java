package com.gcfw.user.controller;

import com.gcfw.common.vo.Result;
import com.gcfw.user.entity.User;
import com.gcfw.user.service.UserService;
import com.wf.captcha.utils.CaptchaUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    HttpSession session;
    @PostMapping("/login")
    public Result login(User param, @RequestParam("captcha") String captcha, HttpServletRequest request, HttpSession session)
    {
        //验证码判断
        if (!CaptchaUtil.ver(captcha, request)) {

            return Result.fail("验证码错误！");
        }

        User user=userService.login(param);
        if (user!=null){
            user.setPassword(null);
            session.setAttribute( "userInfo",user);

            return Result.success();
        }
        return Result.fail("登录失败！");

    }

}
