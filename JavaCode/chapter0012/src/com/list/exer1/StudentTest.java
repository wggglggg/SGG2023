package com.list.exer1;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * ClassName: StudentTest
 * Description:
 *      案例：键盘录入学生信息，保存到集合List中。
 *
 *
     * (1) 定义学生类，属性为姓名、年龄，提供必要的getter、setter方法，构造器，toString()，equals()方法。
     *
     * (2) 使用ArrayList集合，保存录入的多个学生对象。
     *
     * (3) 循环录入的方式，1：继续录入，0：结束录入。
     *
     * (4) 录入结束后，用foreach遍历集合。
 * @Author wggglggg
 * @Create 2023/4/16 19:37
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args) {


    }

    // (2) 使用ArrayList集合，保存录入的多个学生对象。
    @Test
    public void test1(){
        List list = new ArrayList();
        Scanner scan = new Scanner(System.in);

        System.out.println("--------请录入学生的信息------");

        while(true) {
            System.out.print("1: 继续录入， 0：结束录入");
            int input = scan.nextInt();

            if (input == 0) {
                break;
            }
            System.out.print("请输入学生姓名：");
            String name = scan.next();
            System.out.print("请输入学生年龄：");
            int age = scan.nextInt();
            list.add(new Student(name, age));


        }
        for (Object student : list) {
            System.out.println(student.toString());
        }

        scan.close();
    }

    @Test
    public void test2(){
        List list = new ArrayList();
        Scanner scanner = new Scanner(System.in);

        System.out.println("--------请录入学生的信息------");
        while(true) {
            System.out.print("1: 继续录入， 0：结束录入");
            int input = scanner.nextInt();
            if (input == 0) {
                break;
            }
            if (input == 1) {
                System.out.print("请输入学生姓名：");
                String name = scanner.next();
                System.out.print("请输入学生年龄：");
                int age = scanner.nextInt();

                list.add(new Student(name, age));
            }
        }

        for (Object stu: list) {
            System.out.println(stu);
        }
    }
}
