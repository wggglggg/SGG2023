package com.wggglgggtop;

import com.sun.source.tree.BreakTree;

/**
 * ClassName: RecurionTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/18 14:44
 * @Version 1.0
 */
public class RecurionTest {
    public static void main(String[] args) {

        RecurionTest test = new RecurionTest();

        System.out.println(test.getSum(100));
        System.out.println(test.getSum1(100));

        double n = 100;
        System.out.println(test.getMul(n));
    }

    /**
     * 举例1：计算1-100内自然数的总和
     * @param num 大于0的整数
     * @return 总和
     * 方法一
     */
    public int getSum(int num) {
        int sum = 0;
        for (int i = 1; i <= num; i++) {
            sum += i;
        }
        return sum;
    }

    /**
     * num = 10 , (num-1) + num
     * @param num 大于0的整数
     * @return 总和
     */
    public int getSum1(int num) {
        if (num == 1) {
            return 1;
        }else {
            return getSum1(num -1) + num;
        }
    }

    public double getMul(double num) {
        if (num == 1) {
            return 1;
        }else {
            return num * getMul(num - 1);
        }
    }
}
