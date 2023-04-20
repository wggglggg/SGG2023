package com.wggglgggtop;

/**
 * ClassName: RabbitExer
 * Description:
 *      案例：不死神兔
 *      用递归实现不死神兔：故事得从西元1202年说起，话说有一位意大利青年，名叫斐波那契(Fibonacci)。
 *      在他的一部著作中提出了一个有趣的问题：假设一对刚出生的小兔一个月后就能长成大兔，
 *      再过一个月就能生下一对小兔，并且此后每个月都生一对小兔，没有发生死亡，
 *      问：现有一对刚出生的兔子2年后(24个月)会有多少对兔子?
 * 月份       1    2   3    4    5
 * 兔子对数    1    1   2    3    5
 * @Author wggglggg
 * @Create 2023/3/18 15:12
 * @Version 1.0
 */
public class RabbitExer {
    public static void main(String[] args) {
        RabbitExer test = new RabbitExer();

        System.out.println(test.countRabbit(24));
        System.out.println(test.countStairs(3));

    }

    public int countRabbit(int month) {
        if (month == 1) {
            return 1;
        }else if (month == 2) {
            return 1;
        }else {
            return countRabbit(month - 1) + countRabbit(month - 2);
        }
    }

    public int countStairs(int stairs) {
        if (stairs == 1) {
            return 1;
        } else if (stairs == 2) {
            return 2;
        } else {
            return countStairs(stairs - 1) + countStairs(stairs - 2);
        }
    }
}
