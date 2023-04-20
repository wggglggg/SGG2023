package com._this.exer2;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 9:53
 * @Version 1.0
 */
public class Customer {
    private String firstName;   // 名
    private String lastName;    // 姓
    private Account account;    // 账号

    // 构造器
    public Customer(String f, String l) {
        firstName = f;
        lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }

    public Account getAccount() {
        return account;
    }
    public void setAccount(Account acct) {
        account = acct;
    }
}
