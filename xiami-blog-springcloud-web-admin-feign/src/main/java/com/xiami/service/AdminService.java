package com.xiami.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­02­09 9:37
 */
@FeignClient(value = "xiami-blog-springcloud-service-admin")
public interface AdminService {

    @RequestMapping(value = "hi", method = RequestMethod.GET)
    String sayHi(@RequestParam(value = "message") String message);
}
