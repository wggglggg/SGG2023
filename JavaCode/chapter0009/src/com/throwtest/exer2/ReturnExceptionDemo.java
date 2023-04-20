package com.throwtest.exer2;

/**
 * ClassName: ReturnExcepttionDemo
 * Description:
 *  System.out.println("进入方法A");
 *  System.out.println("用A方法的finally");
 *  throw new Exception("制造异常");
 *  System.out.println("进入方法B");
 *  System.out.println("调用B方法的finally");
 *
 * @Author wggglggg
 * @Create 2023/4/6 19:16
 * @Version 1.0
 */
public class ReturnExceptionDemo {
    static void methodA() throws Exception{
        try {
            System.out.println("进入方法A");
            throw new Exception("制造异常");
        } finally {
            System.out.println("用A方法的finally");
        }
    }

    static void methodB() {
        try {
            System.out.println("进入方法B");
            return;
        } finally {
            System.out.println("调用B方法的finally");
        }
    }

    public static void main(String[] args) {
        try {
            methodA();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        methodB();
    }
}

