package com._super;

/**
 * ClassName: CheckAccount
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 16:48
 * @Version 1.0
 */
public class CheckAccount extends Account{

    private double overdraft;



    public CheckAccount (int id, double balance, double annualInterestRate, double overdraft) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
    }

    public double getOverdraft() {
        return overdraft;
    }
    public void setOverdraft(double overdraft) {
        this.overdraft = overdraft;
    }

    public void withdraw (double amount) {
        if (amount <= getBalance()) {
            super.withdraw(amount);
        } else if (getBalance() + overdraft > amount) {
            overdraft -= amount - getBalance();
            super.withdraw(getBalance());
        } else {
            System.out.println("超过可透支限额");
        }
    }

}
