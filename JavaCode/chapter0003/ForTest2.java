/*
��Ŀ������ 1-100 ���ڵ�ż��������ȡż���ĸ�������ȡ���е�ż���ĺ�

*/

import java.util.Scanner;

class ForTest2{
	public static void main(String[] args) {
		int count = 0;		// ��count���������ż���ĸ��� 
		int sum = 0;	    // ��sum���������ż���ĺ�
		
		for(int i = 1; i <= 100; i++)	{
			
			if (i % 2 == 0) {
				System.out.println(i);
				count++;
				sum += i;
			}			
		}
		// ��ӡż���ĸ��� 
		System.out.println("ż���ĸ���Ϊ��" + count);
		System.out.println("ż�����ܺ�Ϊ��" + sum);
	}	
}