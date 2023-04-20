package com.constructor.exer1;

/**
 * ClassName: Student
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/20 14:53
 * @Version 1.0
 */
public class Student {

    private String name;
    private int age;
    private String school;
    private String major;

    Student(String n, int a) {
        name = n;
        age = a;
    }
    Student(String n, String s) {
        name = n;
        school = s;
    }
    Student(String n, int a, String s, String m) {
        name = n;
        age = a;
        school = s;
        major = m;
    }

    public void getInfo() {
        System.out.println("%s".formatted(name));
        System.out.println("%d".formatted(age));
        System.out.println("%s".formatted(school));
        System.out.println("%s".formatted(major));
    }
}
