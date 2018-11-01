package com.rollean.zb.web;

import com.rollean.zb.domain.BasicContext;
import com.rollean.zb.service.InitDateService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * Created by rollean.
 */
@Slf4j
@Component
public class InitApplicationRunner implements ApplicationRunner{


    @Autowired
    private InitDateService initDateService;

    @Override
    public void run(ApplicationArguments applicationArguments) throws Exception {
        log.info("==============开始初始化数据==============");


        initDateService.initDate();


        System.out.println(BasicContext.skillList.size());

        log.info("==============初始化数据完成==============");
    }
}
