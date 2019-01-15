package com.liunan.readinglist.entity;

import lombok.*;

@Data
@ToString(callSuper = true)
@EqualsAndHashCode(callSuper = true)
public class SpecialBook extends Book {
    private double price;

    public SpecialBook() {}
    public SpecialBook(Long i, String b, double price) {
        super(i, b);
        this.price = price;
    }

//    public SpecialBook(Long id, String bookName) {
//        super(id, bookName);
//    }

}
