package org.example.application;

import com.dtflys.forest.springboot.annotation.ForestScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @description: TODO 类描述
 * @author: 杨振宇
 * @date: 2024/07/30 20:20
 **/
@ForestScan(basePackages = "org.example.application.remoteClient")
@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
