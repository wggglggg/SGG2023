package com.objectstream;

import java.io.Serializable;

/**
 * ClassName: Person
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/29 14:52
 * @Version 1.0
 */
public class Person implements Serializable {
    private String name;
    private int age;

    private static final long serialVersionUID = 4684616546416845542L;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
