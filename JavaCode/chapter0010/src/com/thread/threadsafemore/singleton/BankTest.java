package com.thread.threadsafemore.singleton;

import javax.management.MBeanNotificationInfo;

/**
 * ClassName: BankTest
 * Description:
 *      实现线程安全的懒汉式
 * @Author wggglggg
 * @Create 2023/4/10 20:22
 * @Version 1.0
 */
public class BankTest {
    public static Bank b1 = null;
    public static Bank b2 = null;

    public static void main(String[] args) {




        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                b1 = Bank.getInstance();
            }
        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                b2 = Bank.getInstance();
            }
        });

        t1.setName("b1");
        t2.setName("b2");

        t1.start();
        t2.start();
        try {
            t1.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        try {
            t2.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName());
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b1 == b2);

    }
}

class Bank{
    private volatile static Bank instance = null;


//     // 方式一
//    public static Bank getInstance() {
//        synchronized (Bank.class) {
//            if (instance == null) {
//                instance = new Bank();
//            }
//            return instance;
//        }
//    }
//    // 方式二
//    public synchronized static Bank getInstance() {
//        if (instance == null) {
//            try {
//                Thread.sleep(10);
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//            instance = new Bank();
//        }
//        return instance;
//    }

    // 方式三
    //实现线程安全的方式3:相较于方式1和方式2来讲，效率更高。为了避免出现指令重排，需要将instance声明为volatile
    public  static  Bank getInstance(){
        if (instance == null) {
            synchronized (Bank.class) {
                if (instance == null) {
                    instance = new Bank();
                }
            }
        }
        return instance;
    }
}
