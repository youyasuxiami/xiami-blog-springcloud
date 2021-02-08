package com.xiami;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­02­08 11:37
 */
@SpringBootApplication
//开启eureka客户端注解
@EnableEurekaClient
public class ServiceAdminApplication {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdminApplication.class, args);
    }
}
