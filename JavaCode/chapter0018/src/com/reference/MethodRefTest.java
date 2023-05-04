package com.reference;

import com.reference.data.Employee;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: MethodRefTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/4 16:20
 * @Version 1.0
 */

/**
 * 方法引用的使用
 * Created by shkstart.
 */
public class MethodRefTest {
    // 情况一：对象 :: 实例方法
    //Consumer中的void accept(T t)
    //PrintStream中的void println(T t)
    @Test
    public void test1(){
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        consumer.accept("1 正常完整写法");        //1 正常完整写法

        Consumer<String> consumer1 = s -> System.out.println(s);
        consumer1.accept("2 Lambda表达示写法");  //2 Lambda表达示写法

        Consumer<String> consumer2 = System.out::println;
        consumer1.accept("3 方法引用");         //3 方法引用
    }

    //Supplier中的T get()
    //Employee中的String getName()
    @Test
    public void test2(){
        Employee MaHuaTen = new Employee(1001, "马化腾", 34, 6000.38);
        Supplier<String> supplier = new Supplier<String>() {
            @Override
            public String get() {
                return MaHuaTen.getName();
            }
        };
        System.out.println(supplier.get());     // 马化腾

        Supplier<String> supplier1 = () -> MaHuaTen.getName();
        System.out.println(supplier.get());     // 马化腾

        Supplier<String> supplier2 = MaHuaTen::getName;
        System.out.println(supplier.get());     // 马化腾
    }

    // 情况二：类 :: 静态方法
    //Comparator中的int compare(T t1,T t2)
    //Integer中的int compare(T t1,T t2)
    @Test
    //1
    public void test3(){
        Comparator<Integer> comparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1, o2);
            }
        };

        //2
        Comparator<Integer> comparator1 = (o1, o2) -> Integer.compare(o1,o2);

        //3. 方法引用
        Comparator<Integer> comparator2 = Integer::compare;
    }

    //Function中的R apply(T t)
    //Math中的Long round(Double d)
    @Test
    public void test4(){
        //1
        Function<Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double aDouble) {
                return Math.round(aDouble);
            }
        };
        System.out.println(function.apply(3.1415926));  // 3

        //2
        Function<Double, Long> function1 = aDouble -> Math.round(aDouble);
        System.out.println(function.apply(3.1415926));  // 3

        //3.方法引用
        Function<Double, Long> function2 = Math::round;
        System.out.println(function.apply(3.1415926));  // 3
    }

    // 情况三：类 :: 实例方法 (难)
    // Comparator中的int comapre(T t1,T t2)
    // String中的int t1.compareTo(t2)
    @Test
    public void test5(){
        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        };
        System.out.println(comparator.compare("Lilly", "Lucy"));    // -12

        Comparator<String> comparator1 = (o1, o2) -> o1.compareTo(o2);
        System.out.println(comparator.compare("Lilly", "Lucy"));    // -12

        Comparator<String> comparator2 = String::compareTo;
        System.out.println(comparator.compare("Lilly", "Lucy"));    // -12
    }

    //BiPredicate中的boolean test(T t1, T t2);
    //String中的boolean t1.equals(t2)
    @Test
    public void test6(){
        //1
        BiPredicate<String, String> biPredicate = new BiPredicate<String, String>() {
            @Override
            public boolean test(String s1, String s2) {
                return s1.equals(s2);
            }
        };
        System.out.println(biPredicate.test("Orange", "Apple"));    // false

        //2.
        BiPredicate<String, String> biPredicate1 = (s1, s2) -> s1.equals(s2);
        System.out.println(biPredicate.test("Orange", "Apple"));    // false

        //3. 方法引用
        BiPredicate<String, String> biPredicate2 = String::equals;
        System.out.println(biPredicate.test("Orange", "Apple"));    // false
    }

    // Function中的R apply(T t)
    // Employee中的String getName();
    @Test
    public void test7(){
        Employee MaHuaTen = new Employee(1001, "马化腾", 34, 6000.38);

        //1
        Function<Employee, String> function = new Function<Employee, String>() {
            @Override
            public String apply(Employee employee) {
                return employee.getName();
            }
        };
        System.out.println(function.apply(MaHuaTen));   // 马化腾

        //2.
        Function<Employee, String> function1 = employee -> employee.getName();
        System.out.println(function.apply(MaHuaTen));   // 马化腾

        //3.方法引用
        Function<Employee, String> function2 = Employee::getName;
        System.out.println(function.apply(MaHuaTen));   // 马化腾
    }
}
