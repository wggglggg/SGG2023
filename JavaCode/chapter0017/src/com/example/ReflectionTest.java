package com.example;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectionTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/1 17:15
 * @Version 1.0
 */
public class ReflectionTest {
    /*
     * 使用反射之前可以执行的操作, 一般情况下创建对象的操作
     * */
    @Test
    public void test1(){
        Person p1 = new Person();
        p1.age = 37;
        p1.show();
    }

    /*
     * 使用反射完成上述的操作
     * */
    @Test
    public void test2(){
        try {
            //1.创建Person类的实例
            Class clazz = Person.class;
            Person p1 = (Person) clazz.newInstance();

            //2.调用public属性
            Field age = clazz.getDeclaredField("age");
            age.set(p1, 37);
            Method show = clazz.getDeclaredMethod("show");

            System.out.println(age.get(p1));        // 37

            //3.调用方法
            show.invoke(p1);                        // 你好，我是一个Person
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test3(){
        try {
            //1. 调用私有的构造器，创建Person的实例
            //private Person(String name, int age)
            Class clazz = Person.class;

            Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);
            declaredConstructor.setAccessible(true);
            Person android = (Person) declaredConstructor.newInstance("Android", 12);

            //2. 调用私有的属性    要先setAccessible为true, 准许权限
            //private String name;
            Field name = clazz.getDeclaredField("name");
            name.setAccessible(true);
            name.set(android, "HMS");
            System.out.println(name.get(android));      // HMS

            //3. 调用私有的方法        要先setAccessible为true, 准许权限
            //private String showNation(String nation)
            Method showNation = clazz.getDeclaredMethod("showNation", String.class);
            showNation.setAccessible(true);
            String nation = (String) showNation.invoke(android, "CHN");
            System.out.println(nation);                 // 我的国籍是：CHN
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } catch (NoSuchFieldException e) {
            throw new RuntimeException(e);
        }
    }

}
