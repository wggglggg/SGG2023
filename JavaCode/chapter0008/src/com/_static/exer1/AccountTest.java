package com._static.exer1;

/**
 * ClassName: AccountTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 20:22
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {

        Account a1 = new Account("11111", 2000, 0.0111, 0.01);
        System.out.println(a1.toString());

        Account a2 = new Account();
        System.out.println(a2.toString());

        Account a3 = new Account();
        System.out.println(a3.toString());
    }
}
