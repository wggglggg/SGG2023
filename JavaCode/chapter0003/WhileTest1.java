/*
案例 2：while遍历 1-100 的偶数，并计算所有偶数的和、偶数的个数（累加的思想）
*/

import java.util.Scanner;

class WhileTest1{
	public static void main(String[] args) {
		
		int sum = 0;		// 存入偶数的总和
		int num = 1;		// 遍历的起始数
		int count = 0;		// 多少个偶数计数器
		
		//遍历 1- 100，打印偶数
		while(num <= 100) {
			
			if (num % 2 == 0) {
				System.out.println("偶数为：" + num);
				sum += num;
				count++;
			}
			num++;
		}
		
		System.out.println("偶数有 " + count + "个，" + "偶数总和为： " + sum);
		
	}	
}