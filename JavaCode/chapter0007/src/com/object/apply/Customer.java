package com.object.apply;

import java.util.Objects;

/**
 * ClassName: Customer
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 20:45
 * @Version 1.0
 */
public class Customer {

    private int age;
    private String name;
    private Account acct;

    public Customer () {};

    public Customer (String name, int age, Account acct) {
        this.name = name;
        this.age = age;
        this.acct = acct;
    }

    public String getName() {
        return name;
    }
    public void setName( String name) {
        this.name = name;
    }

    public int getAge () {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public Account getAcct(Account acct) {
        return acct;
    }
    public void setAcct (Account acct) {
        this.acct = acct;
    }

//    public boolean equals (Object o) {
//        if (this == o) return true;
//        if (this.getClass() != o.getClass() || o == null) return false;
//        Customer customer = (Customer) o;
//        return this.age == customer.age && Objects.equals(this.name, customer.name)
//        && Objects.equals(this.acct, customer.acct);
//    }
}
