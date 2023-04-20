package com.singleton.exer1;

import org.junit.Test;

/**
 * ClassName: SingletonLazy
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/5 9:23
 * @Version 1.0
 */
public class SingletonLazy {
    private static int count = 0;
    private static SingletonLazy instance;

    private SingletonLazy() {
        count++;
    }

    // 单例懒汉模式，用时才使用
    public static SingletonLazy getInstance() {
        if (instance == null) {
            instance = new SingletonLazy();
        }
        return instance;
    }

    public int getCount() {
        return count;
    }
}
