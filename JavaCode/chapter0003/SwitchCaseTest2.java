/*
���� 4����д���򣺴Ӽ��������� 2023 ��ġ�month���͡�day����Ҫ��ͨ��������
�����������Ϊ 2023 ��ĵڼ��졣
*/

import java.util.Scanner;

class SwitchCaseTest2{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// �����·�
		System.out.print("������Ҫ��ѯ���·ݣ�");
		int month = input.nextInt();
		
		// ��������
		System.out.print("������Ҫ��ѯ�����ڣ�");
		int day = input.nextInt();
		
		// ����һ��Int����������ڼ�������Ľ��,Ĭ��ֵΪ0
		int sumDays = 0;
		
		// ����������·�������2023��ڼ���
		switch(month) {
			case 12:
				sumDays += 30;
			case 11:
				sumDays += 31;
			case 10:
				sumDays += 30;
			case 9:
				sumDays += 31;
			case 8:
				sumDays += 31;
			case 7:
				sumDays += 30;
			case 6:
				sumDays += 31;
			case 5:
				sumDays += 30;
			case 4:
				sumDays += 31;
			case 3:
				sumDays += 28;
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;										
		}
		
		// ��ӡ���ڼ���Ľ��,  3��1��  �ǵ� 60 ��
		System.out.println(month + "��" + day + "����2023��� " + sumDays + " ��");
		
		// ����Scanner���󣬷�ֹ�ڴ�ٳ�
		input.close();
	}
}