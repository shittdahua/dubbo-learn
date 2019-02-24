package com.dubbo.consumer.ttconsumer.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {

    @RequestMapping("/consumer")
    public String demo() {
        return "Hello Consumer!";
    }
}
