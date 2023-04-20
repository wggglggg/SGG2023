package com.singleton.exer1;

import org.junit.Test;

/**
 * ClassName: LazyTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:36
 * @Version 1.0
 */
public class LazyTest{
    @Test
    public  void test1(){
        SingletonLazy instance = SingletonLazy.getInstance();
        System.out.println(instance.getCount());
    }

}