package com.liunan.eurekaclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class api {


//    @Autowired
//    private Testbook testbook;

    @GetMapping("test")
    public String test() {
        return "index";
//        return testbook.test1();
    }
}
