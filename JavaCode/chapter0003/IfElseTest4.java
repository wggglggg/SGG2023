
/*
案例 4：由键盘输入三个整数分别存入变量 num1、num2、num3，对它们进行
排序(使用 if-else if-else)，并且从大到小输出。
*/

class IfElseTest4 {
	public static void main (String[] args) {
		
		
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
	    
	}	
}
