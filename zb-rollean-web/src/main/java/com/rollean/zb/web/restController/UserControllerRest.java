package com.rollean.zb.web.restController;

import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping(value = "/rest/user")
public class UserControllerRest {

    @Autowired
    private UserRepository userRepository;

    @RequestMapping(value = "/queryByName", method = RequestMethod.GET)
    public User queryByName(String name) {
        log.info("查询用户开始:" + name );
        return userRepository.queryByName(name);
    }



}
