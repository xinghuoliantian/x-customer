package com;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@MapperScan("com.gcfw.*.mapper")
public class XCustomerApplication {
    public static void main(String[] args) {

        SpringApplication.run(XCustomerApplication.class);
    }

}
