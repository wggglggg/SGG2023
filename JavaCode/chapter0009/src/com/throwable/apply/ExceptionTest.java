package com.throwable.apply;

import org.junit.Test;

import java.util.Date;
import java.util.Scanner;

/**
 * ClassName: ExceptionTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/4 20:56
 * @Version 1.0
 */
public class ExceptionTest {

    /*
     * ArrayIndexOutOfBoundsException
     * */
    @Test
    public void test(){
        int[] arr = new int[10];
        System.out.println(arr[10]);    //java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for leng
    }

    /*
     * NullPointerException
     * */
    @Test
    public void test1(){
        String hello = null;
        System.out.println(hello.toString()); // java.lang.NullPointerException: Cannot invoke "String.toString()" because "hello" is null
    }

    /*
     * ClassCastException
     * */

    @Test
    public void test2(){
        int i = 10;
        String s = String.valueOf(i);
        System.out.println(s);
        Object obj = new String();
        Date date = (Date) obj;
    }

    /*
     * NumberFormatException
     * */

    @Test
    public void test3(){
        String str = "123";

        str = "LLID";

        int i = Integer.parseInt(str);  // java.lang.NumberFormatException: For input string: "LLID"
        System.out.println(i);
    }

    /*
     * InputMismatchException
     * */
    @Test
    public void test4(){    // 输入字符串 mismatch 不匹配int
        Scanner scanner = new Scanner(System.in);
        int i = scanner.nextInt(); // java.util.InputMismatchException
        System.out.println(i);
    }

    /*
     * ArithmeticException
     * */
    @Test
    public void test5(){
        int num = 10;
        System.out.println(num / 0); // java.lang.ArithmeticException: / by zero
    }
}
