package com.cqtest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 启动spring
 * 关于simple-robot的配置信息，使用配置文件的形式写在 application.properties中。
 * 注意，目前来讲，simple-robot暂时无法使用yml格式的配置。
 */
@SpringBootApplication
public class RunApplication {
    public static void main(String[] args) {
        SpringApplication.run(RunApplication.class, args);
    }
}
