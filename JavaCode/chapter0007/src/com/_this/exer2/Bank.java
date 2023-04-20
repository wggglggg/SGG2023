package com._this.exer2;

/**
 * ClassName: Bank
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 9:54
 * @Version 1.0
 */
public class Bank {

    private Customer[] customers;   // 多个客户的数组
    private int numberOfCustomer;   // 有效客户的个数

    public Bank() {
        customers = new Customer[100];
    }

    /**
     * 添加客户到客户列表中。
     * @param f 名
     * @param l 姓
     */
    public void addCustomer(String f, String l) {
        Customer customer = new Customer(f,l);
//        customers[numberOfCustomer] = customer;
//        numberOfCustomer++;
//        简写上面二行
        customers[numberOfCustomer++] = customer;
    }

    /**
     * 获取列表中客户的个数
     * @return 客户的个数
     */
    public int getNumberOfCustomer() {
        return numberOfCustomer;
    }

    /**
     * 获取索引位置上的客户
     * @param index 索引号
     * @return  客户
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index > numberOfCustomer) {
            return null;
        }

        return customers[index];
    }

}
