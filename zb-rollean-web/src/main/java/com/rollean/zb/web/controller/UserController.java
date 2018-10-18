package com.rollean.zb.web.controller;

import com.alibaba.fastjson.JSON;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Slf4j
@Controller
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





}
