package com.xiaohua;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xiaohua.mapper")
public class Application {
    public static void main(String[] args) {
        System.out.println("hello world");
        System.setProperty("pagehelper.banner", "false");
        SpringApplication.run(Application.class, args);
    }
}