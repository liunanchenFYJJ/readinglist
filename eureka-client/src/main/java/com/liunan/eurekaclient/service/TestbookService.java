package com.liunan.eurekaclient;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

//@FeignClient("eureka-provider")
public interface TestbookService {
//    String test();

    @RequestMapping("/book")
    String test1();
}
