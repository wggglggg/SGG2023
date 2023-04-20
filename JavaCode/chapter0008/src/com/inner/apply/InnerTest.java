package com.inner.apply;

/**
 * ClassName: InnerTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 14:37
 * @Version 1.0
 */
public class InnerTest {
    public static void main(String[] args) {

        Car toyota = new Car();
        Car.Logo logo = toyota.new Logo("Toyota Logo");




//        Car.Logo toyotaLogo = toyota.new Logo("Toyota Logo");
        System.out.println(logo.getLogo_Name());


    }
}
