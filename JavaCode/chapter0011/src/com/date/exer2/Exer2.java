package com.date.exer2;


import org.junit.Test;

import java.sql.Date;
import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/**
 * ClassName: Exer2
 * Description:
     *      案例：百天推算
     * 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
     * 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
 * @Author wggglggg
 * @Create 2023/4/15 10:14
 * @Version 1.0
 */
public class Exer2 {

    /**
     * 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
     */
    @Test
    public void test1(){
        Calendar instance = Calendar.getInstance();
        System.out.println("你的生日为：" + instance.getTime());  // 你的生日为：Sat Apr 15 10:24:12 CST 2023

        instance.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println("你的百日举办日期为：" + instance.getTime());  // 你的百日举办日期为：Mon Jul 24 10:24:12 CST 2023
    }

    /**
     * 使用LocalDateTime获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
     */
    @Test
    public void test2(){
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("你的生日为：" + localDateTime);   // 你的生日为：2023-04-15T10:27:13.233405100

        LocalDateTime localDateTime1 = localDateTime.plusDays(100);
        System.out.println("你的百日举办日期为：" + localDateTime1);  // 你的百日举办日期为：2023-07-24T10:28:49.787029900

    }

    /**
     * 使用Calendar获取当前时间, 把这个时间设置为你的生日, 再获取你的百天(出生后100天)日期。
     */
    @Test
    public void test3(){
        Calendar calendar = Calendar.getInstance();

        System.out.println("你的生日" + calendar.getTime());
        calendar.add(Calendar.DAY_OF_YEAR, 100);
        System.out.println("你的百日酒举办日 " + calendar.getTime());
    }

    @Test
    public void test4(){
        LocalDateTime localDateTime = LocalDateTime.now();

        System.out.println("你的生日" + localDateTime);
        System.out.println("你的百日酒举办日 " +localDateTime.plusDays(100));
    }
}
