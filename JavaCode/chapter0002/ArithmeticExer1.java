
/*
�������һ����������ӡ��ʾ���ĸ�λ����ʮλ������λ����ֵ��
��ʽ���£�
���� xxx ��������£�
��λ����
ʮλ����
��λ����
���磺
���� 153 ��������£�
��λ����3
ʮλ����5
��λ����1
*/

class ArithmeticExer1 {
	public static void main (String[] args) {
		int number = 593;
		
		int n1 = number % 10;
		int n2 = number / 10 % 10;
		int n3 = number / 100;
		
		System.out.println("numberΪ��" + number);
		System.out.println("��λ��Ϊ��" + n1);
		System.out.println("ʮλ��Ϊ��" + n2);
		System.out.println("��λ��Ϊ��" + n3);
	}
}
