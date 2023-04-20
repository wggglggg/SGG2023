package com.throwable.apply;

/**
 * ClassName: ErrorTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/4 20:51
 * @Version 1.0
 */
public class ErrorTest {
    public static void main(String[] args) {

//        main(args);     // at com.throwable.apply.ErrorTest.main(ErrorTest.java:14)
        byte[] arr = new byte[1024 * 1024 * 1000000000];
    }
}
