/*
���� 3��ATM ȡ��
�������� balance ����ʼ��Ϊ 0�����Ա�ʾ�����˻���������ͨ�� ATM ������ʵ
�ִ�ȡ��ȹ��ܡ�
=========ATM========
 1�����
 2��ȡ��
 3����ʾ���
 4���˳�
��ѡ��(1-4)��
*/

import java.util.Scanner; 

public class ATM {
	public static void main(String[] args) {
		
		// �˻������
		double balance = 0.00;
		// ��ʼ������
		//Scanner input = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);
		// ����
		boolean flag = true;

		
		// ����������ż���ĺ͡�ż���ĸ���
		
		do{
			System.out.println("=========ATM========");
			System.out.println(" 1�����");
			System.out.println(" 2��ȡ��");
			System.out.println(" 3����ʾ���");
			System.out.println(" 4���˳�");
			System.out.print("��ѡ��(1-4)��");
			// ���ܲ˵�ѡ��ֵ 
			// int selection = input.nextInt();
			int selection = scan.nextInt();

			switch (selection) {
				case 1:
					System.out.print("���������");
					double addMoney = scan.nextDouble();
					balance += addMoney;
					break;
				case 2:
					System.out.print("������ȡ���");
					double minsMoney = scan.nextDouble();
					if(minsMoney > 0 && balance >= minsMoney) {
						balance -= minsMoney;
					}else if(minsMoney > balance) {
						System.out.println("������˼�����㣡��");
					}else{
						System.out.println("������˼������������������");
					}
					break;
				case 3:
					System.out.println("��������ǣ�" + balance);
					break;
				case 4:
					System.out.println("��ӭ���ٴι��٣�����");
					flag = false;
					break;
				default:
					System.out.println("������1����4֮������֣�");
					break;
			}
		}while(flag);
		
		scan.close();
	}
}