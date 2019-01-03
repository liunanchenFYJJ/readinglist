package com.liunan.readinglist;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
@MapperScan("com.liunan.readinglist.dao")
public class ReadinglistApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(ReadinglistApplication.class);
    }

    // 负责启动引导应用程序
    public static void main(String[] args) {
        SpringApplication.run(ReadinglistApplication.class, args);
    }

    public static class Book {
    }
}

