/*
��ϰ��
�� x Ϊ float �ͱ�����y Ϊ double �ͱ�����a Ϊ int �ͱ�����b Ϊ long �ͱ�����c
Ϊ char �ͱ���������ʽ
x + y * a / x + b / y + c ��ֵ����Ϊ��
A. int B. long C. double D. char
*/

class FloatDoubleExer3 {
	public static void main(String[] args) {
		
		float x = 1.17F;
		double y = 7.77777;
		int a = 22;
		long b = 11222333345453L;
		char c = 'a';
		
		// ���ֻ����double����  ֵ������Ϊ��1.4428728732469631E12
		double z = x + y * a / x + b / y + c;
		
		System.out.println("ֵ������Ϊ��" +  z);
	}
}