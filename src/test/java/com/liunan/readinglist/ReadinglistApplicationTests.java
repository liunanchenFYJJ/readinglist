package com.liunan.readinglist;

import com.liunan.readinglist.dao.BookDao;
import com.liunan.readinglist.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ReadinglistApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void getBookById() {
        Book book1 = new Book();
        book1.setId(128L);
        System.out.println(book1);
        Book book = bookDao.getBookById(book1);
        System.out.println(book.getBookName());
    }
}

