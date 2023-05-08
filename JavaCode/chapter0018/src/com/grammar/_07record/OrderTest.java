package com.grammar._07record;

import org.junit.Test;

import java.util.HashSet;

/**
 * ClassName: OrderTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/8 19:39
 * @Version 1.0
 */
public class OrderTest {
    @Test
    public void test1(){
        Order order = new Order(1, "胡萝卜炖羊肉");
        Order1 order1 = new Order1(2, "韭菜鸡蛋");

        //测试toString()
        System.out.println(order1); // Order1[orderID=2, orderName=韭菜鸡蛋]

        //测试getter()
        System.out.println(order1.orderID());   // 2
        System.out.println(order1.orderName()); // 韭菜鸡蛋

        //测试equals()
        System.out.println(order1.equals(order));   // false

        Order1 order2 = new Order1(2, "韭菜鸡蛋");
        System.out.println(order1.equals(order2));  // true

        //测试hashCode()和equals()
        HashSet<Order1> set = new HashSet<>();
        set.add(order1);
        set.add(order2);                // 只能加进去一个
        System.out.println(set);        // [Order1[orderID=2, orderName=韭菜鸡蛋]]
    }

    /**
     * Person文件的父类为class java.lang.Record
     */
    @Test
    public void test2(){
        Class<Person> clazz = Person.class;
        System.out.println(clazz.getSuperclass());      // class java.lang.Record
    }
}
