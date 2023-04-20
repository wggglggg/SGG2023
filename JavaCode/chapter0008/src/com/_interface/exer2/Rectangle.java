package com._interface.exer2;

/**
 * ClassName: Rectangle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 15:14
 * @Version 1.0
 */
public class Rectangle {
    public double width;
    public double height;

    public Rectangle() {}
    public Rectangle(double width, double height) {
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

    public String toString() {
        return "Rectangle { " +
                " width: " + width +
                " height: " + height +
                " }";
    }
}
