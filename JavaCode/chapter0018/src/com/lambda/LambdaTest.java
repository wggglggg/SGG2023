package com.lambda;

import org.junit.Test;

import java.util.Comparator;

/**
 * ClassName: LambdaTest
 * Description:
 *      Lambda表达式的使用举例
 * @Author wggglggg
 * @Create 2023/5/4 15:22
 * @Version 1.0
 */
public class LambdaTest {
    @Test
    public void test1(){
        //1 正常完整写法
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("4.1 启停活动页面");
            }
        };
        runnable.run();             // 4.1 启停活动页面

        //2 Lambda表达示写法
        Runnable runnable1 = () -> System.out.println("4.1 启停活动页面");
        runnable1.run();            // 4.1 启停活动页面

    }

    @Test
    public void test2(){
        //1 正常完整写法
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(99, 61)); // 1

        //2 Lambda表达示写法
        Comparator<Integer> comparator2 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator2.compare(848, 923));  // -1

        //3 方法引用
        Comparator<Integer> comparator3 = Integer::compare;
        System.out.println(comparator3.compare(6, 655));    // -1
    }

}
