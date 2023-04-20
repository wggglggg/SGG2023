package com.wggglggg.top.encapsulation.exer2;

/**
 * ClassName: BookTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/19 10:19
 * @Version 1.0
 */
public class BookTest {
    public static void main(String[] args) {

        Book b = new Book();

        b.setBookName("第一行代码Android-第三版");
        b.setAuthor("郭霖");
        b.setPrice(49);

        System.out.println(b.bookInfo());

    }
}
