package com.polymorphism.exer2;

/**
 * ClassName: Cat
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 9:43
 * @Version 1.0
 */
public class Cat extends Animal{
    public void eat(){
        System.out.println("猫吃鱼");
    }

    public void jump(){
        System.out.println("猫跳~~");
    }

    public void catchMouse(){
        System.out.println("猫抓老鼠");
    }
}
