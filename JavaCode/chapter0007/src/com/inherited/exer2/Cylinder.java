package com.inherited.exer2;

/**
 * ClassName: Cylinder
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 10:01
 * @Version 1.0
 */
public class Cylinder extends Circle{
    private double length;

    public Cylinder () {
        this.length = 1;
    }

    public double getLength () {
        return length;
    }
    public void setLength (double length) {
        this.length = length;
    }

    public double findVolume () {
        return findArea() * length;
    }
}
