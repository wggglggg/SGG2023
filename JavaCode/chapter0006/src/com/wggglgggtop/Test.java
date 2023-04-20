package com.wggglgggtop;

import java.io.PrintStream;

/**
 * ClassName: Test
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/17 20:46
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {
        int a = 10;
        int b = 10;
        method(a,b);

        System.out.println("a="+a);
        System.out.println("b="+b);
    }

//    public static void method(int a, int b) {
//        a *= 10;
//        b *= 20;
//        System.out.println("a="+a);
//        System.out.println("b="+b);
//        System.exit(0);
//    }

    public static void method(int a, int b) {
        PrintStream ps = new PrintStream(System.out) {
            public void println(String x) {
                if ("a=10".equals(x)) {
                    x = "a=100";
                } else if ("b=10".equals(x)) {
                    x = "b=200";
                }
                super.println(x);
            }
        };
        System.setOut(ps);

    }
}
