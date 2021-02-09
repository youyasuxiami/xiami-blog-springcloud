package com.xiami.service.hystrix;

import com.xiami.service.AdminService;
import org.springframework.stereotype.Component;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­02­09 10:30
 */
@Component
public class AdminServiceHystrix implements AdminService {

    @Override
    public String sayHi(String message) {
        return "Hi，your message is :\"" + message + "\" but request error.";
    }
}
