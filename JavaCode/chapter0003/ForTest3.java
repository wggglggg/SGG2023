/*
��Ŀ������ 1-100 ���ڵ�ż��������ȡż���ĸ�������ȡ���е�ż���ĺ�

*/

import java.util.Scanner;

class ForTest3{
	public static void main(String[] args) {
				
		for(int i = 100; i <= 999; i++)	{
			
			int ge = i % 10;			// �ó��̵ķ�ʽȡ��λ��ֵ 
			int shi = i / 10 % 10;		// �ó��̵ķ�ʽȡʮλ��ֵ 
			int bai = i / 100;			// �ó��ķ�ʽȡ��λ��ֵ 
			
			if (i == ge * ge *ge + shi * shi * shi + bai * bai *bai) {
				System.out.println(i);  // 153 370 371 407
			}			
		}
	}	
}