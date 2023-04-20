package com._static.exe2;

/**
 * ClassName: MyArraysTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/28 20:27
 * @Version 1.0
 */
public class MyArraysTest {
    public static void main(String[] args) {
        int[] arr = new int[]{34,56,223,2,56,24,56,67,778,45};

        MyArrays.sort(arr);
        MyArrays.print(arr);
    }
}
