package com.epam.bigdata201.appmaster;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

@EnableAutoConfiguration
public class AppMasterApplication {
    public static void main(String[] args) throws InterruptedException {
        Thread.currentThread().sleep(60000);
        SpringApplication.run(AppMasterApplication.class, args);
    }
}
