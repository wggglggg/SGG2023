/*
���� 2��while���� 1-100 ��ż��������������ż���ĺ͡�ż���ĸ������ۼӵ�˼�룩
*/

import java.util.Scanner;

class WhileTest1{
	public static void main(String[] args) {
		
		int sum = 0;		// ����ż�����ܺ�
		int num = 1;		// ��������ʼ��
		int count = 0;		// ���ٸ�ż��������
		
		//���� 1- 100����ӡż��
		while(num <= 100) {
			
			if (num % 2 == 0) {
				System.out.println("ż��Ϊ��" + num);
				sum += num;
				count++;
			}
			num++;
		}
		
		System.out.println("ż���� " + count + "����" + "ż���ܺ�Ϊ�� " + sum);
		
	}	
}