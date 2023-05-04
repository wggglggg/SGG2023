package com.thread.create.runnable;

/**
 * ClassName: EvenNumberTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/9 19:35
 * @Version 1.0
 */
public class EvenNumberTest {
    public static void main(String[] args) {

//        EvenNumber e = new EvenNumber();
//        Thread t1 = new Thread(e);
//
//        t1.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " : " + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i <= 10000; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " > " + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10000; i <= 20000; i++) {
                    if (i % 2 == 0) {
                        System.out.println(Thread.currentThread().getName() + " } " + i);
                    }
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 10000; i <= 20000; i++) {
                    if (i % 2 != 0) {
                        System.out.println(Thread.currentThread().getName() + " } " + i);
                    }
                }
            }
        }).start();
    }
}

class  EvenNumber implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i <= 10000; i++) {
            if (i % 2 == 0) {
                System.out.println(Thread.currentThread().getName() + " : " + i);
            }
        }
    }
}
