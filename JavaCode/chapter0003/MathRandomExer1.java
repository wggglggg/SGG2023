
/*
��ȡһ�������
Math.random() , ��ȡ��һ��doubleֵ  0 ~ 1 ֮��
*/

import java.util.Scanner;

class MathRandomExer1 {
	public static void main (String[] args) {
	
	    double valueRandom = Math.random();
		
		int value = (int)(valueRandom * 101);		// ���Ҫȡ0����100��������Ҫ*101��
		
		System.out.println("value = " + value);
		
		/*
		��ȡ[a,b]��Χ�ڵ���������أ�(int)(Math.random() * (b - a + 1))+a  ���� (40, 100)
		*/
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("��������ʼ�� ���� a :");
		int a = scan.nextInt();
		System.out.print("��������ֹ�� ���� b :");
		int b = scan.nextInt();
		
		int RandomAB = (int) (Math.random() * (b - a + 1)) + a;
		
		System.out.println("�����Ϊ��" + RandomAB);
	}	
}
