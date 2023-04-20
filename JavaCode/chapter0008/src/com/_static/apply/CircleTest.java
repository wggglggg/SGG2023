package com._static.apply;

/**
 * ClassName: CircleTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 19:28
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle();
        System.out.println(c1);

        Circle c2 = new Circle();
        System.out.println(c2);

        Circle c3 = new Circle(3.2);
        System.out.println(c3);

        System.out.println(Circle.total);
    }
    

}
