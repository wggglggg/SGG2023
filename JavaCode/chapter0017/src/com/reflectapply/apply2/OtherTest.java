package com.reflectapply.apply2;

import com.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/**
 * ClassName: OtherTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 14:39
 * @Version 1.0
 */
public class OtherTest {
    //（熟悉）获取运行时类的内部结构2：父类、接口们、包、带泛型的父类、父类的泛型等
    //1. 获取运行时类的父类
    @Test
    public void test1() throws ClassNotFoundException {

        Class clazz = Class.forName("com.reflectapply.data.Person");

        Class superclass = clazz.getSuperclass();
        System.out.println(superclass);     // class com.reflectapply.data.Creature

    }

    //2. 获取运行时类实现的接口
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.reflectapply.data.Person");

        Class[] interfaces = clazz.getInterfaces();
        for (Class i : interfaces) {
            System.out.println(i);      // interface java.lang.Comparable   interface com.reflectapply.data.MyInterface
        }
    }

    //3. 获取运行时类所在的包
    @Test
    public void test3() throws ClassNotFoundException {
        Class clazz = Class.forName("com.reflectapply.data.Person");

        Package aPackage = clazz.getPackage();
        System.out.println(aPackage.getName());     // com.reflectapply.data
    }

    //4. 获取运行时类的带泛型的父类
    @Test
    public void test4() throws ClassNotFoundException {
        Class clazz = Class.forName("com.reflectapply.data.Person");

        Type genericSuperclass = clazz.getGenericSuperclass();
        System.out.println(genericSuperclass);      // com.reflectapply.data.Creature<java.lang.String>
    }

    //5. 获取运行时类的父类的泛型 (难)
    @Test
    public void test5() throws ClassNotFoundException {
        Class clazz = Class.forName("com.reflectapply.data.Person");

        //获取带泛型的父类（Type是一个接口，Class实现了此接口
        Type genericSuperclass = clazz.getGenericSuperclass();

        //如果父类是带泛型的，则可以强转为ParameterizedType
        ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;

        //调用getActualTypeArguments()获取泛型的参数，结果是一个数组，因为可能有多个泛型参数。
        Type[] actualTypeArguments = parameterizedType.getActualTypeArguments();

        //获取泛型参数的名称
        System.out.println(((Class)actualTypeArguments[0]).getName()); // java.lang.String
//        for (Type argument : actualTypeArguments) {
//            System.out.println(((Class)argument).getName());
//        }
    }
}
