package com.thread.threadsafe.ticket;

/**
 * ClassName: WindowTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/10 11:29
 * @Version 1.0
 */
public class WindowTest {
    public static void main(String[] args) {
        Ticket t1 = new Ticket("线程1");
        Ticket t2 = new Ticket("线程2");
        Ticket t3 = new Ticket("线程3");

        t1.start();
        t2.start();
        t3.start();
    }
}

class Ticket extends Thread {
    private static long ticket = 1000000;

    public Ticket(String name){
        super(name);
    }

    @Override
    public void run() {

        while (true) {
            synchronized (Ticket.class) {
//                try {
//                    Thread.sleep(1);
//
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//                }

                if (ticket > 0) {
                    System.out.println(Thread.currentThread().getName() + ": 第 " + ticket + " 张票");
                    ticket--;
                } else {
                    break;
                }

            }
        }


    }
}
