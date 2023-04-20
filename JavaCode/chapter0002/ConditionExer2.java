
/*
案例 1：获取三个数中的较大值
*/

class ConditionExer2 {
	public static void main (String[] args) {
		
		
		int n1 = 10;
		int n2 = 80;
		int n3 = 50;
		
		int tempMax = (n1 > n2)? n1 : n2;
		int finalMax = (tempMax > n3)? tempMax : n3;
		System.out.println("三个数中的较大值为:" + finalMax);

	}
}
