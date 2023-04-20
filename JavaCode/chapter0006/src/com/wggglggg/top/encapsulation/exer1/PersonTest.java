package com.wggglggg.top.encapsulation.exer1;

/**
 * ClassName: PersonTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/19 9:33
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args) {

        Person ZhangLan = new Person();
        Person ZhouJian = new Person();

        ZhangLan.setAge(19);
        System.out.println(ZhangLan.getAge());
        ZhouJian.setAge(18);
        System.out.println(ZhouJian.getAge());


    }
}
