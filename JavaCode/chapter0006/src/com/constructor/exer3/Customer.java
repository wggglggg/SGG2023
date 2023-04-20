package com.constructor.exer3;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 15:23
 * @Version 1.0
 */
public class Customer {

    private String firstName;
    private String lastName;

    private Account account;

    public Customer(String f, String l){
        firstName = f;
        lastName = l;
    }

    // 名字存入后，不能更改，所以没有setFirstName。。。。。等
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }

    public Account getAccount(){
        return account;
    }

    public void setAccount(Account a) {
        account = a;
    }

}
