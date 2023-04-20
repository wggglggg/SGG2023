package com._interface.exer3;

/**
 * ClassName: Bicylcle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/31 9:47
 * @Version 1.0
 */
public class Bicycle extends Vehicle{

    public Bicycle () {}
    public Bicycle (String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("脚踩踏板驱动自行车");

    }
}
