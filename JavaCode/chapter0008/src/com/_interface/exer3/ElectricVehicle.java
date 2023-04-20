package com._interface.exer3;

/**
 * ClassName: ElectricVehicle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/31 9:50
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower, IPower2 {

    public ElectricVehicle () {}
    public ElectricVehicle (String brand, String color) {
        super(brand, color);
    }

    @Override
    public void run() {
        System.out.println("电能驱动电动交通工具");

    }

    @Override
    public void power() {
        System.out.println("有电才能行驶");
    }

    @Override
    public void pump() {
        System.out.println("IPower1 电动气泵");
    }

    //    public void washWindow() {
//        System.out.println("ElectricVehicle washWindow");
//    }


}
