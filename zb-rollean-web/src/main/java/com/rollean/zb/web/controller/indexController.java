package com.rollean.zb.web.controller;

import com.alibaba.fastjson.JSON;
import com.rollean.zb.common.annotation.NoLogin;
import com.rollean.zb.dal.mapper.TbUserMapper;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequestMapping(value = "/home")
public class indexController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private TbUserMapper tbUserMapper;

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

    @RequestMapping("/registerHome")
    public String registerHome(Model model) {
        model.addAttribute("user",new User());
        return "home/register";

    }

    @RequestMapping("/register")
    public String register(User user, Model model,HttpSession httpSession) {
        log.info("开始注册:" + JSON.toJSONString(user));

        try {
            userRepository.insertUser(user);
        }catch (DuplicateKeyException dupExp){
            log.warn("注册信息已被使用!!!");
            model.addAttribute("errorCont","注册信息已被使用!!!");
            model.addAttribute("user",user);
            return "home/register";
        }catch (Exception e){
            return "home/register";
        }

        log.info("注册成功" );
        user = userRepository.queryByName(user.getNickname());
        httpSession.setAttribute("loginUser", user);
        return "redirect:/requirement/requirementList";

    }


}
