/*
�Ӽ��̷ֱ������ꡢ�¡��գ��ж���һ���ǵ���ĵڼ���
ע���ж�һ���Ƿ�������ı�׼��
 1�����Ա� 4 �����������ɱ� 100 ����
 ��
 2�����Ա� 400 ����
 
���磺1900��2200 ���ܱ� 4 ��������ͬʱ�ܱ� 100 �����������ܱ� 400 ��������������
		1696 1704 �����꣬1700ȴ���ǣ� 1796 1804�����꣬ 1800ȴ���ǣ���Ϊ�ܱ�4��100ͬʱ�����Ͳ������ꡣ
		����ǰ���������жϣ�ֱ�Ӿ��ܱ� 400��������Ҳ������
*/

import java.util.Scanner;

class SwitchCaseTest3{
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// �������
		System.out.print("������Ҫ��ѯ����ݣ�");
		int year = input.nextInt();
		
		// �����·�
		System.out.print("������Ҫ��ѯ���·ݣ�");
		int month = input.nextInt();
		
		// ��������
		System.out.print("������Ҫ��ѯ�����ڣ�");
		int day = input.nextInt();
		
		// ����һ��Int����������ڼ�������Ľ��,Ĭ��ֵΪ0
		int sumDays = 0;
		
		// ������������������·������ǵ���ڼ���
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
			case 3:				// ���ǵ�����������������Ҫ�ж��Ƿ�����
				sumDays += 28;
				
				// �ж��Ƿ�����
				if (year % 4  == 0 && year % 100 != 0 || year % 400 == 0) {
					sumDays += 1;
					System.out.println("������� " + year + " ��������");
				}else{
					System.out.println("������� " + year + " �겻������");
				}
				
			case 2:
				sumDays += 31;
			case 1:
				sumDays += day;										
		}
		
		// ��ӡ���ڼ���Ľ��,  3��1��  �ǵ� 60 ��
		System.out.println(year + "��" + month + "��" + day + "���� " + year+ " ��� " + sumDays + " ��");
		
		// ����Scanner���󣬷�ֹ�ڴ�ٳ�
		input.close();
	}
}