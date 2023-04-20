package com.thread.threadsafemore.singleton;

/**
 * ClassName: ResterantTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/11 15:09
 * @Version 1.0
 */
public class RestaurantTest {
    static Restaurant restaurant1 = null;
    static Restaurant restaurant2 = null;

    public static void main(String[] args) {


        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                restaurant1 = Restaurant.getInstance();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                restaurant2 =  Restaurant.getInstance();
            }
        });

        t1.start();
        t2.start();

//        try {
//            t2.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//
//        try {
//            t1.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }


        System.out.println(restaurant1);
        System.out.println(restaurant2);
        System.out.println( restaurant1 == restaurant2);

    }

}

class Restaurant{
    private static Restaurant instance = null;
    private static long sum;

    private Restaurant() {}

    public static synchronized  Restaurant getInstance() {
        if (instance == null) {
            instance = new Restaurant();
            for (int i = 0; i <= 1000000; i++) {
                sum += i;
                System.out.println(sum);
            }
        }



        return instance;
    }
}
