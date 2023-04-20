package com.string.apply;

import org.junit.Test;

import java.io.UnsupportedEncodingException;

/**
 * ClassName: StringMethodTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/12 10:40
 * @Version 1.0
 */
public class StringMethodTest {
    /*
     * String构造器的使用
     * */
    @Test
    public void test(){
        String s1 = new String("abc美国华人");
        System.out.println(s1);

        byte[] s3 = s1.getBytes();
        for (byte b: s3) {
            System.out.println(b);
        }

    }

    /**
     * String 转成 byte时，指定使用gbk来编码， 再将byte 解码成 String 时， 一定也要使用gbk
     * @throws UnsupportedEncodingException
     */
    @Test
    public void test2() throws UnsupportedEncodingException {
        String s1 = new String("abc美国华人");

        byte[] b1 = s1.getBytes("gbk");
        for (byte b: b1) {
            System.out.println(b);
        }

        String s2 = new String(b1, "gbk");
        System.out.println(s2);
    }
}
