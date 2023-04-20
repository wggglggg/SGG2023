package com.polymorphism.exer1;

/**
 * ClassName: GeometricTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 9:26
 * @Version 1.0
 */
public class GeometricTest {

    public static void main(String[] args) {
        Circle c1 = new Circle(3.7, "red", 0.8);
        Circle c2 = new Circle(7.1, "green", 0.2);

        double result;
        MyRectangle r1 = new MyRectangle(50, 30, 0.1, "black");

        System.out.println(c1.findArea());

        System.out.println(geometricFindArea(c1));
        result = geometricFindArea(new Circle(4.4, "white", 0.5));
        System.out.println("4.4    " + result);



    }

    public static double geometricFindArea(GeometricObject geometricObject) {
        return geometricObject.findArea();
    }
}
