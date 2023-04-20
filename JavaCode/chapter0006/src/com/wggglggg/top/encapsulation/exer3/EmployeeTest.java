package com.wggglggg.top.encapsulation.exer3;

import java.util.Scanner;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/19 10:23
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee[] emp = new Employee[2];

        Scanner input = new Scanner(System.in);

        for (int i = 0; i < emp.length; i++) {
            emp[i] = new Employee();

            System.out.println("-------------添加第" + (i + 1) + "个员工---------------");
            System.out.print("姓名：");
            String name = input.next();
            System.out.print("性别：");
            char gender = input.next().charAt(0);
            System.out.print("年龄：");
            int age = input.nextInt();
            System.out.print("电话：");
            String phoneNumber = input.next();

            emp[i].setName(name);
            emp[i].setAge(age);
            emp[i].setGender(gender);
            emp[i].setPhoneNumber(phoneNumber);
        }

        System.out.println("-------------员工列表---------------");
        System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话");
        for (int i = 0; i < emp.length; i++) {
            System.out.print(i + 1+"\t\t");
            System.out.println(emp[i].getInfo());
        }

        System.out.println("-------------员工列表结束------------");

    }
}
