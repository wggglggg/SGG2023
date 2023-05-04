package com.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * ClassName: LambdaTest1
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/4 15:44
 * @Version 1.0
 */
public class LambdaTest1 {
    //语法格式一：无参，无返回值
    @Test
    public void test1(){
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("第4章 常用组件67");
            }
        };
        runnable.run();     // 第4章 常用组件67

        Runnable runnable1 = () -> System.out.println("Button也由View类派生而来");
        runnable1.run();    // Button也由View类派生而来
    }

    //语法格式二：Lambda 需要一个参数，但是没有返回值。
    @Test
    public void test2(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("点击事件的处理方法");   // 点击事件的处理方法

        Consumer<String> consumer1 = (String s) -> {
            System.out.println(s);
        };
        consumer1.accept("结束当前的活动页面");  // 结束当前的活动页面
    }

    //语法格式四：Lambda 若只需要一个参数时，参数的小括号可以省略
    @Test
    public void test3(){
        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("结束当前的活动页面");  // 结束当前的活动页面
    }

    //语法格式五：Lambda 需要两个或以上的参数，多条执行语句，并且可以有返回值
    @Test
    public void test4(){
        //1
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                System.out.println(o1);                     // 99
                System.out.println(o2);                     // 323
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare(99, 323));    // -1

        //2
        Comparator<Integer> comparator2 = (o1, o2) -> {
                System.out.println(o1);
                System.out.println(o2);
                return o1.compareTo(o2);
        };
        System.out.println(comparator2.compare(-3, 373));   // -1

    }

    //语法格式六：当 Lambda 体只有一条语句时，return 与大括号若有，都可以省略
    @Test
    public void test5(){
        Comparator<Integer> comparator = (o1, o2) -> {
            return o1.compareTo(o2);
        };
        System.out.println(comparator.compare(5,14));   //-1

        Comparator<Integer> comparator1 = (o1,o2) -> o1.compareTo(o2);
        System.out.println(comparator1.compare(904,392));// 1

        Comparator<Integer> comparator2 = Integer::compareTo;
        System.out.println(comparator2.compare(65,44)); // 1
    }

}
