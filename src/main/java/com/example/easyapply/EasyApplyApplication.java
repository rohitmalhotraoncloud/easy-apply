package com.example.easyapply;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication

@EnableFeignClients
public class EasyApplyApplication {

    public static void main(String[] args) {
        SpringApplication.run(EasyApplyApplication.class, args);
    }

}
