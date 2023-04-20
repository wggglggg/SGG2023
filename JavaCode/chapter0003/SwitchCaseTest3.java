/*
从键盘分别输入年、月、日，判断这一天是当年的第几天
注：判断一年是否是闰年的标准：
 1）可以被 4 整除，但不可被 100 整除
 或
 2）可以被 400 整除
 
例如：1900，2200 等能被 4 整除，但同时能被 100 整除，但不能被 400 整除，不是闰年
		1696 1704 是闰年，1700却不是， 1796 1804是闰年， 1800却不是，因为能被4与100同时整除就不是闰年。
		或者前面两条不判断，直接就能被 400整除，那也是闰年
*/

import java.util.Scanner;

class SwitchCaseTest3{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// 接收年份
		System.out.print("请输入要查询的年份：");
		int year = input.nextInt();
		
		// 接收月份
		System.out.print("请输入要查询的月份：");
		int month = input.nextInt();
		
		// 接收日期
		System.out.print("请输入要查询的日期：");
		int day = input.nextInt();
		
		// 定义一个Int类型来保存第几天计算后的结果,默认值为0
		int sumDays = 0;
		
		// 计算输入的输入的年份月份日期是当年第几天
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
			case 3:				// 考虑到有闰年的情况，所以要判断是否闰年
				sumDays += 28;
				
				// 判断是否闰年
				if (year % 4  == 0 && year % 100 != 0 || year % 400 == 0) {
					sumDays += 1;
					System.out.println("您输入的 " + year + " 年是闰年");
				}else{
					System.out.println("您输入的 " + year + " 年不是闰年");
				}
				
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;										
		}
		
		// 打印出第几天的结果,  3月1号  是第 60 天
		System.out.println(year + "年" + month + "月" + day + "号是 " + year+ " 年第 " + sumDays + " 天");
		
		// 结束Scanner对象，防止内存举出
		input.close();
	}
}