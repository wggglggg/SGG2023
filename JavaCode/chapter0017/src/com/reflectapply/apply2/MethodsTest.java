package com.reflectapply.apply2;

import com.reflectapply.data.Person;
import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

/**
 * ClassName: MethodsTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 14:10
 * @Version 1.0
 */
public class MethodsTest {
    @Test
    public void test1(){
        Class clazz = Person.class;
        // getMethods():获取到运行时类本身及其所有的父类中声明为public权限的方法
//        Method[] methods = clazz.getMethods();
//        for (Method m : methods) {
//            System.out.println(m);
//        }

        // getDeclaredMethods():获取当前运行时类中声明的所有方法
        //public java.lang.String com.reflectapply.data.Person.toString()
        //public void com.reflectapply.data.Person.method()
        //public int com.reflectapply.data.Person.compareTo(java.lang.Object)
        //public int com.reflectapply.data.Person.compareTo(com.reflectapply.data.Person)
        //public void com.reflectapply.data.Person.show() throws java.lang.RuntimeException,java.lang.ClassNotFoundException
        //private java.lang.String com.reflectapply.data.Person.showNation(java.lang.String,int)
        //public static void com.reflectapply.data.Person.showInfo()
        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {
            System.out.println(method);
        }
    }

    // 注解信息
    // 权限修饰符 返回值类型 方法名(形参类型1 参数1,形参类型2 参数2,...) throws 异常类型1,...{}
    @Test
    public void test2() throws ClassNotFoundException {
        Class clazz = Class.forName("com.reflectapply.data.Person");

        Method[] declaredMethods = clazz.getDeclaredMethods();
        for (Method method : declaredMethods) {

            // 1.获取方法声明的注解 只有一个方法有使用注解
            // @com.reflectapply.data.MyAnnotation("show_nation")
            //2:private

            Annotation[] annotations = method.getAnnotations();
            for (Annotation annotation : annotations) {
                System.out.println(annotation);
            }

            // 2.权限修饰符
            //1:public
            //1:public
            //4161:public volatile
            //1:public
            //2:private
            //9:public static
            int modifiers = method.getModifiers();
            System.out.print(modifiers + ":" + Modifier.toString(modifiers) + "\t");

            // 3.返回值类型
            Class returnType = method.getReturnType();
            System.out.print(returnType.getName() + "\t");

            // 4.方法名
            System.out.print(method.getName() + "\t");

            System.out.print("(");

            // 5.形参列表
            Class[] parameterTypes = method.getParameterTypes();
            if (!(parameterTypes == null && parameterTypes.length == 0)) {
                for (int i = 0; i < parameterTypes.length; i++) {

                    if (i == parameterTypes.length - 1) {
                        System.out.print(parameterTypes[i].getName() + " args_" + i);
                        break;
                    }
                    System.out.print(parameterTypes[i].getName() + " args_" + i + ",");
                }
            }
//
            System.out.print(")");
//
//            // 6.抛出的异常
            Class[] exceptionTypes = method.getExceptionTypes();
            if (exceptionTypes.length > 0) {
                System.out.print("throws ");
                for (int i = 0; i < exceptionTypes.length; i++) {
                    if (i == exceptionTypes.length - 1) {
                        System.out.print(exceptionTypes[i].getName());
                        break;
                    }
                    System.out.print(exceptionTypes[i].getName() + ",");
                }
            }
            System.out.println();
        }
    }
}
