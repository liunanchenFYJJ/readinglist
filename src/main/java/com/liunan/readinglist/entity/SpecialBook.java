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
    public String getYourOwnBookName() {
        return "your custom book name is: " + super.getBookName();
    }

    /**
    
     *@描述 
    
     *@参数  double values
    
     *@返回值  最大值--largest
    
     *@创建人  liunanchenFYJJ@github
    
     *@创建时间  2019/1/15
    
     *@修改人和其它信息
    
     */
    public double max(double... values) {
        double largest = Double.NEGATIVE_INFINITY;
        for (double v: values) {
            if (v > largest) {
                largest = v;
            }
        }
        return largest;
    }

}
