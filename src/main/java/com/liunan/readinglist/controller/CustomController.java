package com.liunan.readinglist.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class CustomController {

    @RequestMapping("hh")
    public String test() {
        return "readingList";
    }
}
