package com.anonymous.exer2;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: StringSelect
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/3 14:57
 * @Version 1.0
 */
public class StringSelect {

//    @Test
//    public void test1(){
//        String[] stringArray = {"较容易理解", "编程", "这里补", "则", "字符串困扰", "共成员方法"};
//        // 新字符串数组,用于存放结果
//        String[] resultArray;
//
//        resultArray = StringUtil.select(stringArray, (str) -> str.contains("方法"));
//        Arrays.sort(stringArray, (o1, o2) -> o1.length() < o2.length()? -1 : 1);
//
//        for (String result: resultArray) {
//            System.out.println(result);
//        }
//        System.out.println("------");
//        for (String string: stringArray) {
//            System.out.println(string);
//        }
//    }

    @Test
    public void test2(){
        String[] stringArray = {"较容易理解", "编程", "这里补", "", "则", "字符串困扰", "共成员方法"};
        String[] resultArray;
        resultArray = StringUtil.select(stringArray, (str) -> str.isEmpty());
        for (String string: resultArray) {
            System.out.println(string);
        }
        resultArray = StringUtil.select2(stringArray, String::contains, "补");
        for (String string: resultArray) {
            System.out.println(string);
        }
    }

    @Test
    public void test3(){
        String str = "123";
        Integer i1 = Integer.valueOf(str);
        System.out.println(i1.toString());
        str = i1.toString();
        System.out.println(str);

        int i2 = Integer.parseInt(str);
        System.out.println(i2);
        String s1 = String.valueOf(i2);
        System.out.println(s1);

        Integer i3 = 12;
        System.out.println(i3);
        String s2 = i3.toString();
        System.out.println(s2);
        int i4 = Integer.parseInt(s2);
        Integer integer = Integer.valueOf(s2);
    }

}
