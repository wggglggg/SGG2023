package com.date.exer1;

import org.junit.Test;

import javax.lang.model.util.SimpleAnnotationValueVisitor6;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: exer1
 * Description:
     *练习：
     * 如何将一个java.util.Date的实例转换为java.sql.Date的实例

     * 拓展：
     * 将控制台获取的年月日（比如：2022-12-13）的字符串数据，保存在数据库中。
     * （简化为得到java.sql.Date的对象，此对象对应的时间为2022-12-13）。
 * @Author wggglggg
 * @Create 2023/4/15 9:02
 * @Version 1.0
 */
public class Exer1 {

    public static void main(String[] args) {

    }
    @Test
    public void test(){
        Date date = new Date();
        System.out.println(date.getTime());     // 1681520899862, util 与 sql 可以用时间数字值来连接

        java.sql.Date dateSql = new java.sql.Date(date.getTime());
        Date date1 = new Date();

        System.out.println(dateSql);
        System.out.println(date1);
    }

    @Test
    public void test2(){
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入年月日（比如：2022-12-13): ");
        String strDate = scanner.next();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date simpleDate = null;
        try {
            simpleDate = simpleDateFormat.parse(strDate);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

        java.sql.Date dateSql = new java.sql.Date(simpleDate.getTime());
        System.out.println("----------");
        System.out.println(dateSql);


        scanner.close();
    }
}
