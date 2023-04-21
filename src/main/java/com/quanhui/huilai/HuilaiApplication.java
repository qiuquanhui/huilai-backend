package com.quanhui.huilai;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.quanhui.huilai.mapper")
public class HuilaiApplication {

    public static void main(String[] args) {
        SpringApplication.run(HuilaiApplication.class, args);
    }

}
