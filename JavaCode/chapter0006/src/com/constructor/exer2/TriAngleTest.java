package com.constructor.exer2;

/**
 * ClassName: TriAngleTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 15:10
 * @Version 1.0
 */
public class TriAngleTest {
    public static void main(String[] args) {

        TriAngle t1 = new TriAngle(4.5, 2.5);
        System.out.println(t1.calculatorArea());


        TriAngle t2 = new TriAngle();
        t2.setBase(6);
        t2.setHeight(3.7);
        System.out.println(t2.calculatorArea());

        //5.625
        //11.100000000000001
    }
}
