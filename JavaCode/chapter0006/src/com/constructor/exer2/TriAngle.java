package com.constructor.exer2;

/**
 * ClassName: TriAngle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 15:10
 * @Version 1.0
 */
public class TriAngle {

    private double base;    // 底边长
    private double height;   // 高

    TriAngle() {

    }

    TriAngle(double b, double h) {
        base = b;
        height = h;
    }

    public void setBase(double b) {
        base = b;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getHeight() {
        return height;
    }

    /**
     * 计算三角形面积 高 * 底边长 / 2
     *
     * @return 三角形面积
     */
    public double calculatorArea() {
        return base * height / 2;
    }
}
