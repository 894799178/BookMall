package com.webbookmall.handle;

import com.webbookmall.domain.User;
import com.webbookmall.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;


@Controller
public class Login {

    @Autowired
    private LoginService loginService;

    @RequestMapping("/Login")
    public String login(@RequestParam("user") String userName, @RequestParam("password") String password,HttpServletRequest req){
        if(userName!=null){
            if(password!= null){
                User user = loginService.getUser(userName);
                if(user!=null){
                    if(user.getPassword().equals(password)){
                        return "succeed";
                    }
                }
            }
        }
        req.setAttribute("error","帐号密码错误或帐号密码为空");
        return "error";
    }
}
