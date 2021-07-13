package com.zktr.yuyi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
public class YuyiApplication {
    public static void main(String[] args) {
        SpringApplication.run(YuyiApplication.class, args);
    }
}
