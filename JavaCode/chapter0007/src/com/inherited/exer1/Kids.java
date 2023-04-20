package com.inherited.exer1;

/**
 * ClassName: Kids
 * Description:
 *      定义类 Kids 继承 ManKind，并包括
 * • 成员变量 int yearsOld；
 * • 方法 printAge()打印 yearsOld 的值。
 * @Author wggglggg
 * @Create 2023/3/25 9:48
 * @Version 1.0
 */
public class Kids extends ManKind{

    private int yearsOld;

    public Kids () {}

    public Kids (int yearsOld) {
        this.yearsOld = yearsOld;
    }

    public Kids  (int sex, int salary, int yearsOld) {
        setSex(sex);
        setSalary(salary);
        this.yearsOld = yearsOld;
    }
    public void printAge() {
        System.out.println("I am " + yearsOld + " years old.");
    }

    public void employeed() {
        System.out.println("Kids should study and no job.");
    }
}
