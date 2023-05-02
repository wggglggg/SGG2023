package com.other;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * ClassName: AnnotationTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/2 19:47
 * @Version 1.0
 */
public class AnnotationTest {
    //获取类声明上的注解
    @Test
    public void test1() throws ClassNotFoundException {
        Class clazz = Class.forName("com.other.Customer");

        Table table = (Table) clazz.getDeclaredAnnotation(Table.class);

        System.out.println(table);          // @com.other.Table("t_customer")
        System.out.println(table.value());  // t_customer
    }

    //获取属性声明的注解
    @Test
    public void test2() throws ClassNotFoundException, NoSuchFieldException {
        Class clazz = Class.forName("com.other.Customer");

        Field name = clazz.getDeclaredField("name");
        Field age = clazz.getDeclaredField("age");

        //获取name属性声明上的注解
        Column nameColumnAnnotation = name.getDeclaredAnnotation(Column.class);
        System.out.println(nameColumnAnnotation.columnName());      // cust_name
        System.out.println(nameColumnAnnotation.columnType());      // varchar(15)


        //获取age属性声明上的注解
        Column ageColumnAnnotation = age.getDeclaredAnnotation(Column.class);
        System.out.println(ageColumnAnnotation.columnName());       // cust_age
        System.out.println(ageColumnAnnotation.columnType());       // int

    }
}
