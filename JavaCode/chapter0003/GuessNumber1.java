/*
���� 3����������Ϸ
�������һ�� 100 ���ڵ����������������Ƕ��٣�
�Ӽ�����������������ˣ���ʾ���ˣ����С�ˣ���ʾС�ˣ�������ˣ��Ͳ��ٲ��ˣ���ͳ��һ�����˶��ٴΡ�
��ʾ������һ��[a,b] ��Χ��������ķ�ʽ��(int)(Math.random() * (b - a + 1) + a)
*/

import java.util.Scanner;

class GuessNumber1{
	public static void main(String[] args) {
		
		
		int random = (int) (Math.random() * 100 + 1);		// �����,��ֹС��������ǿתInt
		Scanner input = new Scanner(System.in);					// �������̲�׽
		System.out.print("�²������Ƕ��٣���");
		int guess = input.nextInt();						// �û�����²������
		int count = 1;										// ͳ�Ʋ��˶��ٴ�
		
		
		//���� 1- 100����ӡż��
		while(guess != random) {
			
			if (guess > random) {
				System.out.print("���ǣ�" + guess + "���´���,���ٲ£�����");
				guess = input.nextInt();
			}else if (guess < random) {
				System.out.print("���ǣ�" + guess + "����С��,���ٲ£�����");
				guess = input.nextInt();
			}
			// ͳ�Ʋ��˶��ٴ�
			count++;
		}
		
		
		System.out.println("��̫���ˣ����� " + random + ", �������");
		System.out.println("��һ������ " + count +" �Σ��´�Ŭ����");
	}	
}