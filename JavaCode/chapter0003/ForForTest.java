/*
案例 5 三角形
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/

import java.util.Scanner; 

public class ForForTest {
	public static void main(String[] args) {
		
		//  上部
		
		// i 控制 行
		for (int i = 1; i <= 9; i++) {
			
			// j 控制 列 
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			// 换行
			System.out.println();
		}
		
		
		
		// 下部
		for (int i = 1; i <= 8; i++) {
			
			for (int j = 8; j >= i; j--) {
				System.out.print("* ");
			}
			
			// 换行
			System.out.println();
		}
		
		
		
	}
}