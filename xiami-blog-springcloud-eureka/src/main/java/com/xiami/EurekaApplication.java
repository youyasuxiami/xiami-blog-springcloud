package com.xiami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­02­08 11:21
 */
@SpringBootApplication
//开启eureka服务端注解
@EnableEurekaServer
public class EurekaApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication.class,args);
    }
}
