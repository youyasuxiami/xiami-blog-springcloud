package com.xiami.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class RestTemplateConfiguration {

    @Bean
    //负载均衡服务，这时候服务提供者需要启动两个（通过不同的端口）
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}