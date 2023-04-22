package com.generic.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/22 20:20
 * @Version 1.0
 */
public class GenericTest {
    @Test
    public void test1(){
        Person p = new Person();

        Person<Father> p1 = new Person<>();
        Person<Father> p11 = new Person<>();
        Person<Son> p2 = new Person<>();
        p1 = p11;
        p = p1;
        p = p2;

        String name = p.name;
//        p1 = p2       // 错误的,同是Person类,无法直接
    }

    @Test
    public void test2(){
        List<String> list1 = new ArrayList<>();
        ArrayList<String> arrayList1 = new ArrayList<>();

        list1 = arrayList1;
        list1.add("加入到arrayList1中");


        System.out.println(arrayList1.get(0));
        System.out.println(list1.get(0));
//        method(list1);        //  public void method(ArrayList<Object> list) 只接受ArrayList

        method1( list1);

    }

    public void method(ArrayList<Object> list){

    }
    public void method1(List<?> list) {

    }
}
