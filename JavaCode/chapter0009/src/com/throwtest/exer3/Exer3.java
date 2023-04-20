package com.throwtest.exer3;

import org.junit.Test;

/**
 * ClassName: Exer3
 * Description:
 *      （3）定义测试类Exer3
 *
 * ① 使用满参构造方法创建Person对象，生命值传入一个负数
 *
 * 由于一旦遇到异常,后面的代码的将不在执行,所以需要注释掉上面的代码
 *
 * ② 使用空参构造创建Person对象
 *
 * 调用setLifeValue(int lifeValue)方法,传入一个正数,运行程序
 *
 * 调用setLifeValue(int lifeValue)方法,传入一个负数,运行程序
 *
 * ③ 分别对①和②处理异常和不处理异常进行运行看效果
 * @Author wggglggg
 * @Create 2023/4/6 19:29
 * @Version 1.0
 */
public class Exer3 {
    @Test
    public void test1(){

        try {
            // 由于是负数为报错，

            Person p2 = new Person("Hisenses", -34);

            System.out.println("134");  // 由于上面一行报错，所以这一行不会执行

        } catch (NoLifeValueException e) {
            e.printStackTrace();
        }

        Person p1 = new Person();
        p1.setName("Haier");
        p1.setLifeValue(70);

//        p1.setLifeValue(-70);     // com.throwtest.exer3.NoLifeValueException: 生命值不能为负数：-70

        System.out.println(p1);
    }
}
