package com.wggglgggtop;

/**
 * ClassName: Circle
 * Description:
 *      1. 定义一个Circle类，包含一个double型的radius属性代表圆的半径，
 *                                  一个findArea()方法返回圆的面积。
 * @Author wggglggg
 * @Create 2023/3/17 19:31
 * @Version 1.0
 */
public class Circle {

    double radius;

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
