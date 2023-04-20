package com._this.exer2;

/**
 * ClassName: BankTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 9:54
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {

        Bank bank = new Bank();

        // 加入两名客户
        bank.addCustomer("油瓶", "闷");
        bank.addCustomer("爷", "七");
        // 查看客户customers列表中多少们
        System.out.println(bank.getNumberOfCustomer());

        bank.getCustomer(0).setAccount(new Account(1000));
        System.out.println(bank.getCustomer(0).getAccount().getBalance());

        bank.getCustomer(1).setAccount(new Account(5000));
        System.out.println(bank.getCustomer(1).getAccount().getBalance());

    }

}
