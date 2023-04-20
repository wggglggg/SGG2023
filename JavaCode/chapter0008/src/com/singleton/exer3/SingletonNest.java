package com.singleton.exer3;

/**
 * ClassName: SingletonNest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:47
 * @Version 1.0
 */
public class SingletonNest {
    private static int count = 0;

    private SingletonNest(){
        count++;
    }
    private static class SingtonHold{
        private static SingletonNest instance = new SingletonNest();
    }

    public static SingletonNest getInstance() {
        return SingtonHold.instance;
    }

    public int getCount() {
        return count;
    }
}
