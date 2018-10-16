package com.rollean.zb.web.test;

import com.alibaba.fastjson.JSON;
import com.rollean.zb.domain.User;
import com.rollean.zb.service.repository.UserRepository;
import com.rollean.zb.web.ZbApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * 用户单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ZbApplication.class)
public class TestApplicationUser {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void test(){
        User user = userRepository.queryByName("yejun");
        System.out.println(JSON.toJSONString(user));

    }

}
