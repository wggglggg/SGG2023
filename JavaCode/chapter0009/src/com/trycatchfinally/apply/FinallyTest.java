package com.trycatchfinally.apply;

import org.junit.Test;

/**
 * ClassName: FinallyTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/4 21:17
 * @Version 1.0
 */
public class FinallyTest {

    @Test
    public void test1(){
        try {
            String str = "123";
            str = "dsfgsd";
            int i = Integer.parseInt(str);
            System.out.println(i);
        } catch (NumberFormatException e) {
            e.printStackTrace();

//            System.out.println(10 / 0);// java.lang.ArithmeticException: / by zero
        }

        System.out.println("程序结束");
    }
}
