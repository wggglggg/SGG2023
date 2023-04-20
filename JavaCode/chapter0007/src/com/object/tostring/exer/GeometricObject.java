package com.object.tostring.exer;

import java.lang.reflect.GenericDeclaration;

/**
 * ClassName: GeometricObject
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 9:43
 * @Version 1.0
 */
public class GeometricObject {
    protected String color;
    protected double weight;

    protected GeometricObject() {
        this.color = "white";
        this.weight = 1.0;
        System.out.println("Geo父类空参构造方法");
    }

    protected GeometricObject(String color) {
        this.color = "white";
        this.weight = 1.0;
        System.out.println("Geo父类一参color构造方法");
    }
    protected GeometricObject(String color, double weight) {
        this.color = color;
        this.weight = weight;
        System.out.println("Geo父类两参构造方法");
    }

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
}
