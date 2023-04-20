package com.inherited.exer2;

/**
 * ClassName: CylinderTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 10:14
 * @Version 1.0
 */
public class CylinderTest {
    public static void main(String[] args) {

        Cylinder cylinder = new Cylinder();

        System.out.println(cylinder.findVolume());

        cylinder.setRadius(2.5);
        cylinder.setLength(5);
        System.out.println(cylinder.findVolume());


    }
}
