package com._this.exer2;

/**
 * ClassName: Account
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 9:53
 * @Version 1.0
 */
public class Account {

    private double balance;

    public Account (double init_balance) {
        balance = init_balance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amt) {
        balance += amt;
    }

    public void withdraw(double amt) {
        if (balance >= amt && amt > 0) {
            balance -= amt;
            System.out.println("取款金额为：" + amt);
            System.out.println("取款成功，账户余额为：" + getBalance());
        } else {
            System.out.println("余额不足");
        }
    }
}
