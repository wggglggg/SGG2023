package com.inherited.exer2;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 10:01
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle () {
        this.radius = 1;
    }

    public double getRadius () {
        return radius;
    }
    public void setRadius (double radius) {
        this.radius = radius;
    }

    // 计算圆的面积
    public double findArea() {
        return 3.14 * radius * radius;
    }
}
