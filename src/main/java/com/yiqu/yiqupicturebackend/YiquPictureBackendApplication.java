package com.yiqu.yiqupicturebackend;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yiqu.yiqupicturebackend.mapper")
public class YiquPictureBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(YiquPictureBackendApplication.class, args);
    }

}
