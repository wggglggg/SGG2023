package com._class;

import org.junit.Test;

import java.lang.annotation.ElementType;


/**
 * ClassName: ClassTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/1 17:50
 * @Version 1.0
 */
public class ClassTest {
    /**
     * 获取Class实例的几种方式(掌握前三种)
     */
    @Test
    public void test1(){
        Class clazz1 = null;
        Class clazz2 = null;
        Class clazz3 = null;
        Class clazz4 = null;

        try {
            //1.调用运行时类的静态属性：class
            clazz1 = User.class;
            System.out.println(clazz1);                 // class com._class.User

            //2. 调用运行时类的对象的getClass()
            User user = new User();
            clazz2 = user.getClass();
            System.out.println(clazz2);                 // class com._class.User

            //3. 调用Class的静态方法forName(String className)
            // className 为某个类的路径
            clazz3 = Class.forName("com._class.User");
            System.out.println(clazz3);                 // class com._class.User

            //4. 使用类的加载器的方式 (了解)
            clazz4 = ClassLoader.getSystemClassLoader().loadClass("com._class.User");
            System.out.println(clazz4);                 // class com._class.User

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        System.out.println(clazz1 == clazz2);       // true
        System.out.println(clazz3 == clazz4);       // true
        System.out.println(clazz1 == clazz3);       // true


    }

    @Test
    public void test2(){
        Class c1 = Object.class;
        Class c2 = Comparable.class;
        Class c3 = String[].class;
        Class c4 = int[][].class;
        Class c5 = ElementType.class;
        Class c6 = Override.class;
        Class c7 = int.class;
        Class c8 = void.class;
        Class c9 = Class.class;

        int[] a = new int[10];
        int[] b = new int[100];

        Class c10 = a.getClass();
        Class c11 = b.getClass();

        // 只要元素类型(同为int 同为Comparable接口类型) 与维度一样(同为一维数组或者同为二维数组)，就是同一个Class
        System.out.println(c10 == c11);     // true
    }
}
