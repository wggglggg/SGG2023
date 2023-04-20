package com._interface.exer3;

/**
 * ClassName: IPower
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/31 9:50
 * @Version 1.0
 */
public interface IPower {

    abstract public void power();
    public default void washWindow() {
        System.out.println("IPower1 washWindow");
        seat();
    }

    private void seat() {
        System.out.println("IPower1 seat");
    }
}
