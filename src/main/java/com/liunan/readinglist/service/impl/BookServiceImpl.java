package com.liunan.readinglist.service.impl;

import com.liunan.readinglist.dao.BookDao;
import com.liunan.readinglist.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "BookService")
public class BookServiceImpl implements com.liunan.readinglist.service.impl.BookService {
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBookById(Book book) {
        Book book2 = new Book();
        book2.setId(127L);
        Book book1 = bookDao.getBookById(book2);
        return book1;
    }
}
