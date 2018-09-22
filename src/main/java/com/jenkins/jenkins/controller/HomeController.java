package com.jenkins.jenkins.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RequestMapping("/api/")
@RestController
public class HomeController {
    @RequestMapping("/hellow")
    public String home () {
        //test
        return "hi";
    }
}
