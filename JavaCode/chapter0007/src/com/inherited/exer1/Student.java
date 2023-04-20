package com.inherited.exer1;

/**
 * ClassName: Student
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 9:30
 * @Version 1.0
 */
public class Student extends Person{
    long number;
    int math;
    int english;
    int computer;

    public Student (String n, char s, int a, long k, int m, int e, int c) {
//        super();
        name = n;
        sex = s;
        age = a;
        this.number = k;
        this.math = m;
        this.english = e;
        this.computer = c;

    }



}
