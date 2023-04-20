package com.polymorphism.exer3;

/**
 * ClassName: Person
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 10:29
 * @Version 1.0
 */
class Person {
    protected String name="person";
    protected int age=50;
    public String getInfo() {
        return "Name: "+ name + "\n" +"age: "+ age;
    }
}