package com.wggglggg.top.encapsulation.exer3;

/**
 * ClassName: Employee
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/19 10:23
 * @Version 1.0
 */
public class Employee {

    private String name;
    private int age;
    private char gender;
    private String phoneNumber;

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setGender(char g) {
        gender = g;
    }

    public char getGender() {
        return gender;
    }

    public void setAge(int a) {
        age = a;
    }

    public int getAge() {
        return age;
    }

    public void setPhoneNumber(String p) {
        phoneNumber = p;
    }
    public String getPhoneNumber(){
        return phoneNumber;
    }

    public String getInfo(){
        return "%s\t\t%c\t\t%d\t\t%s".formatted(name, gender,age, phoneNumber);
    }

}
