/*
案例 1：定义圆周率并赋值为 3.14，现有 3 个圆的半径分别为 1.2、2.5、6，求
它们的面积。
*/

class FloatDoubleExer{
	public static void main(String[] args) {
		
		// 圆周率常量
		double pi = 3.14;
		
		// 三个圆半径值
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;
		
		//计算三个圆半径，并显示
		double area1 = pi * radius1 * radius1;
		double area2 = pi * radius3 * radius3;
		double area3 = pi * radius3 * radius3;
		
		System.out.println("半径为：" + radius1 + ", 面积为：" + area1);
		System.out.println("半径为：" + radius2 + ", 面积为：" + area2);
		System.out.println("半径为：" + radius3 + ", 面积为：" + area3);
	}
}