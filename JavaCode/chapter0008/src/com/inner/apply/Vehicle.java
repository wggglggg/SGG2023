package com.inner.apply;

/**
 * ClassName: Vehicle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 14:34
 * @Version 1.0
 */
abstract public class Vehicle {

    private String brand;
    private String color;

    public Vehicle() {}
    public Vehicle(String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    abstract public void run();
}
