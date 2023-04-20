package com.anonymous.exer1;

import org.junit.Test;

import java.lang.ref.SoftReference;
import java.util.Arrays;
import java.util.Comparator;

/**
 * ClassName: TestAnonymous
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/3 12:32
 * @Version 1.0
 */
public class TestAnonymous {
    @Test
    public void test1(){
        Integer[] intArray = {89, 3, 67, 12, 45};

        Arrays.sort(intArray);      // 默认正序排列
        Arrays.sort(intArray, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o2, o1);
            }
        });

        for (int array: intArray) {
            System.out.print(array + " ,");
        }
    }

    @Test
    public void test2(){
        String[] stringsArray = {"编程", "这里补", "则", "字符串困扰"};

        Arrays.sort(stringsArray, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1.length() < o2.length()? -1 : 1);
            }
        });

        for (String str: stringsArray) {
            System.out.println(str);
        }
    }

    @Test
    public void test3(){
        String[] stringArray = {"编程", "这里补", "则", "字符串困扰"};
        String[] resultArray; // 新数组,存放包含"串"这个字的字符串,

        resultArray = StringUtil.select(stringArray, new StringFilter() {
            @Override
            public boolean isMatch(String str) {
                return str.contains("串");
            }
        });

        // 循环打印出来结果
        for (String result : resultArray) {
            System.out.println(result);
        }
    }
    @Test
    public void test4(){
        String[] strArray = { "Hello", "world", "What", "is", "The", "Wether", "today", "" };
        String[] resultArray;

        // 去除一些不重要的写法
        resultArray = StringUtil.select(strArray, (str) -> str.contains("W"));
        for (String result : resultArray) {
            System.out.println(result);
        }
    }
}
