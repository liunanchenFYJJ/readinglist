package com.liunan.readinglist.controller;

import com.liunan.readinglist.entity.Book;
import com.liunan.readinglist.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class ApiController {
    @Autowired
    private BookService bookService;

    @GetMapping("test")
    public String test() {
        return "test success!";
    }

    @GetMapping("book")
    public Book getBookById() {
        Book book = new Book();
        book.setId(127L);
        return bookService.getBookById(book);
    }
}
