package com.rollean.zb.web.controller;

import com.alibaba.fastjson.JSON;
import com.rollean.zb.common.annotation.NoLogin;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;

@Slf4j
@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/user")
    public String queryByName(@RequestParam(name="name", required=false, defaultValue="yejun") String name, Model model) {
        log.info("查询用户开始:" + name );
        User user = userRepository.queryByName(name);
        log.info("查询结果:" + JSON.toJSONString(user));

        model.addAttribute("user", user);
        return "user/user";

    }

    @GetMapping(value = "/userCenter")
    public String userCenter(Model model, HttpSession httpSession){

        User currUser = (User) httpSession.getAttribute("loginUser");
        User user = userRepository.queryById(currUser.getId().toString());

        model.addAttribute("user",user);

        return "user/userBasic";
    }


    @RequestMapping(value = "/userInfo")
    public String userInfo(Model model, HttpSession httpSession){

        User currUser = (User) httpSession.getAttribute("loginUser");
        User user = userRepository.queryById(currUser.getId().toString());

        model.addAttribute("user",user);

        return "user/userBasic :: div001";

    }


    @RequestMapping(value = "/userEdit")
    public String userEdit(Model model, HttpSession httpSession){

        User currUser = (User) httpSession.getAttribute("loginUser");
        User user = userRepository.queryById(currUser.getId().toString());

        model.addAttribute("user",user);

        return "user/user_content :: userEdit";

    }




}
