package com.grammar._04instanceof;

import org.junit.Test;

/**
 * ClassName: InstanceOfTest
 * Description:
 *                                  instanceof模式匹配
 * @Author wggglggg
 * @Create 2023/5/7 21:29
 * @Version 1.0
 */
public class InstanceOfTest {
    /*
     * 举例1：
     * JDK14之前
     * */
    @Test
    public void test1(){
        var obj = new String("hello, Java17");

        if (obj instanceof String) {
            var str = (String) obj;
            System.out.println(str.contains("Java"));
        } else {
            System.out.println("非String类型");
        }
    }

    /*
     * 举例1：
     * JDK14中
     * */
    @Test
    public void test2(){
        Object obj = new String("hello, Java17");

        if (obj instanceof String str) {
            System.out.println(str.contains("Java"));
        }else {
            System.out.println("非String类型");
        }
    }
}

class Computer{
    private String model;
    private double price;

    //方式1：
//    @Override
//    public boolean equals(Object obj) {
//        if (obj instanceof Computer) {
//            Computer other = (Computer) obj;
//            if (this.model.equals(other.model) && this.price == other.price) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    //方式2:
//    public boolean equals(Object obj) {
//        if (obj instanceof Computer other) {
//            return this.model.equals(other.model) && this.price == other.price;
//        }
//        return false;
//    }
    //方式3：
    public boolean equals(Object obj) {
        return obj instanceof Computer other && this.model.equals(other.model) &&
                this.price == other.price;
    }
}
