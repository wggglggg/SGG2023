package com._enum.apply2;

/**
 * ClassName: EmployeeTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 21:10
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args) {

        Employee e1 = new Employee("小明", 22, Status.BUSY);

        System.out.println(e1);
    }
}
