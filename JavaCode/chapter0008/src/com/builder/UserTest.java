package com.builder;

import org.junit.Test;

/**
 * ClassName: UserTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:17
 * @Version 1.0
 */
public class UserTest {

    @Test
    public void test1(){
        User.Builder builder = new User.Builder();

        builder.setName("张三");
        builder.setPassword("3333");
        User user = builder.build();
        System.out.println(user.getName());
        System.out.println(user.getPassword());
    }
}
