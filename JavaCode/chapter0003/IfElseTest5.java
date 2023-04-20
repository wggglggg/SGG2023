
/*
根据用户输入的 网名、年龄、体重、是否单身、性别的信息，逐个打印出来
*/

import java.util.Scanner;

class IfElseTest5 {
	public static void main (String[] args) {
		
/*		
		int num1 = 66, num2 = 140, num3 = 9;
		
		if(num1 >= num2) {
			
			if(num2 >= num3) {
				System.out.println(num1 + "," + num2 + "," + num3);
			}else if(num1 <= num3 ) {
				System.out.println(num3 + "," + num1 + "," + num2);
			}else{
				System.out.println(num1 + "," + num3 + "," + num2);
			}
		}else{ // num1 < num2
			if(num2 <= num3) {
				System.out.println(num3 + "," + num2 + "," + num1);
			}else if(num1 >= num3){
				System.out.println(num2 + "," + num1 + "," + num3);
			}else{
				System.out.println(num2 + "," + num3 + "," +num1);
			}
		}
		
		int a = 0;
		
		++a;	// 1
		a--;	// 0
		
		int b = (a++) + (--a) + (++a) + (a--) ;	// 0 + -1 + 0 + 0 = -1   a = 0  0 + 0 + 1 + 1

		int c = a++;	// a = 0 c = 0
		
		System.out.println(a);  // 1
		System.out.println(b);	// 2
		System.out.println(c);	// 0
		
		int d = 5; //                                                                             0101
		int e = -5; // 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1111 1011
					//																			  1101
					// 1																		  0010
		
		System.out.println("d ^ e :" + (d ^ e));
		
*/
	    Scanner scan = new Scanner(System.in);
		
		System.out.print("请输入你的姓名：");
		String name = scan.next();				// 获取用户输入的姓名
		
		System.out.print("请输入你的年龄：");
		int age = scan.nextInt();				// 获取用户输入的年龄
		
		System.out.print("请输入你的体重kg：");
		double weight = scan.nextDouble();		// 获取用户输入的体重
		
		System.out.print("是否单身 单身true 已婚false: ");
		boolean isSingle = scan.nextBoolean();	// 获取用户输入的婚姻信息
		
		System.out.print("请输入性别 男\\女 :");
		char gender = scan.next().charAt(0);  // 获取用户输入的性别，取第一个字符位置，所以charAt(0)
		
		System.out.println("您的姓名是：" + name + ", 年龄是：" + age + ", 体重有 " + weight + "kg， " + 
		"婚姻状态是 单身是true ：" + isSingle + "，性别为：" + gender);
	}	
}
