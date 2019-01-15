package com.liunan.readinglist.dao;

import com.liunan.readinglist.entity.Book;
import com.liunan.readinglist.entity.SpecialBook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void getBookById() {
        Book book = new Book(3L, "bb");
        System.out.println(book);
        SpecialBook specialBook = new SpecialBook();
        specialBook.setBookName("jhh");
        System.out.println(specialBook.getPrice());

//        SpecialBook specialBook = new SpecialBook(0L, "hh", 9.0);
//        specialBook.setPrice(4.5);
//        specialBook.setBookName("new book");
//        System.out.println(specialBook);
//        System.out.println(specialBook.getBookName());
    }
}