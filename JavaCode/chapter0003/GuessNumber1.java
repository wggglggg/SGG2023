/*
案例 3：猜数字游戏
随机生成一个 100 以内的数，猜这个随机数是多少？
从键盘输入数，如果大了，提示大了；如果小了，提示小了；如果对了，就不再猜了，并统计一共猜了多少次。
提示：生成一个[a,b] 范围的随机数的方式：(int)(Math.random() * (b - a + 1) + a)
*/

import java.util.Scanner;

class GuessNumber1{
	public static void main(String[] args) {
		
		
		int random = (int) (Math.random() * 100 + 1);		// 随机数,防止小数，所以强转Int
		Scanner input = new Scanner(System.in);					// 启动键盘捕捉
		System.out.print("猜猜数字是多少？：");
		int guess = input.nextInt();						// 用户输入猜测的数字
		int count = 1;										// 统计猜了多少次
		
		
		//遍历 1- 100，打印偶数
		while(guess != random) {
			
			if (guess > random) {
				System.out.print("不是：" + guess + "，猜大了,请再猜！！！");
				guess = input.nextInt();
			}else if (guess < random) {
				System.out.print("不是：" + guess + "，猜小了,请再猜！！！");
				guess = input.nextInt();
			}
			// 统计猜了多少次
			count++;
		}
		
		
		System.out.println("你太棒了，就是 " + random + ", 你猜中了");
		System.out.println("你一共花了 " + count +" 次，下次努力！");
	}	
}