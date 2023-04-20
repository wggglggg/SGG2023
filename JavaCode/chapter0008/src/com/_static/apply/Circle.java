package com._static.apply;

/**
 * ClassName: Circle
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 19:28
 * @Version 1.0
 */
public class Circle {

    private double radius;
    private int id;
    private static int init_id = 1001;
    static int total ;

    public Circle () {
        this.radius = 1.0;
        this.id = init_id;
        init_id++;
        total++;
    };
    public Circle (double radius) {
        this();
        this.radius = radius;
    }

    public String toString() {
        return "Circle { radius = " +
                this.radius +
                ", id = " + id
                + " } ";
    }

}
