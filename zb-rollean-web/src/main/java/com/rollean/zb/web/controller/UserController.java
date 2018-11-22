package com.rollean.zb.web.controller;

import com.alibaba.fastjson.JSON;
import com.rollean.zb.common.annotation.NoLogin;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
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

        return "user/user_content :: userBasic";

    }


    @RequestMapping(value = "/userEdit")
    public String userEdit(Model model, HttpSession httpSession){

        User currUser = (User) httpSession.getAttribute("loginUser");
        User user = userRepository.queryById(currUser.getId().toString());
        model.addAttribute("user",user);

        return "user/user_content :: userEdit";

    }

    @RequestMapping(value = "/editSave")
    public String editSave(String nickname,String age,String userId,String gender, Model model, HttpSession httpSession){

        User currUser = (User) httpSession.getAttribute("loginUser");
        currUser = userRepository.queryById(currUser.getId().toString());
        model.addAttribute("user",currUser);

        log.info("开始修改用户信息: "+ nickname + "~" + age +"~"+ userId);
        User user = userRepository.queryById(userId);
        if(user.getNickname().equals(nickname) &&
                user.getAge()!=null && user.getAge().toString().equals(age) &&
                user.getGender()!=null && user.getGender().toString().equals(gender)){
            return "user/user_content :: userBasic";
        }

        if(!user.getNickname().equals(nickname)){
            User userTmp = userRepository.queryByName(nickname);
            if(userTmp != null){
                System.out.println("当前昵称已经被其他用户使用!!!");
                return "user/user_content :: userEdit";
            }
        }

        User userUpd = new User();
        userUpd.setId(new Integer(userId));
        userUpd.setNickname(nickname);
        userUpd.setAge(new Integer(age));
        userUpd.setGender(new Integer(gender));
        userRepository.updateUser(userUpd);

        currUser = userRepository.queryById(userId);
        httpSession.setAttribute("loginUser",currUser);

        model.addAttribute("user",currUser);

        return "user/user_content :: userBasic";

    }




}
