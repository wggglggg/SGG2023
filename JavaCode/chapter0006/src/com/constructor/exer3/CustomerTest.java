package com.constructor.exer3;

/**
 * ClassName: CustomerTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 15:23
 * @Version 1.0
 */
public class CustomerTest {
    public static void main(String[] args) {

        Customer JaneSmith = new Customer("Jane","Smith");
        JaneSmith.setAccount(new Account(1000, 2000, 0.0123));

        System.out.println(JaneSmith.getAccount().getId());
        System.out.println(JaneSmith.getFirstName());
        System.out.println(JaneSmith.getLastName());

        //  成功存入 ：100.0
        //  成功取出：960.0
        //  余额为2000元
        //  余额不足，取款失败

        JaneSmith.getAccount().deposit(100);
        JaneSmith.getAccount().withdraw(960);
        JaneSmith.getAccount().withdraw(2000);
    }
}
