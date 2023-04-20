package com._static.exer1;

/**
 * ClassName: Account
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 20:10
 * @Version 1.0
 */
public class Account {
    private int id;
    private  String password;
    private double balance;
    private static double interestRate ;
    private static double minBalance;
    private static int init_id = 1001;

    public Account () {
        this.id = init_id;
        this.password = "123456";
        this.balance = 0;
        interestRate = 0.0123;
        minBalance = 1;
        init_id++;
    }
    public Account(String password, double balance, double interestRate, double minBalance){
        this.id = init_id;
        this.password = password;
        this.balance = balance;
        Account.interestRate = 0.0123;
        Account.minBalance = 1;
        init_id++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    public String toString() {
        return "Account { id : " + this.id +
                " ,password : " + this.password +
                " ,balance : " + this.balance +
                " ,interestRate : " + Account.getInterestRate() +
                " ,minBalance : " + Account.getMinBalance() + " }";
    }
}
