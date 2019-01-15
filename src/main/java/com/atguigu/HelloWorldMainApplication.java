package com.atguigu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author zhangge
 * @date 2019/1/15 - 16:27
 */
@SpringBootApplication
public class HelloWorldMainApplication {
    public static void main(String[] args) {
        // spring 应用启动起来
        SpringApplication.run(HelloWorldMainApplication.class,args);
    }
}
