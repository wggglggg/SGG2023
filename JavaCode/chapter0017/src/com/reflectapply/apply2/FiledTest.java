package com.reflectapply.apply2;

import com.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.*;

/**
 * ClassName: FiledTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 13:14
 * @Version 1.0
 */
public class FiledTest {
    @Test
    public void test1() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        Class clazz = Class.forName("com.reflectapply.data.Person");


        //getDeclaredFields():获取当前运行时类中声明的所有属性
        Field[] declaredFields = clazz.getDeclaredFields();

        //  private java.lang.String com.reflectapply.data.Person.name
        //  public int com.reflectapply.data.Person.age
        //  private static java.lang.String com.reflectapply.data.Person.info
        // 打印出Person类里面的所有属性
        for (Field field: declaredFields) {
            System.out.println(field);
        }
    }

    //权限修饰符  变量类型  变量名
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.reflectapply.data.Person");
        Field[] declaredFields = clazz.getDeclaredFields();

        for (Field field : declaredFields) {
            //1.权限修饰符
            /*
             * 0x是十六进制
             * PUBLIC           = 0x00000001;  1    1
             * PRIVATE          = 0x00000002;  2	10
             * PROTECTED        = 0x00000004;  4	100
             * STATIC           = 0x00000008;  8	1000
             * FINAL            = 0x00000010;  16	10000
             * ...
             */

            //2 : private
            //1 : public
            //10 : private static
            // 三个属性的修饰符值
            int modifiers = field.getModifiers();
            System.out.println(modifiers + " : " + Modifier.toString(modifiers));

            //2.数据类型 三个属性的类型,如果需要简称 type.getName();
            //class java.lang.String
            //java.lang.String

            //int
            //int

            //class java.lang.String
            //java.lang.String
            Class type = field.getType();
            System.out.println(type);
            System.out.println(type.getName());

            //3.属性的变量名
            //  name
            // age
            // info
            String name = field.getName();
            System.out.println(name);
        }

    }
}
