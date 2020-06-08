package com.hc.git;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.hc.git.mapper")
public class DemoMapperApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoMapperApplication.class, args);
    }

}
