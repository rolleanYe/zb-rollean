package com.rollean.zb.web.controller;

import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequestMapping(value = "/home")
public class indexController {

    @Autowired
    private UserRepository userRepository;

    @GetMapping("/index")
    public String queryByName() {

        return "home/login";

    }



}
