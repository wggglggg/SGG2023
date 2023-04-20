package com.thread.threadsafe.ticketmethod;

import org.junit.experimental.theories.Theories;

/**
 * ClassName: WindowTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/10 20:53
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        Window window = new Window();

        Thread t1 = new Thread(window, "窗口1");
        Thread t2 = new Thread(window, "窗口2");
        Thread t3 = new Thread(window, "窗口3");
        Thread t4 = new Thread(window, "窗口4");
        Thread t5 = new Thread(window, "窗口5");
        Thread t6 = new Thread(window, "窗口6");


        t4.start();
        t5.start();
        t6.start();
        t1.start();
        t2.start();
        t3.start();
    }
}

class Window implements Runnable{
    private long ticket = 1000;
    private boolean isFlag = true;

    @Override
    public void run() {
        while (isFlag) {
            ticketSell();
        }




    }

    private synchronized void ticketSell() {
        if (ticket > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " : " + ticket);
            ticket--;

        }else {
            isFlag = false;
        }
    }
}
