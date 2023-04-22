package com.generic.selfdefine.exer1;

import org.junit.Test;

import java.util.List;

/**
 * ClassName: UserTest
 * Description:
 *      定义一个测试类：
 * 创建 DAO 类的对象， 分别调用其 save、get、update、list、delete 方法来操作 User 对象，
 * 使用 Junit 单元测试类进行测试。
 * @Author wggglggg
 * @Create 2023/4/22 17:17
 * @Version 1.0
 */
public class UserTest {
    @Test
    public void test1(){
        DAO<User> dao = new DAO<>();

        dao.save("1001", new User(1, "FarCry4", 5));
        dao.save("1002", new User(2, "FarCry5", 3));

        User user1 = dao.get("1001");

        dao.update("1002", new User(3, "NFS15", 8));

        List<User> list = dao.list();
        for (User l : list) {
            System.out.println(l);
        }
    }
}
