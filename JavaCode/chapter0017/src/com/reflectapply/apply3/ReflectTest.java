package com.reflectapply.apply3;

import com.reflectapply.data.Person;
import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * ClassName: ReflectTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 16:44
 * @Version 1.0
 */
public class ReflectTest {
    //********************如下是调用指定的属性************************
    /*
     * 反射的应用3-1：调用指定的属性
     *
     * */
    @Test
    public void test1() throws Exception {
        // 获取Class对象
        Class<Person> clazz = Person.class;
        // 通过Class对象获取空参构造器,再获取Person实例对象
        Person person = clazz.getDeclaredConstructor().newInstance();   // Person()...

        //1. 获取运行时类指定名的属性
        Field age = clazz.getDeclaredField("age");

        //2. 获取或设置此属性的值
        age.set(person, 2);
        System.out.println(age.get(person));    // 2
    }

    //private String name;
    @Test
    public void test2() throws Exception {
        // 获取Class对象
        Class clazz = Class.forName("com.reflectapply.data.Person");

        // 通过Class对象获取空参构造器,再获取Person实例对象
        Person person = (Person) clazz.getDeclaredConstructor().newInstance();  // Person()...

        //1. 获取运行时类指定名的属性 通过Class实例调用getDeclaredField(String fieldName)
        Field name = clazz.getDeclaredField("name");
        name.setAccessible(true);

        //2. 获取或设置此属性的值
        name.set(person, "Lucy");
        System.out.println(name.get(person));   // Lucy
    }

    //private static String info;
    @Test
    public void test3() throws Exception {
        // 获取Class对象
        Class clazz = Class.forName("com.reflectapply.data.Person");

        // static属性不需要实倒对象来调,通过类来调用
        //1. 获取运行时类指定名的属性 通过Class实例调用getDeclaredField(String fieldName)
        Field info = clazz.getDeclaredField("info");
        info.setAccessible(true);

        //2. 获取或设置此属性的值 Object  Person.class可以用null代替
//        info.set(Person.class, "五一一票难求");
//        System.out.println(info.get(Person.class));     // 五一一票难求
        info.set(null, "五一一票难求");
        System.out.println(info.get(null));              // 五一一票难求
    }

    //********************如下是调用指定的方法************************
    /*
     * 反射的应用3-2：调用指定的方法
     *
     * */
    @Test
    public void test4() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class对象
        Class clazz = Class.forName("com.reflectapply.data.Person");

        // 通过Class对象获取空参构造器,再获取Person实例对象
        Person person = (Person) clazz.getDeclaredConstructor().newInstance();

        //1.通过Class的实例调用getDeclaredMethod(String methodName,Class ... args),获取指定的方法
        Method showNation = clazz.getDeclaredMethod("showNation", String.class, int.class);

        //2.setAccessible(true)：确保此方法是可访问的
        showNation.setAccessible(true);

        //3.通过Method实例调用invoke(Object obj,Object ... objs),即为对Method对应的方法的调用。
        //invoke()的返回值即为Method对应的方法的返回值
        //特别的：如果Method对应的方法的返回值类型为void，则invoke()返回值为null
        Object result = showNation.invoke(person,"CHN", 10);    // showNation...
        System.out.println(result);     // 我的国籍是：CHN，生活了10年
    }

    //public static void showInfo()
    @Test
    public void test5() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        // 获取Class对象
        Class clazz = Class.forName("com.reflectapply.data.Person");

        //1.通过Class的实例调用getDeclaredMethod(String methodName,Class ... args),获取指定的方法
        Method showInfo = clazz.getDeclaredMethod("showInfo");

        //2.setAccessible(true)：确保此方法是可访问的
        showInfo.setAccessible(true);

        //3.通过Method实例调用invoke(Object obj,Object ... objs),即为对Method对应的方法的调用。
        //invoke()的返回值即为Method对应的方法的返回值
        //特别的：如果Method对应的方法的返回值类型为void，则invoke()返回值为null
        Object result = showInfo.invoke(null);  // 我是一个人
        System.out.println(result);                 // null
    }

    //********************如下是调用指定的构造器************************
    /*
     * 反射的应用3-3：调用指定的构造器
     *
     * */
    @Test
    public void test6() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class对象
        Class clazz = Class.forName("com.reflectapply.data.Person");

        //1.通过Class的实例调用getDeclaredConstructor(Class ... args)，获取指定参数类型的构造器
        Constructor declaredConstructor = clazz.getDeclaredConstructor(String.class, int.class);

        //2.setAccessible(true)：确保此构造器是可以访问的
        declaredConstructor.setAccessible(true);

        //3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类的实例。
        Person person = (Person) declaredConstructor.newInstance("Android", 12);

        System.out.println(person);         // Person{name='Android', age=12}
    }

    //使用Constructor替换原有的使用Class调用newInstance()的方式创建空参对象
    @Test
    public void test7() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取Class对象
        Class clazz = Class.forName("com.reflectapply.data.Person");

        //1.通过Class的实例调用getDeclaredConstructor()，获取空参类型的构造器
        Constructor constructor = clazz.getDeclaredConstructor();
        constructor.setAccessible(true);

        //3.通过Constructor实例调用newInstance(Object ... objs),返回一个运行时类的实例。
        Person person = (Person) constructor.newInstance();

        System.out.println(person);     // Person{name='null', age=1}
    }
}
