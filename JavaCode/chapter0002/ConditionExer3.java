
/*
案例 3：今天是周 2，10 天以后是周几？
要求：控制台输出"今天是周 2，10 天以后是周 x"。
*/

class ConditionExer3 {
	public static void main (String[] args) {
		
		
		int whatDay = 3;
		whatDay += 10;
		whatDay %= 7;    // 取出10天后的日期并与7相除取余数，得知10天后是周几
		
		
		System.out.println("今天是周二，10 天以后是周几: 星期 " + ((whatDay == 0)? "日" : whatDay));

	}
}
