package com.springcssapipolicy.controller;

import com.springcssapipolicy.config.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RefreshScope
@RestController
class PolicyController {

    @Autowired
    Config config;

    @GetMapping("/config")
    public Config config() {
        return config;
    }
}