package com.example.mybatispractice;

import com.example.mybatispractice.config.MyBatisConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
@Import(MyBatisConfig.class)
public class MyBatisPracticeApplication {

    public static void main(String[] args) {
        SpringApplication.run(MyBatisPracticeApplication.class, args);
    }

}
