package com.rollean.zb.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * 程序启动入口
 *
 * @author yejun
 */
@SpringBootApplication
@ComponentScan("com.rollean.zb")
@MapperScan("com.rollean.zb.dal.mapper")
public class ZbApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZbApplication.class, args);
    }


}
