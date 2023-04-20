/*
题目：遍历 1-100 以内的偶数，并获取偶数的个数，获取所有的偶数的和

*/

import java.util.Scanner;

class ForTest2{
	public static void main(String[] args) {
		int count = 0;		// 用count变量来存放偶数的个数 
		int sum = 0;	    // 用sum变量来存放偶数的和
		
		for(int i = 1; i <= 100; i++)	{
			
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
				sum += i;
			}			
		}
		// 打印偶数的个数 
		System.out.println("偶数的个数为：" + count);
		System.out.println("偶数的总和为：" + sum);
	}	
}