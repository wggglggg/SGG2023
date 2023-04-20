package com.generic.aplly;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionsMapTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/20 16:27
 * @Version 1.0
 */
public class CollectionsMapTest {

    //体会集合中使用泛型前的场景
    @Test
    public void test1(){
        List list = new ArrayList();
        list.add(67);
        list.add(633);
        list.add(82);
        list.add(17);

        //1.问题1：类型不安全。因为add()的参数是Object类型，意味着任何类型的对象都可以添加成功
//        list.add("Car");

        Iterator iterator = list.iterator();
        while(iterator.hasNext()) {
            //2.问题2：需要使用强转操作，繁琐。还有可能导致 ClassCastException 异常
            Integer i = (Integer) iterator.next();
            int score = i;

            System.out.println(score);
        }
    }

    //在集合中使用泛型的例子
    @Test
    public void test2(){
        List<Integer> list = new ArrayList<>(); // new ArrayList<Integer>()  默认<Integer>可以JDK可以自我推断，所以不写也可以
        list.add(67);
        list.add(633);
        list.add(82);
        list.add(17);
        //编译报错，保证类型的安全
//        list.add("Car")     // 只能写入<Integer>了,无法写入String,因为前面已经限定的数据类型

        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            //因为添加的都是Integer类型，避免了强转操作
            Integer next = iterator.next();
            int score = next;

            System.out.println(score);
        }
    }

    /*
     * 泛型在Map中使用的例子
     * */
    @Test
    public void test3(){
        //jdk7的新特性
        HashMap<Integer, String> map = new HashMap<>(); //类型推断

        map.put(1, "HanMeiMei");
        map.put(2, "LiLei");
        map.put(3, "Lucy");
        map.put(4, "Lily");

        // 方式一
//        Set<Map.Entry<Integer, String>> entries = map.entrySet();
//
//        for (Map.Entry<Integer, String> entry : entries) {
//            System.out.println(entry.getKey() + "--->" + entry.getValue());
//        }

        // 方式二
        Set<Map.Entry<Integer, String>> entries = map.entrySet();

        Iterator<Map.Entry<Integer, String >> iterator = entries.iterator();

        while(iterator.hasNext()) {
            Map.Entry<Integer, String> entry = iterator.next();
            System.out.println(entry.getKey() + "--->" + entry.getValue());
        }
    }
}
