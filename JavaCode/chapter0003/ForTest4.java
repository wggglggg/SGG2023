/*
���� 5����� break ��ʹ��
˵������������������ m �� n���������Լ������С��������
���磺12 �� 20 �����Լ���� 4����С�������� 60��
*/

import java.util.Scanner;

class ForTest4{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("�������һ����������");
		int m = input.nextInt();
		System.out.print("������ڶ�����������");
		int n = input.nextInt();
		
		// �Ƚ�m n �ĸ����������ʱ���ҳ����Ĺ�Լ������
		int min = (m > n)? n : m;
		// �Ƚ�m n �ĸ����������ʱ���ҳ���С�Ĺ���������
		int max = (m > n)? m : n;
		
		// ����������Լ��
		for (int i = min; i >= 1; i--) {
			
			if (m % i == 0 && n % i == 0) {
				System.out.println("���Լ��Ϊ��" +i);
				break;
			}
		}
		
		// ���������С������
		for (int i = max; i <= m * n; i ++) {
			
			if (i % m == 0 && i % n == 0) {
				System.out.println("��С������" + i);
				break;
			}
		}
				
		
	}	
}