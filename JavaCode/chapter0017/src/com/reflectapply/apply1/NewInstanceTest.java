package com.reflectapply.apply1;


import com.reflectapply.data.Person;
import org.junit.Test;

/**
 * ClassName: NewInstanceTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 13:03
 * @Version 1.0
 */
public class NewInstanceTest {

    /**
     *  反射的应用一：创建运行时类的对象
     */
    @Test
    public void test1() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class clazz = Class.forName("com.reflectapply.data.Person");

        //创建Person类的实例,newInstance()从9开始被弃用,不推荐再使用此方法,请换成Constructure.newInstance()
        Person person = (Person) clazz.newInstance();

        System.out.println(person.toString());
    }
}
