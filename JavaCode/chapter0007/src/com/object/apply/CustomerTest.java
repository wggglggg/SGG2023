package com.object.apply;

/**
 * ClassName: CustomerTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 20:45
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {
        Customer c1 = new Customer("Tom", 22, new Account(1000));
        Customer c2 = new Customer("Tim", 22, new Account(1000));
        Customer c3 = new Customer("Tom", 22, new Account(1000));

        System.out.println(c1.equals(c2));
        System.out.println();
        System.out.println(c1.equals(c3));
        System.out.println(c1);
        System.out.println(c3);
    }




}
