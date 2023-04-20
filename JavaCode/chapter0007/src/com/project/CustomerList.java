package com.project;

import java.util.Arrays;

/**
 * ClassName: CustomerList
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 20:13
 * @Version 1.0
 */
public class CustomerList {
    // 一个客户数组， 一个数组有效客户的计数器
    private Customer[] customers;
    private int total = 0;

    // 构造器，初始值为用户创建数组列表时的长度
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    /**
     * 添加新客户到客户列表中
     * @param customer 新客户
     * @return 加入成功返回 true
     */
    public boolean addCustomer(Customer customer) {

//        if (total >= customers.length) {
//            return false;
//        }
        // 先将老客户列表元素+1，也就是多给一个空位，这样不用再判断客户列表是否已经满员。
        // Arrays.copyOf(老客户列表， 老客户长度 + 1);
        customers = Arrays.copyOf(customers, customers.length + 1);
        customers[total++] = customer;
        return true;
    }

    /**
     * 修改某个客户信息
     * @param index 客户的序号
     * @param customer 修改后的新客户信息 赋值给老客户
     * @return  flase序号超出范围， true修改成功
     */
    public boolean replceCustomer(int index , Customer customer){
        if (index < 0 || index >= total) {
            return false;
        }
        customers[index] = customer;
        return true;
    }

    /**
     * 删除某个客户，并让后面的客户往前移动一位，最后一位total客户手动覆盖Null
     * @param index 要删除的客户ID
     * @return  删除成功返回true, 指定客户ID超出范围返回false
     */
    public boolean deleteCustomer(int index) {
        if (index < 0 || index >= total) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            // total-1 因为要把最后一位有效客户也就是total上的那位单独手动覆盖null,因为后面没有客户了
            customers[i] = customers[i + 1];
        }
        // 最后一位有客户无法从它后面拿到数据，只能单独用Null来覆盖。
        customers[total--] = null;
        return true;
    }

    /**
     * 返回有效客户数组列表
     * @return
     */
    public Customer[] getALlCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++){
            custs[i] = customers[i];
        }
        return custs;
    }

    /**
     * 获取某一个客户
     * @param index 客户的序列
     * @return  返回序列位置上客户
     */
    public Customer getCustomer(int index) {
        if (index < 0 || index > customers.length) {
            return null;
        }
        return customers[index];
    }

}
