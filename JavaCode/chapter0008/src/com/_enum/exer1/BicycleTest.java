package com._enum.exer1;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName: BicycleTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 21:19
 * @Version 1.0
 */
public class BicycleTest {
//    public static void main(String[] args) {
//
//        System.out.println(Bicycle1.Merida.name());  // Merida
//        for (Bicycle1 b: Bicycle1.values()){
//            System.out.println(b);
//        }
//
//        for (Bicycle2 bick : Bicycle2.values()) {
//            System.out.println(bick);
//        }
//
//    }


    @Test
    public void test() {
        System.out.println("test");
    }

    @Test
    public void test2(){
        System.out.println("test2");
        Scanner scan = new Scanner(System.in);

        System.out.print("请输入数字 ：");
        int num = scan.nextInt();
        System.out.println(num);
    }

}
