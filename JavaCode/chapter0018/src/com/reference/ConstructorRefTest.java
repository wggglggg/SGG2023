package com.reference;

import com.reference.data.Employee;
import org.junit.Test;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * ClassName: ConstructorRefTest
 * Description:
 *              一、构造器引用
 *              二、数组引用
 * @Author wggglggg
 * @Create 2023/5/4 19:04
 * @Version 1.0
 */
public class ConstructorRefTest {
    //构造器引用
    //Supplier中的T get()
    @Test
    public void test1(){
        Supplier<Employee> supplier = new Supplier<Employee>() {
            @Override
            public Employee get() {
                return new Employee();      // Employee().....
            }
        };
        System.out.println(supplier.get()); // Employee{id=0, name='null', age=0, salary=0.0}

        Supplier<Employee> supplier1 = Employee::new;   // Employee().....
        System.out.println(supplier.get()); // Employee{id=0, name='null', age=0, salary=0.0}
    }

    //Function中的R apply(T t)
    @Test
    public void test2(){
        //1.
        Function<Integer, Employee> function = new Function<Integer, Employee>() {
            @Override
            public Employee apply(Integer id) {
                return new Employee(id);
            }
        };
        Employee employee1 = function.apply(7);
        System.out.println(employee1);  // Employee{id=7, name='null', age=0, salary=0.0}

        //2.构造器引用
        Function<Integer, Employee> function1 = Employee::new;
        Employee employee2= function.apply(7);
        System.out.println(employee1);  // Employee{id=7, name='null', age=0, salary=0.0}
    }

    //BiFunction中的R apply(T t,U u)
    @Test
    public void test3(){
        BiFunction<Integer, String, Employee> biFunction = new BiFunction<Integer, String, Employee>() {
            @Override
            public Employee apply(Integer id, String name) {
                return new Employee(id, name);
            }
        };
        System.out.println(biFunction.apply(8, "Lucy"));    // Employee{id=8, name='Lucy', age=0, salary=0.0}

        BiFunction<Integer, String, Employee> biFunction1 = Employee::new;
        System.out.println(biFunction.apply(8, "Lucy"));    // Employee{id=8, name='Lucy', age=0, salary=0.0}
    }

    //数组引用
    //Function中的R apply(T t)
    @Test
    public void test4(){
        Function<Integer, Employee[]> function = new Function<Integer, Employee[]>() {
            @Override
            public Employee[] apply(Integer length) {
                return new Employee[length];
            }
        };
        Employee[] employees1 = function.apply(5);
        System.out.println(employees1.length);          // 5

        Function<Integer, Employee[]> function1 = Employee[]::new;
        Employee[] employees2 = function.apply(15);
        System.out.println(employees2.length);          // 15
    }

}
