package com.thread.threadsafe.exer;

import static java.lang.Thread.currentThread;

/**
 * ClassName: AccountTest
 * Description:
 *      银行有一个账户。
 *
 *  有两个储户分别向同一个账户存3000元，每次存1000，存3次。每次存完打印账户余额。
 *  问题：该程序是否有安全问题，如果有，如何解决？
 *
 *  【提示】
 *  1，明确哪些代码是多线程运行代码，须写入run()方法
 *  2，明确什么是共享数据。
 *  3，明确多线程运行代码中哪些语句是操作共享数据的。
 * @Author wggglggg
 * @Create 2023/4/10 16:53
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account account = new Account();
        Customer c1 = new Customer(account, "甲");
        Customer c2 = new Customer(account, "乙");

        c1.start();
        c2.start();
    }

}

class Customer extends Thread{
    private Account account;

    public Customer(Account account, String name){
        super(name);
        this.account = account;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for (int i = 0; i < 3; i++) {
            account.deposit(1000);

        }
    }
}

class Account{
    private double balance;

    public synchronized void deposit(double amount) {

        balance += amount;
        System.out.println(Thread.currentThread().getName() + "余额有: " + balance);
    }
}

