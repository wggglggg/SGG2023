/*
案例 4：编写程序：从键盘上输入 2023 年的“month”和“day”，要求通过程序输
出输入的日期为 2023 年的第几天。
*/

import java.util.Scanner;

class SwitchCaseTest2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 接受月份
		System.out.print("请输入要查询的月份：");
		int month = input.nextInt();
		
		// 接受日期
		System.out.print("请输入要查询的日期：");
		int day = input.nextInt();
		
		// 定义一个Int类型来保存第几天计算后的结果,默认值为0
		int sumDays = 0;
		
		// 计算输入的月份日期是2023年第几天
		switch(month) {
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;										
		}
		
		// 打印出第几天的结果,  3月1号  是第 60 天
		System.out.println(month + "月" + day + "号是2023年第 " + sumDays + " 天");
		
		// 结束Scanner对象，防止内存举出
		input.close();
	}
}