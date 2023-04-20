package com.thread.create.exer1;

import org.junit.Test;

/**
 * ClassName: PrintNumberTest
 * Description:
 *      练习：创建两个分线程，其中一个线程遍历100以内的偶数，另一个线程遍历100以内的奇数。

 * @Author wggglggg
 * @Create 2023/4/9 15:47
 * @Version 1.0
 */
public class PrintNumberTest {

    public static void main(String[] args) {

//        // 方式一
//        // 打印100内偶数,先创建一个线程实例
//        EvenNumber e1 = new EvenNumber();
//        // 打印100-200内奇数,先创建一个线程实例
//        OddNumber o1 = new OddNumber();
//
//        e1.start();
//        o1.start();





        // 方式二
        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i <= 100000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " ##### " + i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 100001; i <= 200000; i ++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " : "+ i);
                    }
                }
            }
        }.start();
    }
}

class EvenNumber extends Thread{

    @Override
    public void run() {
        for (int i = 0; i <= 100000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " ##### " + i);
            }
        }
    }
}
class OddNumber extends Thread{
    @Override
    public void run() {
        for (int i = 100001; i <= 200000; i ++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + " : "+ i);
            }
        }
    }
}
