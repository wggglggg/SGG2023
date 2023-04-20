package com._interface.exer2;

/**
 * ClassName: RectangleTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 15:26
 * @Version 1.0
 */
public class RectangleTest {
    public static void main(String[] args) {

        ComparableRectangle r1 = new ComparableRectangle(10, 20);
        ComparableRectangle r2 = new ComparableRectangle(10.3, 7.8);

        System.out.println(r1.toString());
        System.out.println(r1.findArea());
        System.out.println(r2.toString());
        System.out.println(r2.findArea());

        System.out.println("两个面积比较");
        System.out.println(r1.compareTo(r2));
    }
}
