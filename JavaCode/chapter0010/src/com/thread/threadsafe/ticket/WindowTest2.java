package com.thread.threadsafe.ticket;

/**
 * ClassName: WindowTest2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/10 11:53
 * @Version 1.0
 */
public class WindowTest2 {
    public static void main(String[] args) {

        TicketB ticket = new TicketB();

        Thread t1 = new Thread(ticket);
        Thread t2 = new Thread(ticket);
        Thread t3 = new Thread(ticket);

        t1.setName("窗口1");
        t2.setName("窗口2");
        t3.setName("窗口3");

        t1.start();
        t2.start();
        t3.start();

    }
}

class TicketB implements Runnable {
    private long ticket = 10000000;
    @Override
    public void run() {

        while (true) {

            synchronized (this) {
                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ": 第 " + ticket + " 张票");
                    ticket--;
                }else {
                    break;
                }
            }
        }
    }
}
