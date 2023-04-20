package com.project;

import java.util.Arrays;

/**
 * ClassName: CustomerView
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 20:13
 * @Version 1.0
 */
public class CustomerView {
    // 属性 客户数组默认10个客户元素
    CustomerList customers = new CustomerList(1);

    // 构造器，默认添加1位客户用于测试
    public CustomerView () {
        Customer customer1 = new Customer("张三", '男', 30, "13843255423",
                "abc@126.com");
        customers.addCustomer(customer1);
    }

    /**
     * 菜单方法，接收用户的选择，调用其它增删改查方法
     */
    public void enterMainMenu() {
        boolean isFlage = true;
        while (isFlage) {
            System.out.println("\n-------------------拼电商客户管理系统-----------------\n");
            System.out.println("                   1 添 加 客 户");
            System.out.println("                   2 修 改 客 户");
            System.out.println("                   3 删 除 客 户");
            System.out.println("                   4 客 户 列 表");
            System.out.println("                   5 退       出\n");
            System.out.print("                   请选择(1-5)：");

            char key = CMUtility.readMenuSelection();
            switch (key) {
                case '1':
                    addNewCustomer();
                    break;
                case '2':
                    modifyCustomer();
                    break;
                case '3':
                    deleteCustomer();
                    break;
                case '4':
                    listAllCustomers();
                    break;
                case '5':
                    System.out.println("确认是否退出(Y/N)：");
                    char yn = CMUtility.readConfirmSelection();
                    if (yn == 'Y') {
                        isFlage = false;
                        break;
                    }
            }
        }
    }

    public void addNewCustomer() {
        System.out.println("---------------------添加客户---------------------");
        System.out.print("姓名：");
        String name = CMUtility.readString(4);
        System.out.print("性别：");
        char gender = CMUtility.readChar();
        System.out.print("年龄：");
        int age = CMUtility.readInt();
        System.out.print("电话：");
        String phone = CMUtility.readString(15);
        System.out.print("邮箱：");
        String email = CMUtility.readString(15);

        Customer customer = new Customer(name, gender, age, phone, email);
        boolean flag = customers.addCustomer(customer);
        if (flag) {
            System.out.println("---------------------添加完成---------------------");
        } else {
            System.out.println("----------------记录已满,无法添加-----------------");
        }
    }

    /**
     * 修改客户信息，用户可以指定修改的客户ID，修改各个字段
     */
    public void modifyCustomer() {
        System.out.println("---------------------修改客户---------------------");
        // 用户想修改客户信息时会让用户指定客户ID是多少
        int index = 0;      // 选择客户ID
        Customer cust;      // 用户想修改的客户信息
        for(;;) {
            System.out.print("请选择待修改客户编号(-1退出)：");
            index = CMUtility.readInt();
            // 用户不想修改，可以选-1退出菜单
            if (index == -1) {
                return;
            }
            // 根据用户指定的ID获取 客户的信息
            cust = customers.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户！");
            } else {    // 如果不为null 直接跳出for循环 进入修改提问阶段
                break;
            }
        }
        // 进入修改阶段
        System.out.print("姓名（" + cust.getName() + "):");
        String name = CMUtility.readString(4, cust.getName());  // 如果用户没有改姓名，就用老信息
        System.out.print("性别（" + cust.getGender() + "):");
        char gender = CMUtility.readChar(cust.getGender());
        System.out.print("年龄（" + cust.getAge() + "):");
        int age = CMUtility.readInt(cust.getAge());
        System.out.print("电话（" + cust.getPhone() + "):");
        String phone = CMUtility.readString(15, cust.getPhone());
        System.out.print("邮箱（"+ cust.getEmail() +"):");
        String email = CMUtility.readString(15, cust.getEmail());

        cust = new Customer(name, gender, age, phone, email);

        boolean flag = customers.replceCustomer(index - 1, cust);
        if (flag) {
            System.out.println("---------------------修改完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,修改失败--------------");
        }
    }

    public void deleteCustomer() {
        System.out.println("---------------------------删除列表---------------------------");
        int index = 0;      // 删除客户时需要用户输入客户ID
        Customer cust = null;   //

        for(;;) {
            System.out.println("请选择待删除客户编号(-1退出)：");
            index = CMUtility.readInt();
            if (index == -1) {
                return;
            }

            cust = customers.getCustomer(index - 1);
            if (cust == null) {
                System.out.println("无法找到指定客户！");
            } else {
                break;
            }
        }
        System.out.print("确认是否删除(Y/N)：");
        char yn = CMUtility.readChar();
        if (yn == 'N') {
            return;
        }
        boolean flag = customers.deleteCustomer(index - 1);
        if (flag) {
            System.out.println("---------------------删除完成---------------------");
        } else {
            System.out.println("----------无法找到指定客户,删除失败--------------");
        }
    }
    /**
     * 将所有的客户清单打印
     */
    public void  listAllCustomers() {
        System.out.println("---------------------------客户列表---------------------------");
        // getAllCustomers()会得到一个有效客户的数组列表
        Customer[] custs = customers.getALlCustomers();

        // 如果客户数组列表里面为空，就提示 没有记录
        if (custs.length == 0) {
            System.out.println("没有客户记录！");
        } else {
            // 打印清单
            System.out.println("编号\t\t姓名\t\t性别\t\t年龄\t\t电话\t\t\t\t邮箱");
            for (int i = 0; i < custs.length; i++) {
                System.out.println((i+1) + "\t\t" + custs[i].getDetails());
            }
        }
    }

    public static void main(String[] args) {
        CustomerView customerView = new CustomerView();
        customerView.enterMainMenu();
    }

}
