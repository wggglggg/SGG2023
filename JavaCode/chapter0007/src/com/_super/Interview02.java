package com._super;

/**
 * ClassName: Test
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 16:35
 * @Version 1.0
 */
public class Interview02{
    public static void main(String[] args) {
        Father f = new Father();
        Son s = new Son();
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo()); //atguigu
        s.test();//atguigu atguigu
        System.out.println("-----------------");
        s.setInfo("大硅谷");
        System.out.println(f.getInfo());//atguigu
        System.out.println(s.getInfo());//大硅谷
        s.test(); //大硅谷 大硅谷
    }
}
