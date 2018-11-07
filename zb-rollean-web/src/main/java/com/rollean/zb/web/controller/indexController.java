package com.rollean.zb.web.controller;

import com.rollean.zb.common.annotation.NoLogin;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequestMapping(value = "/home")
public class indexController {

    @Autowired
    private UserRepository userRepository;

    @NoLogin
    @RequestMapping("/index")
    public String queryByName() {
        return "home/login";
    }

    @NoLogin
    @RequestMapping("/login")
    public String login(String userName, String userPassword,HttpSession httpSession) {
        User loginUser = userRepository.loginQuery(userName,userPassword);
        if(loginUser != null){
            log.info("登陆成功" + loginUser.getNickname());
            httpSession.setAttribute("loginUser",loginUser);
            return "redirect:/requirement/requirementList";
        }
        return "home/login";
    }

    @RequestMapping("/logout")
    public String logout(HttpSession httpSession) {
        httpSession.removeAttribute("loginUser");
        return "home/login";

    }



}
