
/*
练习 1：
大家都知道，男大当婚，女大当嫁。那么女方家长要嫁女儿，当然要提出一定的条
件：高：180cm 以上；富：财富 1 千万以上；帅：是。
如果这三个条件同时满足，则：“我一定要嫁给他!!!”
如果三个条件有为真的情况，则：“嫁吧，比上不足，比下有余。”
如果三个条件都不满足，则：“不嫁！”
*/

import java.util.Scanner;

class ScannerExer1 {
	public static void main (String[] args) {
	
	    Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入你的身高cm：");
		int height = scan.nextInt();				// 获取用户输入的身高
		
		System.out.print("请输入你的财富 单位：千万：");
		double wealth = scan.nextDouble();				// 获取用户输入的财富
		
		System.out.print("帅不？ 是/否：");
		String isHandsome = scan.next();		// 获取用户输入的外型,用string接受，后面再用equals()来比较
		
		if(height >= 180 && wealth >= 1 && isHandsome.equals("是") ) {	// 用equals()来比较用户输入的信息
			System.out.println("我一定要嫁给他!!!");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals("是")) {
			System.out.println("嫁吧，比上不足，比下有余。");
		}else{
			System.out.println("不嫁!");
		}
		
		scan.close();							//  记得一定要退出，不然内存会有溢出的风险
		
		
	}	
}
