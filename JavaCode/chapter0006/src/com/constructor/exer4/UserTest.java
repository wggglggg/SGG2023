package com.constructor.exer4;

import java.security.PublicKey;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 16:06
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {
        User u1 = new User();
        System.out.println(u1.age); // 10

        User u2 = new User(20);
        System.out.println(u2.age);
        u2.age = 3;

    }
}

class User {


    String name;
    int age = 10;

    public User (){

    }
    public User (int a) {
        age = a;
    }
}
