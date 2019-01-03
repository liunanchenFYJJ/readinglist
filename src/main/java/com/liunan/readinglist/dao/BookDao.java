package com.liunan.readinglist.dao;


import com.liunan.readinglist.entity.Book;

public interface BookDao {
    Book getBookById(String id);
}
