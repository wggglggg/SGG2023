package com.singleton.exer3;

import org.junit.Test;

/**
 * ClassName: NestTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:55
 * @Version 1.0
 */
public class NestTest {
    @Test
    public void test1(){
        SingletonNest instance;
        for (int i = 0; i < 3; i++) {
            instance = SingletonNest.getInstance();
            System.out.println(instance.getCount());
        }


    }
}
