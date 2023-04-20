package com._abstract.exer2;

import java.util.Scanner;

/**
 * ClassName: PayrollSystem
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 9:10
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Employee[] employees = new Employee[2];
        Scanner scan = new Scanner(System.in);

        employees[0] = new SalaredEmployee("Hair", 1001, new MyDate(1980, 3, 20),
                6500);

        employees[1] = new HourlyEmployee("Hisenses", 1002, new MyDate(1992, 3, 30),
                27.5, 176);

        System.out.print("请输入月份:");
        int month = scan.nextInt();
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].toString());

            if (month == employees[i].getBirthday().getMonth()) {
                System.out.println("生日快乐, 工资加100");
                System.out.println(employees[i].earnings() + 100);
            } else {
                System.out.println(employees[i].earnings());
            }
        }
    }
}
