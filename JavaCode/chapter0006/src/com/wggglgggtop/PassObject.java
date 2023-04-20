package com.wggglgggtop;

/**
 * ClassName: PassObject
 * Description:
 *  2. 定义一个类PassObject，在类中定义一个方法printAreas()，该方法的定义如下：
 *      public void printAreas(Circle c, int time)
 *  3. 在printAreas方法中打印输出1到time之间的每个整数半径值，以及对应的面积。
 *     例如，time为5，则输出半径1，2，3，4，5，以及对应的圆面积。
 *
 * @Author wggglggg
 * @Create 2023/3/17 19:34
 * @Version 1.0
 */
public class PassObject {
    public static void main(String[] args) {
        PassObject obj = new PassObject();
        Circle circle = new Circle();

        obj.printAreas(circle, 5);
        System.out.println("now Radius is: " + circle.radius);

    }

    public void printAreas (Circle c, int time) {
        System.out.println("Radius\t\t\tArea");
        int i = 1;
        for (; i <= time; i++) {
            c.radius = i;
            System.out.println(c.radius + "\t\t\t\t" + c.findArea());
        }
        c.radius = i;
    }
}
