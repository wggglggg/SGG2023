package com.other.dynamic;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 * ClassName: ReflectTest
 * Description:
 *              反射的动态性
 * @Author wggglggg
 * @Create 2023/5/2 20:57
 * @Version 1.0
 */
public class ReflectTest {

    //体会：静态性
    public Person getInstance(){
        return new Person();
    }

    //体会：反射的动态性
    //举例1
    public <T> T getInstance(String className) {
        try {
            Class clazz = Class.forName(className);

            Constructor declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);

            return (T) declaredConstructor.newInstance();

        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        }
    }

    @Test
    public void test1(){

        Person person1 = getInstance();
        System.out.println(person1);        // Person{name='null', age=0}

        String className = "com.other.dynamic.Person";
        Person person2 = getInstance(className);
        System.out.println(person2);        // Person{name='null', age=0}

        String className2 = "java.util.Date";
        Date date = getInstance(className2);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd : HH:mm:ss");
        String time = sdf.format(date);

        System.out.println(time);       // 2023-05-02 : 21:14:46
    }

    //体会：反射的动态性
    //举例2：
    public Object invoke(String className, String methodName) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //1. 创建全类名对应的运行时类的对象
        Class clazz = Class.forName(className);

        Constructor declaredConstructor = clazz.getDeclaredConstructor();
        declaredConstructor.setAccessible(true);

        Object obj = declaredConstructor.newInstance();

        //2. 获取运行时类中指定的方法，并调用
        Method declaredMethod = clazz.getDeclaredMethod(methodName);
        declaredMethod.setAccessible(true);
        return declaredMethod.invoke(obj);
    }

    @Test
    public void test2() throws ClassNotFoundException, InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {
        String className = "com.other.dynamic.Person";
        String methodName = "show";

        Object result = invoke(className, methodName);  // 你好，我是一个Person
        System.out.println(result);                     // null
    }
}
