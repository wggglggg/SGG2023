package com._super;

/**
 * ClassName: AccountTest
 * Description:
 *      写一个用户程序测试Account类。在用户程序中，创建一个账号为1122、余额为20000、年利率4.5%的Account对象。
 *  *  使用withdraw方法提款30000元，并打印余额。
 *  *  再使用withdraw方法提款2500元，使用deposit方法存款3000元，然后打印余额和月利率。
 * @Author wggglggg
 * @Create 2023/3/25 17:00
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {

        CheckAccount checkAccount1 = new CheckAccount(1122, 20000, 0.045, 5000);

        checkAccount1.withdraw(5000);    // 17000
        System.out.println("您的账户余额为：" + checkAccount1.getBalance());
        System.out.println("可透支额度为：" + checkAccount1.getOverdraft());

        checkAccount1.withdraw(18000);    // 14500
        System.out.println("您的账户余额为：" + checkAccount1.getBalance());
        System.out.println("可透支额度为：" + checkAccount1.getOverdraft());

        checkAccount1.withdraw(3000);     // 17500
        System.out.println("您的账户余额为：" + checkAccount1.getBalance());
        System.out.println("可透支额度为：" + checkAccount1.getOverdraft());
    }
}
