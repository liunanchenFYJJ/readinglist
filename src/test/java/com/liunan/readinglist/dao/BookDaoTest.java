package com.liunan.readinglist.dao;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

public class BookDaoTest {
    @Autowired
    private BookDao bookDao;

    @Test
    public void getBookById() {
        System.out.println("test");
    }
}