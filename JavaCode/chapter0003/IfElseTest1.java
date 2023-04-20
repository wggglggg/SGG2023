
/*
案例 1：成年人心率的正常范围是每分钟 60-100 次。体检时，如果心率不在此
		范围内，则提示需要做进一步的检查。
*/

class IfElseTest1 {
	public static void main (String[] args) {
		
		
		int heartBeat = 110;
		
		if(heartBeat < 60 || heartBeat > 100) {
			System.out.println("您需要做进一步的检查");
		}
		
		System.out.println("当前检查结束");
	}
}
