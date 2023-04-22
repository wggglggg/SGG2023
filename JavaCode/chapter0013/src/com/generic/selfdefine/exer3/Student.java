package com.generic.selfdefine.exer3;

import javax.swing.*;
import java.util.Objects;

/**
 * ClassName: Student
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/22 19:49
 * @Version 1.0
 */
public class Student<T> implements Comparable{
    private String name;
    private T score;

    public Student() {
    }

    public Student(String name, T score) {
        this.name = name;
        this.score = score;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getScore() {
        return score;
    }

    public void setScore(T score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student<?> student = (Student<?>) o;
        return Objects.equals(name, student.name) && Objects.equals(score, student.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", score=" + score +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        if (o == this){
            return 0;
        }
        Student s = (Student) o;
        return this.getName().compareTo(s.getName());

    }
}
