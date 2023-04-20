package com._enum.exer1;

/**
 * ClassName: Bicycle2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 21:27
 * @Version 1.0
 */
public enum Bicycle2 {

    GIANT("Black"), MERIDA("Red"), PHOENIX("Blue");
    private String color;
    private Bicycle2(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Bicycle2{" +
                "color='" + color + '\'' +
                '}';
    }
}
