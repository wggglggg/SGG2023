
/*
��ϰ 1��
��Ҷ�֪�����д󵱻飬Ů�󵱼ޡ���ôŮ���ҳ�Ҫ��Ů������ȻҪ���һ������
�����ߣ�180cm ���ϣ������Ƹ� 1 ǧ�����ϣ�˧���ǡ�
�������������ͬʱ���㣬�򣺡���һ��Ҫ�޸���!!!��
�������������Ϊ���������򣺡��ްɣ����ϲ��㣬�������ࡣ��
������������������㣬�򣺡����ޣ���
*/

import java.util.Scanner;

class ScannerExer1 {
	public static void main (String[] args) {
	
	    Scanner scan = new Scanner(System.in);
		
		System.out.print("������������cm��");
		int height = scan.nextInt();				// ��ȡ�û���������
		
		System.out.print("��������ĲƸ� ��λ��ǧ��");
		double wealth = scan.nextDouble();				// ��ȡ�û�����ĲƸ�
		
		System.out.print("˧���� ��/��");
		String isHandsome = scan.next();		// ��ȡ�û����������,��string���ܣ���������equals()���Ƚ�
		
		if(height >= 180 && wealth >= 1 && isHandsome.equals("��") ) {	// ��equals()���Ƚ��û��������Ϣ
			System.out.println("��һ��Ҫ�޸���!!!");
		}else if(height >= 180 || wealth >= 1 || isHandsome.equals("��")) {
			System.out.println("�ްɣ����ϲ��㣬�������ࡣ");
		}else{
			System.out.println("����!");
		}
		
		scan.close();							//  �ǵ�һ��Ҫ�˳�����Ȼ�ڴ��������ķ���
		
		
	}	
}
