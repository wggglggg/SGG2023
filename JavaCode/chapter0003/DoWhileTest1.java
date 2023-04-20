/*
案例 1：遍历 1-100 的偶数，并计算所有偶数的和、偶数的个数（累加的思想
*/

public class DoWhileTest1 {
	public static void main(String[] args) {
		
		// 偶数的和
		int sum = 0;
		// 偶数个数
		int count = 0;
		// num数字 第一次进入if如果值为0，会把0计算进去，所以值要为1
		int num = 1;
		
		// 并计算所有偶数的和、偶数的个数
		
		do{
			if(num % 2 == 0) {
				System.out.println("1-100 的偶数为：" + num);
				count++;
				sum += num;
			}
			num++;			// 处理完一次后，num要自加一次，不会无法遍历 
		}while(num <= 100);	// 如果Num小于等于100，就会进入do来循环
		
		System.out.println("1-100 的偶数个数为：" + count);
		System.out.println("1-100 的偶数的和为：" + sum);
		
	}
}