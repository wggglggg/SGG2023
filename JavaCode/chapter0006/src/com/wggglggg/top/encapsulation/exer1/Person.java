package com.wggglggg.top.encapsulation.exer1;

/**
 * ClassName: Person
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/19 9:32
 * @Version 1.0
 */
public class Person {

    private int age;


    /**
     * 设置年龄
     *
     * @param a 年龄
     */
    public void setAge(int a) {
        if (a >= 0 && a <= 130) {
            age = a;
        } else {
            System.out.println("数据非法");
        }

    }

    /**
     * 获取年龄
     *
     * @return 年龄
     */
    public int getAge() {
        return age;
    }
}
