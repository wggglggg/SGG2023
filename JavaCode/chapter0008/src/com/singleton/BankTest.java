package com.singleton;

import java.util.Calendar;

/**
 * ClassName: BankTest
 * Description:
 *  饥饿方式
 * @Author wggglggg
 * @Create 2023/3/29 8:39
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank bank = Bank.getInstance();
        Calendar calender = Calendar.getInstance();
    }
}
// 饥饿方式
class Bank {

    private Bank () {}

    private static Bank instance = new Bank();

    public static Bank getInstance() {
        return instance;
    }
}
