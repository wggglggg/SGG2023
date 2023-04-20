package com.wggglgggtop;

/**
 * ClassName: ValueTransferTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/17 15:06
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args) {
        //1. 基本数据类型的局部变量
        int a = 10;
        int b = 20;  //传递的是数据值

        System.out.println("a = " + a + ", b = " + b);
        a++;
        System.out.println("a = " + a + ", b = " + b);   //  a = 10, b = 20 a = 11, b = 20


        //2. 引用数据类型的局部变量
        //2.1 数组类型, 将arr1数组赋给了arr2,其实是内存地址，结果就是共用一个地址
        int[] arr1 = new int[] {1,2,3,4,5};
        int[] arr2 = arr1;

        arr2[0] = 5;    // 共用一个地址,其实arr1也修改了
        System.out.println(arr1[0]);        // arr1[0] = 5

        //2.2 对象类型
        // 实例一个order1对象， 记住如果将对象赋值给另一个对象，结果就是共用一个地址
        Order order1 = new Order();
        order1.orderId = 333;
        // 实例一个order2对象
        Order order2 = order1;
        order2.orderId = 222;

        System.out.println(order1.orderId); // 共用一个地址,改order2也就改动了order1.

    }
}

class Order {
    int orderId;
}
