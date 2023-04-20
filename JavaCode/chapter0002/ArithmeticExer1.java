
/*
随意给出一个整数，打印显示它的个位数，十位数，百位数的值。
格式如下：
数字 xxx 的情况如下：
个位数：
十位数：
百位数：
例如：
数字 153 的情况如下：
个位数：3
十位数：5
百位数：1
*/

class ArithmeticExer1 {
	public static void main (String[] args) {
		int number = 593;
		
		int n1 = number % 10;
		int n2 = number / 10 % 10;
		int n3 = number / 100;
		
		System.out.println("number为：" + number);
		System.out.println("个位数为：" + n1);
		System.out.println("十位数为：" + n2);
		System.out.println("百位数为：" + n3);
	}
}
