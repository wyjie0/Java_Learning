package com.gongbing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = {"com.gongbing.*"})
@MapperScan(basePackages = {"com.gongbing.dao"})
@SpringBootApplication
public class MybatisStudy01Application {

    public static void main(String[] args) {
        SpringApplication.run(MybatisStudy01Application.class, args);
    }

}
