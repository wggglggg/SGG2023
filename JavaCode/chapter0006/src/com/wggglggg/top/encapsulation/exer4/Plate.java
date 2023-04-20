package com.wggglggg.top.encapsulation.exer4;

/**
 * ClassName: Plate
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 9:41
 * @Version 1.0
 */
public class Plate {

    private String color;
    private double size;
    private double price;


    Plate() {

    }
    Plate(String newColor, double newSize) {
        color = newColor;
        size = newSize;
    }
    public void washPlate() {
        System.out.println("Washing");
    }

    public void getColor() {
        System.out.println(color);
    }


}
