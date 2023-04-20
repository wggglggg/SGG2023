package com.wggglggg.top.encapsulation.exer2;

/**
 * ClassName: Book
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/19 9:53
 * @Version 1.0
 */
public class Book {
    private String bookName;
    private String author;
    private int price;

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String n) {
        bookName = n;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String a) {
        author = a;
    }

    public void setPrice(int p) {
        price = p;
    }

    public int getPrice() {
        return price;
    }

    public String bookInfo() {
//        return "Bookname: " + bookName +
//                "Author: " + author +
//                "Price: " + price;
        return "Book-name: %s, Author: %s, Price: %d"
                .formatted(bookName, author, price);
    }
}
