package com.inherited.exer1;

/**
 * ClassName: Mankind
 * Description:
 *      练习 ：
 * (1)定义一个 ManKind 类，包括
 * • 成员变量 int sex 和 int salary；
 * • 方法 void manOrWoman()：根据 sex 的值显示“man”(sex==1)或者“woman”(sex==0)；
 * • 方法 void employeed()：根据 salary 的值显示“no job”(salary==0)或者
 * “ job”(salary!=0)。
 * (2)定义类 Kids 继承 ManKind，并包括
 * • 成员变量 int yearsOld；
 * • 方法 printAge()打印 yearsOld 的值。
 * (3)定义类 KidsTest，在类的 main 方法中实例化 Kids 的对象 someKid，用该对
 * 象访问其父类的成员变量及方法。
 * @Author wggglggg
 * @Create 2023/3/25 9:39
 * @Version 1.0
 */
public class ManKind {
    private int sex;
    private int salary;

    public ManKind() {}
    public ManKind (int sex, int salary) {
        this.sex = sex;
        this.salary = salary;
    }

    public int getSex() {
        return sex;
    }
    public void setSex (int sex) {
        this.sex = sex;
    }

    public int getSalary () {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void manOrWoman() {
        if (sex == 1) {
            System.out.println("a Man");
        } else if (sex == 0) {
            System.out.println("a Woman");
        }
    }

    public void employeed() {
        if (salary == 0) {
            System.out.println("no job");
        } else {
            System.out.println("have a job");
        }
    }
}
