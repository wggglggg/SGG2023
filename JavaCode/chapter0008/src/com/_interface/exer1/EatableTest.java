package com._interface.exer1;

/**
 * ClassName: EatableTest
 * Description:
 *  声明测试类EatableTest，创建Eatable数组，存储各国人对象，并遍历数组，调用eat()方法
 * @Author wggglggg
 * @Create 2023/3/30 14:36
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatable = new Eatable[3];
        eatable[0] = new Chinese();
        eatable[1] = new American();
        eatable[2] = new Indian();

        for (int i = 0; i < eatable.length; i++) {
            eatable[i].eat();
        }
    }
}
