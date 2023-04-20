package com.singleton.exer2;

/**
 * ClassName: SingleHungry
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:37
 * @Version 1.0
 */
public class SingletonHungry {
    private static int count = 0;
    private static final SingletonHungry instance = new SingletonHungry();

    private SingletonHungry(){
        count++;
    }
    public static SingletonHungry getInstance() {
        return instance;
    }

    public int getCount() {
        return count;
    }
}
