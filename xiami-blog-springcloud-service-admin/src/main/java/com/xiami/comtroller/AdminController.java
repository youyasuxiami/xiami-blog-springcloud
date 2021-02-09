package com.xiami.comtroller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description：
 *
 * @version v1.0.0
 * @author：zj
 * @date：2021­02­08 11:59
 */
@RestController
public class AdminController {

    @Value("${server.port}")
    private String port;

    @RequestMapping(value = "/hi", method = RequestMethod.GET)
    public String sayHi(String message) {
        return String.format("调用服务提供者，Hi，your message is : %s i am from port : %s", message, port);
    }
}
