package com.polymorphism.exer1;

/**
 * ClassName: MyRectangle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 9:08
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject {

    private double width;
    private double height;

    public MyRectangle(double width, double height, double weight, String color) {
        super(color, weight);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double findArea() {
        return width * height;
    }
}
