package com.inherited.grammar;

/**
 * ClassName: Cat
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 9:17
 * @Version 1.0
 */
public class Cat extends Animal{

    int count;

    public void catchMouse() {
        count++;
        System.out.println("抓老鼠，已经抓了" + count + "只老鼠");
    }
}
