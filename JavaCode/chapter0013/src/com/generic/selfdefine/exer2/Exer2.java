package com.generic.selfdefine.exer2;

import org.junit.Test;

/**
 * ClassName: Exer2
 * Description:
 *      练习1: 泛型方法
         * 编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
         * public static <E> void method1( E[] e,int a,int b)
 * @Author wggglggg
 * @Create 2023/4/22 17:42
 * @Version 1.0
 */

// 练习1: 泛型方法
//编写一个泛型方法，实现任意引用类型数组指定位置元素交换。
//public static <E> void method1( E[] e,int a,int b)
public class Exer2 {
    @Test
    public void test1(){
        Integer[] arr = new Integer[]{3, 55,3,2,34 };
        method1(arr, 1, 4);

        for (Integer a : arr) {
            System.out.print(a + ", ");     // 3, 34, 3, 2, 55,
        }

    }
    // 实现任意引用类型数组指定位置元素交换。
    public static <E> void method1(E[] e, int a, int b){
        E temp = e[a];
        e[a] = e[b];
        e[b] = temp;
    }

    // 练习2: 泛型方法
    //编写一个泛型方法，接收一个任意引用类型的数组，并反转数组中的所有元素
    //public static <E> void method2( E[] e)
    @Test
    public void test2(){
        String[] arr = new String[]{"Yeezi", "Nancy", "Chenchen"};
        method2(arr);

        for (String a: arr) {
            System.out.print(a + ", ");     // Chenchen, Nancy, Yeezi,
        }
    }

    // 接收一个任意引用类型的数组，并反转数组中的所有元素
    public static <E> void method2(E[] e){

        for (int i = 0, j = e.length - 1; i < j; i++, j--) {
            E temp = e[i];
            e[i] = e[j];
            e[j] = temp;
        }
    }
}
