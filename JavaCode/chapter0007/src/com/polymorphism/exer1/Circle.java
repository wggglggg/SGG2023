package com.polymorphism.exer1;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 9:07
 * @Version 1.0
 */
public class Circle extends GeometricObject {

    private double radius;

    public Circle(double radius, String color, double weight) {
        super(color, weight);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double findArea() {
        return Math.PI * radius * radius;
    }
}
