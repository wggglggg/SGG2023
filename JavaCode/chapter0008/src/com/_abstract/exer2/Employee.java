package com._abstract.exer2;

/**
 * ClassName: Employee
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 9:08
 * @Version 1.0
 */
abstract public class Employee {
    private String name;
    private int number;
    private MyDate birthday;

    public Employee(){}
    public Employee(String name, int number, MyDate birthday) {
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }
    public void setName(MyDate birthday) {
        this.birthday = birthday;
    }

    abstract public double earnings();

    public String toString() {
        return "name: " + this.name + " ,number: " + this.number +
                " ,birthday: " + birthday.toDateString();
    }
}
