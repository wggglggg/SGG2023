package com._interface.exer3;

/**
 * ClassName: Car
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/31 10:02
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    public String carNumber;

    public Car(String carNumber) {
        this.carNumber = carNumber;
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    @Override
    public void run() {
        System.out.println("汽油燃烧驱动Car行驶");
    }

    @Override
    public void power() {
        System.out.println("有电才能发动Car,动力来源汽油");
    }
}
