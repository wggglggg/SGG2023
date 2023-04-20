/*
练习：
设 x 为 float 型变量，y 为 double 型变量，a 为 int 型变量，b 为 long 型变量，c
为 char 型变量，则表达式
x + y * a / x + b / y + c 的值类型为：
A. int B. long C. double D. char
*/

class FloatDoubleExer3 {
	public static void main(String[] args) {
		
		float x = 1.17F;
		double y = 7.77777;
		int a = 22;
		long b = 11222333345453L;
		char c = 'a';
		
		// 结果只能是double类型  值的类型为：1.4428728732469631E12
		double z = x + y * a / x + b / y + c;
		
		System.out.println("值的类型为：" +  z);
	}
}