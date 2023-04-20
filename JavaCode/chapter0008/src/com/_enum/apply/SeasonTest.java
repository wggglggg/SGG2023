package com._enum.apply;

/**
 * ClassName: SeasonTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 19:22
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {

        System.out.println(Season.FALL.name());

        for (Season season : Season.values()) {
            System.out.println(season);
        }
        System.out.println("=============================");

        Season one = Season.valueOf("SUMMER");
        System.out.println(one.getSeasonName());
        System.out.println(one.getDesc());

        System.out.println(Season.WINTER.ordinal());

//        System.out.println(Season.SPRING.getNumber());
//        System.out.println(Season.SUMMER.getNumber());
//        System.out.println(Season.FALL.getNumber());
//        System.out.println(Season.WINTER.getNumber());
        Season.SPRING.water();
        Season.SUMMER.water();
        Season.FALL.water();
        Season.WINTER.water();

    }
}
