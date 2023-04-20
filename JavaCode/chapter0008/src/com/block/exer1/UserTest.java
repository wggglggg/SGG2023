package com.block.exer1;

/**
 * ClassName: UserTest
 * Description:
 *包含属性：userName（String类型），password（String类型），registrationTime（long类型），私有化
 *  *     - 包含get/set方法，其中registrationTime没有set方法
 *  *
 *  *     - 包含无参构造，
 *  *      - 输出“新用户注册”，
 *  *      - registrationTime赋值为当前系统时间，
 *  *      - userName就默认为当前系统时间值，
 *  *      - password默认为“123456”
 *  *
 *  *      - 包含有参构造(String userName, String password)，
 *  *      - 输出“新用户注册”，
 *  *       - registrationTime赋值为当前系统时间，
 *  *      - username和password由参数赋值
 * @Author wggglggg
 * @Create 2023/3/29 19:37
 * @Version 1.0
 */
public class UserTest {
    public static void main(String[] args) {

        User u1 = new User();
        System.out.println(u1.getInfo());

        User u2 = new User("Tom", "123467");
        System.out.println(u2.getInfo());

        User1 u3 = new User1();
        System.out.println(u3.getInfo());
    }
}
