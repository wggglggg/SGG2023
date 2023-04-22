package com.generic.selfdefine.apply;

import java.sql.Date;

/**
 * ClassName: Customer
 * Description:
 *
 *  ORM思想(object relational mapping)
 *  数据库中的一个表 与 Java中的一个类对应
 *  表中的一条记录  与 Java类的一个对象对应
 *  表中的一个字段（或列） 与 Java类的一个属性（或字段）对应
 * @Author wggglggg
 * @Create 2023/4/22 10:20
 * @Version 1.0
 */
public class Customer {
    int id;
    String name;
    String email;
    Date birth;

    public Customer() {
    }

    public Customer(int id, String name, String email, Date birth) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.birth = birth;
    }
}
