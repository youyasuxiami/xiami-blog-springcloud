package com.xiami.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {

    @Autowired
    private RestTemplate restTemplate;

    //开启熔断器注解，参数内是熔断方法名
    @HystrixCommand(fallbackMethod = "hiError")
    public String sayHi(String message) {
        //参数一：服务名 参数二：返回的数据类型
        return restTemplate.getForObject("http://xiami-blog-springcloud-service-admin/hi?message=" + message, String.class);
    }

    //自定义熔断方法，等待熔断的时候被调用
    public String hiError(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}