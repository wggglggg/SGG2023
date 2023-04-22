package com.generic.selfdefine.apply;

import org.junit.Test;

import java.sql.Date;
import java.util.List;

/**
 * ClassName: DAOTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/22 16:37
 * @Version 1.0
 */
public class DAOTest {

    @Test
    public void test1(){
        CustomerDAO cd1 = new CustomerDAO();
        Customer c1 = new Customer(1001, "Xiao Yu", "xiaoyu@.com", new Date(1999, 12, 29));

        cd1.insert(c1);

        Customer customer1 = cd1.queryForInstance(1001);
    }

    @Test
    public void test2(){
        OrderDAO od1 = new OrderDAO();
        od1.insert(new Order());
        List<Order> orderList = od1.queryForList(1);
    }
}
