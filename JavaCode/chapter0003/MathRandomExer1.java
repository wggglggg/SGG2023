
/*
获取一个随机数
Math.random() , 获取的一个double值  0 ~ 1 之间
*/

import java.util.Scanner;

class MathRandomExer1 {
	public static void main (String[] args) {
	
	    double valueRandom = Math.random();
		
		int value = (int)(valueRandom * 101);		// 如果要取0——100的整数，要*101，
		
		System.out.println("value = " + value);
		
		/*
		获取[a,b]范围内的随机整数呢？(int)(Math.random() * (b - a + 1))+a  例如 (40, 100)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入起始数 整数 a :");
		int a = scan.nextInt();
		System.out.print("请输入终止数 整数 b :");
		int b = scan.nextInt();
		
		int RandomAB = (int) (Math.random() * (b - a + 1)) + a;
		
		System.out.println("随机数为：" + RandomAB);
	}	
}
