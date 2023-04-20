package com.polymorphism;

/**
 * ClassName: Woman
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/26 19:13
 * @Version 1.0
 */
public class Woman extends Person{
    boolean isBeauty;

    public void eat(){
        System.out.println("Woman应该少吃，减肥");
    }

    public void walk(){
        System.out.println("Woman窈窕的走路");
    }

    public void goShopping(){
        System.out.println("Woman喜欢逛街...");
    }
    public void drink () {
        System.out.println("Woman在喝酒");
    }
}
