package com.jobhunter.admin;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.jobhunter.admin.dao.mapper")
public class JobHunterAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(JobHunterAdminApplication.class,args);
    }
}
