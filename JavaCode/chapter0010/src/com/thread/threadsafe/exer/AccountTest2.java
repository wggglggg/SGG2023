package com.thread.threadsafe.exer;

/**
 * ClassName: AccountTest2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/10 20:05
 * @Version 1.0
 */
public class AccountTest2 {
    public static void main(String[] args) {
        Account2 account2 = new Account2();

        Customer2 customer2 = new Customer2(account2);

        Thread t1 = new Thread(customer2,"甲");
        Thread t2 = new Thread(customer2,"乙");

        t1.start();
        t2.start();

    }
}

class Account2 {
    private double balance;

    public void deposit(double amount) {
        synchronized (this) {
            balance += amount;
            System.out.println(Thread.currentThread().getName() + "余额有: " + balance);
        }

    }
}

class Customer2 implements Runnable{
    private Account2 account2;

    public Customer2(Account2 account2) {
        this.account2 = account2;
    }


    @Override
    public void run() {

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        for (int i = 0; i < 3; i++) {
            account2.deposit(1000);
        }
    }

}
