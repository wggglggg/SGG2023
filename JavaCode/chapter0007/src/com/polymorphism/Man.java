package com.polymorphism;

/**
 * ClassName: Man
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/26 19:13
 * @Version 1.0
 */
public class Man extends Person{
    boolean isSmoking;

    public void eat() {
        System.out.println("Man多吃肉,长肌肉");
    }

    public void walk() {
        System.out.println("Man笔挺的走路");
    }

    public void earnMoney() {
        System.out.println("Man挣钱养家");
    }

    public void drink () {
        System.out.println("Man在喝酒");
    }
}
