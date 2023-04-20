package com.set.exer2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * ClassName: outPutTenNumbers
 * Description:
 *      案例：
 *          编写一个程序，获取10个1至20的随机数，要求随机数不能重复。并把最终的随机数输出到控制台。
 * @Author wggglggg
 * @Create 2023/4/18 9:21
 * @Version 1.0
 */
public class outPutTenNumbers {
    public static void main(String[] args) {

        Set set = OutputNumbers(1, 20);
        System.out.println(set);

    }

    public static Set OutputNumbers (int head, int tail) {
        Set set = new HashSet();

        while (set.size() < 20) {
            int num =(int) (Math.random() * (tail - head + 1) + head);
            set.add(num);
        }
        return set;
    }
}
