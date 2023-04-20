package com._interface.exer3;

/**
 * ClassName: Vehicle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/31 9:47
 * @Version 1.0
 */
abstract public class Vehicle {

    private String brand;
    private String color;

    public Vehicle () {}
    public Vehicle (String brand, String color) {
        this.brand = brand;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    abstract public void run();

}
