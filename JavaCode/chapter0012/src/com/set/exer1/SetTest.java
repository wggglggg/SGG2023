package com.set.exer1;

import java.util.*;

/**
 * ClassName: SetTest
 * Description:
         *案例：
             * 定义方法如下：public static List duplicateList(List list)
             * 要求：① 参数List中只存放Integer的对象
             *      ② 在List内去除重复数字值，尽量简单
 * @Author wggglggg
 * @Create 2023/4/18 9:06
 * @Version 1.0
 */
public class SetTest {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add(5);
        list.add(5);
        list.add(6);
        list.add(21);
        list.add(7);
        list.add(7);
        list.add(65);
        list.add(65);
        list.add(6);

        List newList = duplicateList(list);
        System.out.println(newList);
        System.out.println();

        Object[] newList2 = duplicateList2(list);

        for (Object obj : newList2) {
            System.out.println(obj);
        }
    }

    // 方式1
    public static List duplicateList(List list) {
        List newList = new ArrayList();
        Set set = new HashSet();

        for (Object obj: list){
            set.add(obj);
        }
        for (Object obj: set) {
            newList.add(obj);
        }

        return newList;
    }

    // 方式2，利用Set与List 类自带的转换Collection方式
    public static Object[] duplicateList2(List list) {
        Set set = new HashSet(list);
        List newList = new ArrayList(set);
        Object[] objects = newList.toArray();
        Arrays.sort(objects);

        return objects;
    }
}
