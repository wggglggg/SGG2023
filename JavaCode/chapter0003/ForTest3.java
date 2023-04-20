/*
题目：遍历 1-100 以内的偶数，并获取偶数的个数，获取所有的偶数的和

*/

import java.util.Scanner;

class ForTest3{
	public static void main(String[] args) {
				
		for(int i = 100; i <= 999; i++)	{
			
			int ge = i % 10;			// 用除商的方式取个位数值 
			int shi = i / 10 % 10;		// 用除商的方式取十位数值 
			int bai = i / 100;			// 用除的方式取百位数值 
			
			if (i == ge * ge *ge + shi * shi * shi + bai * bai *bai) {
				System.out.println(i);  // 153 370 371 407
			}			
		}
	}	
}