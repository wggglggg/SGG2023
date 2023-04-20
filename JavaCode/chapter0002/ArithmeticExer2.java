
/*
案例 2：为抵抗洪水，战士连续作战 89 小时，编程计算共多少天零多少小时？
*/

class ArithmeticExer2 {
	public static void main (String[] args) {
		int number = 593;
		
		int hours = 89;
		int day = hours / 24;
		int hour = hours % 24;
		
		System.out.println("为抵抗洪水,战士连续作战 " + day + " 天零 " + hour + " 小时");
	}
}
