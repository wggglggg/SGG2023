package com.wrapper.exer1;

import org.junit.Test;

import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName: WrapperTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/3 10:03
 * @Version 1.0
 */
public class WrapperTest {

    @Test
    public void test1(){
        // 1.创建Vector对象：Vector v=new Vector();
        Vector v = new Vector();

        Scanner scan = new Scanner(System.in);

        int maxScore = 0;


        //2. 从键盘获取多个学生成绩，存放到v中 （以负数代表输入结束）
        while (true) {

            System.out.print("请依次输入成绩: ");
            int intScore = scan.nextInt();
            // 如果用户输入负数，退出while循环
            if (intScore < 0) {
                break;
            }
            // 从int 装箱成  object
            v.addElement(intScore);

            if (maxScore < intScore){
                maxScore = intScore;
            }
        }

        System.out.println();
        System.out.println("最高分：" + maxScore);

        //4. 依次获取v中的每个学生成绩，与最高分进行比较，获取学生等级，并输出

        for (int i = 0; i < v.size(); i++) {
            // 提出出来后是一个Object类型
            Object objScore = v.elementAt(i);
            int score = (Integer) objScore;

            char grade = ' ';
            if (maxScore - score <= 10) {
                grade = 'A';
            } else if (maxScore - score <= 20){
                grade = 'B';
            } else if (maxScore - score <= 30){
                grade = 'C';
            } else {
                grade = 'D';
            }

            System.out.println("student " + i +" score is " + score + " grade is " + grade);

        }
        scan.close();
    }
}
