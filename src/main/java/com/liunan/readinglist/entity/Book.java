package com.liunan.readinglist.entity;

import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Book implements Serializable {

    private static final long serialVersionUID = -979354230587311295L;
    private Long id;
    private String bookName;

    public String getYourOwnBookName() {
        return "your book name is: " + bookName;
    }

}
