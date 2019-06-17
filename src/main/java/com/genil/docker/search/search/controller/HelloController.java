package com.genil.docker.search.search.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

/**
 * Created by Antony Genil on 2019-06-10 at 16 12 for search
 **/
@RestController
public class HelloController {
    @RequestMapping("/")
    public String sayHello() {
        return "Hello from Spring boot Docker app. Time is "+ LocalDateTime.now();
    }
}
