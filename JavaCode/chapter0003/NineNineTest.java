/*
案例 5：九九乘法表

*/

import java.util.Scanner; 

public class NineNineTest {
	public static void main(String[] args) {
		
		// i 控制 行
		for (int i = 1; i <= 9; i++) {
			
			// j 控制 列 
			for (int j = 1; j <= i; j++) {
				System.out.print(i + "*" + j + "=" + i*j + "\t");
			}
			
			// 换行
			System.out.println();
			System.out.println();
		}
		
		
		
		
		
		
	}
}