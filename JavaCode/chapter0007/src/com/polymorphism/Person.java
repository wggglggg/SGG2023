package com.polymorphism;

/**
 * ClassName: Person
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/26 19:13
 * @Version 1.0
 */
public class Person {

    String name;
    int age;
    int id = 1001;

    private Pet pet;

    public void eat() {
        System.out.println("Person人吃饭");

    }
    public void walk () {
        System.out.println("Person走路");
    }

    public void drink () {
        System.out.println("Person在喝酒");
    }

    public void adopt (Pet pet) {
        this.pet = pet;
    }
}
