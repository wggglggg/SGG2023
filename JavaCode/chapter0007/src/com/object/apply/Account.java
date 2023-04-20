package com.object.apply;

/**
 * ClassName: Account
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 20:44
 * @Version 1.0
 */
public class Account {
    private double balance;

    public Account () {}

    public Account (double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Account account = (Account) o;
        return this.balance == account.balance;


    }
}
