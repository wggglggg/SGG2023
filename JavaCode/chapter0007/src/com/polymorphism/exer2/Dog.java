package com.polymorphism.exer2;

/**
 * ClassName: Dog
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 9:43
 * @Version 1.0
 */
public class Dog extends Animal{
    public void eat(){
        System.out.println("狗吃骨头");
    }

    public void jump(){
        System.out.println("狗急跳墙");
    }

    public void watchDoor(){
        System.out.println("狗能看家");
    }
}