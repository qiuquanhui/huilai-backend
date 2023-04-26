package com.quanhui.huilai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@MapperScan("com.quanhui.huilai.mapper")
@EnableScheduling
public class HuilaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuilaiApplication.class, args);
    }

}
