package com.singleton.exer2;

import org.junit.Test;

/**
 * ClassName: HungryTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:41
 * @Version 1.0
 */
public class HungryTest {


    @Test
    public void test1(){
        SingletonHungry instance;
        for (int i = 0; i < 3; i++){
            instance = SingletonHungry.getInstance();
            System.out.println(instance.getCount());

        }
    }


}
