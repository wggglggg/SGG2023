package com.object.tostring.exer;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 9:43
 * @Version 1.0
 */
public class Circle extends GeometricObject{

    private double radius;

    public Circle() {
//        this.color = "white";
//        this.weight = 1.0;
        this.radius = 1.0;
    }

    public Circle(double radius) {
        System.out.println("Circle 一参构造 radius");
        this.radius = radius;
    }


    public Circle(String color, double weight, double radius) {
        super(color, weight);
        System.out.println("Circle 三参构造 ");

        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o instanceof Circle) {
            Circle circle = (Circle) o;
            return this.radius == circle.radius;
        }
        return false;
    }

    public String toString() {
        return "Circle include { radius = " + this.radius + "}";

    }
}
