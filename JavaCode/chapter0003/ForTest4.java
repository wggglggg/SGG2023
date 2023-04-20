/*
案例 5：结合 break 的使用
说明：输入两个正整数 m 和 n，求其最大公约数和最小公倍数。
比如：12 和 20 的最大公约数是 4，最小公倍数是 60。
*/

import java.util.Scanner;

class ForTest4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("请输入第一个正整数：");
		int m = input.nextInt();
		System.out.print("请输入第二个正整数：");
		int n = input.nextInt();
		
		// 比较m n 哪个大，下面遍历时，找出最大的公约数即可
		int min = (m > n)? n : m;
		// 比较m n 哪个大，下面遍历时，找出最小的公倍数即可
		int max = (m > n)? m : n;
		
		// 遍历求出最大公约数
		for (int i = min; i >= 1; i--) {
			
			if (m % i == 0 && n % i == 0) {
				System.out.println("最大公约数为：" +i);
				break;
			}
		}
		
		// 遍历求出最小公倍数
		for (int i = max; i <= m * n; i ++) {
			
			if (i % m == 0 && i % n == 0) {
				System.out.println("最小公倍数" + i);
				break;
			}
		}
				
		
	}	
}