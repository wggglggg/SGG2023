package com.thread.communicate;

/**
 * ClassName: PrintNumberTest
 * Description:
 *      案例1：使用两个线程打印 1-100。线程1, 线程2 交替打印
 * @Author wggglggg
 * @Create 2023/4/11 10:24
 * @Version 1.0
 */
public class PrintNumberTest {
    public static void main(String[] args) {
        PrintNumber p1 = new PrintNumber();
        PrintNumber p2 = new PrintNumber();

        p2.start();
        p1.start();
    }
}

class PrintNumber extends Thread {
    private static int number = 1;


    public void run() {
        for (;;) {

            synchronized (Object.class) {   // 两个线程对象，不能用this或者ojb,要用class
                Object.class.notify();
                if (number <= 100){
                    System.out.println(Thread.currentThread().getName() + " : " + number);
                    number++;
                } else {
                    break;
                }
                try {
                    Object.class.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
