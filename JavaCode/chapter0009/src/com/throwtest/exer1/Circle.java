package com.throwtest.exer1;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 14:44
 * @Version 1.0
 */
public class Circle {
    private double radius;

    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return "Circle { " +
                "radius = " +
                radius + " }";
    }
}
