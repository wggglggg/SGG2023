package com.generic.exer1;

import java.util.Objects;

/**
 * ClassName: Employee
 * Description:
 * 1. 定义一个Employee类。
 *    该类包含：private成员变量name,age,birthday，其中 birthday 为 MyDate 类的对象；
 *    并为每一个属性定义 getter, setter 方法；
 *    并重写 toString 方法输出 name, age, birthday
 * @Author wggglggg
 * @Create 2023/4/20 16:49
 * @Version 1.0
 */
public class Employee implements Comparable<Employee>{
    private String name;
    private int age;
    private MyDate birthday;

    public Employee() {
    }

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }

    @Override
    public int compareTo(Employee o) {
        int ageCompare = this.getAge() - o.getAge();
        if (ageCompare != 0) {
            return ageCompare;
        } else {
            return this.name.compareTo(o.name);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(birthday, employee.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthday);
    }
}
