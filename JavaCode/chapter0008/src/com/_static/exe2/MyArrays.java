package com._static.exe2;

/**
 * ClassName: MyArrays
 * Description:
 *      根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 *      涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、数组反转、
 *              数组排序(默认从小到大排序)、查找等
 * @Author wggglggg
 * @Create 2023/3/28 20:27
 * @Version 1.0
 */
public class MyArrays {

    /**
     * 获取int[]数组的最大值
     * @param arr 要获取最大值的数组
     * @return 数组的最大值
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[]数组的最小值
     * @param arr 要获取最小值的数组
     * @return  数组的最小值
     */
    public static int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 获取int[]数组的总和
     * @param arr 要获取总和的数组
     * @return  数组的总和
     */
    public static int getSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 获取int[]数组的平均值
     * @param arr 要获取平均值的数组
     * @return  数组的平均值
     */
    public static double getAvg(int[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * int[]数组的遍历
     * @param arr 要获取平均值的数组
     */
    public static void print(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[0]);
            } else {
                System.out.print("," + arr[i]);
            }
        }

        System.out.println("]");
    }

    /**
     * 获取int[]数组的复制
     * @param arr 要复制一份的源数组
     * @return  新数组
     */
    public static int[] copy(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }

    /**
     * int[]数组的倒转
     * @param arr 要倒转的数组
     */
    public static void reverse(int[] arr) {
        for (int i = 0, j = arr.length; i < j; i++, j--) {
            // 数组0号位与数组最末位互换
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            boolean isFlag = true;
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isFlag = false;
                }
            }
            System.out.println(i);

            if (isFlag) {
                break;
            }
        }
    }
}
