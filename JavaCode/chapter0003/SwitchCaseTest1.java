
/*
案例 3：使用 switch-case 实现：对学生成绩大于 60 分的，输出“合格”。低于
60 分的，输出“不合格”。

*/



class SwitchCaseTest1 {
	public static void main (String[] args) {
	
	    int score = 56;
		
		switch(score / 10) {	// 成绩除以10，前5种都算不及格，高于6就算及格。
			case 0:
				
				
			case 1:
				
			case 2:
				
				
			case 3:
				
				
			case 4:
				
			case 5:
				System.out.println("不及格");
				break;
			case 6:
				
				
			case 7:
				
			case 8:
				
				
			case 9:
				
				
			case 10:

				System.out.println("及格");
				break;	
			default:
				System.out.println("成绩输入不正确");
				break;
		}
	}	
}
