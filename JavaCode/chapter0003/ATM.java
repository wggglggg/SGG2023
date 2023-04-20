/*
案例 3：ATM 取款
声明变量 balance 并初始化为 0，用以表示银行账户的余额，下面通过 ATM 机程序实
现存款，取款等功能。
=========ATM========
 1、存款
 2、取款
 3、显示余额
 4、退出
请选择(1-4)：
*/

import java.util.Scanner; 

public class ATM {
	public static void main(String[] args) {
		
		// 账户的余额
		double balance = 0.00;
		// 初始化对象
		//Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		// 标旗
		boolean flag = true;

		
		// 并计算所有偶数的和、偶数的个数
		
		do{
			System.out.println("=========ATM========");
			System.out.println(" 1、存款");
			System.out.println(" 2、取款");
			System.out.println(" 3、显示余额");
			System.out.println(" 4、退出");
			System.out.print("请选择(1-4)：");
			// 接受菜单选择值 
			// int selection = input.nextInt();
			int selection = scan.nextInt();

			switch (selection) {
				case 1:
					System.out.print("请输入存款金额：");
					double addMoney = scan.nextDouble();
					balance += addMoney;
					break;
				case 2:
					System.out.print("请输入取款金额：");
					double minsMoney = scan.nextDouble();
					if(minsMoney > 0 && balance >= minsMoney) {
						balance -= minsMoney;
					}else if(minsMoney > balance) {
						System.out.println("不好意思，余额不足！！");
					}else{
						System.out.println("不好意思，必须是正整数！！");
					}
					break;
				case 3:
					System.out.println("您的余额是：" + balance);
					break;
				case 4:
					System.out.println("欢迎您再次光临！！！");
					flag = false;
					break;
				default:
					System.out.println("请输入1——4之间的数字！");
					break;
			}
		}while(flag);
		
		scan.close();
	}
}