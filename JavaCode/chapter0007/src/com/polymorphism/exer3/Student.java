package com.polymorphism.exer3;

/**
 * ClassName: Student
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/27 10:30
 * @Version 1.0
 */
class Student extends Person {
    protected String school="pku";
    public String getInfo() {
        return  "Name: "+ name + "\nage: "+ age
                + "\nschool: "+ school;
    }
}