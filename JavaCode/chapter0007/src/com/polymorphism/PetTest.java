package com.polymorphism;

/**
 * ClassName: PetTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/26 20:03
 * @Version 1.0
 */
public class PetTest {
    public static void main(String[] args) {

        Person p1 = new Person();

        Cat c1 = new Cat();
        c1.setNickname("麻叶");
        Dog d1 = new Dog();
        d1.setNickname("小铁");


        p1.adopt(d1);
        p1.adopt(c1);


    }
}
