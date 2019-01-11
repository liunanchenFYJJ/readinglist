package com.liunan.eurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/")
public class ApiController {

//    @Bean
//    @LoadBalanced // 负载均衡
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @GetMapping("book")
    public String getBook() {
        String url = "http://localhost:8084/book";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, String.class);
    }

    /**
     * TODO: openfeign to use api from another server?
     */
}
