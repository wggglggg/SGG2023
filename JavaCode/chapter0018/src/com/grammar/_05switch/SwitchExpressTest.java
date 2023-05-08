package com.grammar._05switch;

import org.junit.Test;

/**
 * ClassName: SwitchExpressTest
 * Description:
 *      switch表达式
 * @Author wggglggg
 * @Create 2023/5/8 15:53
 * @Version 1.0
 */

enum Week{
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
}
public class SwitchExpressTest {
    /*
     * 举例1：
     * JDK12之前的写法
     * */

    Week day = Week.MONDAY;
    @Test
    public void test1(){


        switch (day) {
            case MONDAY:
                System.out.println(1);
                break;
            case TUESDAY:
                System.out.println(2);
                break;
            case WEDNESDAY:
            case THURSDAY:
                System.out.println(3);
                break;
            case FRIDAY:
                System.out.println(4);
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println(5);
                break;
            default:
                throw new RuntimeException("What day is today?" + day);
        }
    }

    /*
     * 举例1：
     * JDK12中的写法：switch表达式，省去了break语句，避免了因少写break而出现case穿透
     * */
    @Test
    public void test2(){
        switch (day) {
            case MONDAY -> System.out.println(1);
            case TUESDAY -> System.out.println(2);
            case WEDNESDAY, THURSDAY -> System.out.println(3);
            case FRIDAY -> System.out.println(4);
            case SATURDAY, SUNDAY -> System.out.println(5);
            default -> throw new RuntimeException("What day is today?" + day);
        }
    }

    /*
     * 举例1：
     * JDK12中的写法：还可以使用变量接收switch表达式的结果,由于没有给result返回值，所以没有值
     * */
    @Test
    public void test3(){
        int result = switch (day) {
            case MONDAY -> 1;
            case TUESDAY -> 2;
            case WEDNESDAY, THURSDAY -> 3;
            case FRIDAY -> 4;
            case SATURDAY, SUNDAY -> 5;
            default -> throw new RuntimeException("What day is today?" + day);
        };
        System.out.println(result);
    }

    /*
     * 举例1：(在default中返回值5)
     * JDK13中的写法：引入了yield关键字，用于返回指定的数据，结束switch结构。
     * 这意味着，switch表达式(返回值)应该使用yield，switch语句(不返回值)应该使用break。
     *
     * 和return的区别在于：return会直接跳出当前方法，而yield只会跳出当前switch块。
     * */
    @Test
    public void test4(){
        int result = switch (day) {
            case MONDAY -> {
                System.out.println(1);
                yield 1;
            }
            case TUESDAY -> {
                System.out.println(2);
                yield 2;
            }
            case WEDNESDAY,THURSDAY -> {
                System.out.println(3);
                yield 3;
            }
            case FRIDAY -> {
                System.out.println(4);
                yield 4;
            }
            case SATURDAY,SUNDAY -> {
                System.out.println(5);
                yield 5;
            }
            default -> throw new RuntimeException("What day is today?" + day);
        };
        System.out.println(result);
    }

    /**
     * switch更简化方式
     */
    @Test
    public void test5(){
        int result = switch (day) {
            case MONDAY: yield 1;
            case TUESDAY: yield 2;
            case WEDNESDAY, THURSDAY : yield 3;
            case FRIDAY: yield 4;
            case SATURDAY, SUNDAY: yield 5;
            default: throw new RuntimeException("What day is today?" + day);
        };
        System.out.println(result);
    }
}
