package com._enum.apply;

/**
 * ClassName: Drinking
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 20:20
 * @Version 1.0
 */
public interface Drinking {

    public default void water() {
        System.out.println("多喝水有益身体");
    };
}
