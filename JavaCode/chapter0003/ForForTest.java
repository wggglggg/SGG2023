/*
���� 5 ������
*
* *
* * *
* * * *
* * * * *
* * * * * *
* * * * * * *
* * * * * * * *
* * * * * * * * *
* * * * * * * *
* * * * * * *
* * * * * *
* * * * *
* * * *
* * *
* *
*

*/

import java.util.Scanner; 

public class ForForTest {
	public static void main(String[] args) {
		
		//  �ϲ�
		
		// i ���� ��
		for (int i = 1; i <= 9; i++) {
			
			// j ���� �� 
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			
			// ����
			System.out.println();
		}
		
		
		
		// �²�
		for (int i = 1; i <= 8; i++) {
			
			for (int j = 8; j >= i; j--) {
				System.out.print("* ");
			}
			
			// ����
			System.out.println();
		}
		
		
		
	}
}