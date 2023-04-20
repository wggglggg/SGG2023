package com.thread.method_life.exer;

/**
 * ClassName: HappyNewYear
 * Description:
 *
    模拟新年倒计时，每隔1秒输出一个数字，依次输出10,9,8......1，最后输出：新年快乐！
 * @Author wggglggg
 * @Create 2023/4/10 11:15
 * @Version 1.0
 */
public class HappyNewYear {
    public static void main(String[] args) {

        Clock c1 = new Clock();
        c1.start();
    }


}

class Clock extends Thread{

    @Override
    public void run() {

        for (int i = 10; i >= 1; i--) {
            try {
                Thread.sleep(1000);
                System.out.println(i);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }

        }

        System.out.println("新年快乐！");
    }
}
