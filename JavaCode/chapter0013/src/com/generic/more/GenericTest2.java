package com.generic.more;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName: GenericTest2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/22 20:44
 * @Version 1.0
 */
public class GenericTest2 {
    @Test
    public void test1(){
        List<Object> list1 = null;
        List<String> list2 = null;

        List<String> list3 = null;

        method1(list1);
        method1(list2);
        method1(list3);


    }
    public void method1(List<?> list) {
        for (Object l : list) {

            System.out.println(l);
        }
    }

    @Test
    public void test2(){
        List<?> list = null;
        List<String> list1 = new ArrayList<>();

        list1.add("AA");

        list = list1;
//        list.add("AA")  // 报错,因为<?>是不确定什么类型,所以无法add添加数据

        System.out.println(list.get(0));

    }

    @Test
    public void test3(){
        List<? extends Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = null;
        List<Son> list3 = null;

//        list = list1;         // ? extends Father  继承于Father 或者Father后面的都可以
        list = list2;
        list = list3;
    }

    @Test
    public void test4(){
        List<? extends Father> list = null;
        List<Object> list1 = null;
        List<Father> list2 = new ArrayList<>();
        List<Son> list3 = new ArrayList<>();

//        list = list2;
        list3.add(new Son());
        list = list3;
        list.get(0);
//        list.add(new Son());      // 只能读取,无法写入,

    }

    @Test
    public void test5(){
        List<? super Father> list = null;

        List<Father> list1 = new ArrayList<>();
        List<Son> list2 = new ArrayList<>();
        List<Object> list3 = new ArrayList<>();

        list = list1;
//        list = list2;       // 要大于Father类,才行. Son继承于Father,小于Father,所以不行
//        list = list3;

        list.add(new Son());        // 添加元素时,继承于Father都能添加
        list.add(new Father());



    }
}
