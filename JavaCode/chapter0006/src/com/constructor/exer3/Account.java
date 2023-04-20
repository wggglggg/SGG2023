package com.constructor.exer3;

/**
 * ClassName: Account
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 15:22
 * @Version 1.0
 */
public class Account {

    private int id;
    private double balance;
    private double annualInterestRate;  // 年利率

    public Account (int i, double b, double a){
        id = i;
        balance = b;
        annualInterestRate = a;
    }

    public int getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void setId(int i){
        id = i;
    }

    public void setBalance(double b){
        balance = b;
    }

    public void setAnnualInterestRate(double a){
        annualInterestRate = a;
    }

    // 存钱
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("成功存入：" + amount);
        }

    }

    // 取钱
    public void withdraw(double amount){
        if (balance >= amount){
            balance -= amount;
            System.out.println("取款成功");
        } else {
            System.out.println("余额不足，提款失败");
        }

    }
}
