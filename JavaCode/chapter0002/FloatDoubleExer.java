/*
���� 1������Բ���ʲ���ֵΪ 3.14������ 3 ��Բ�İ뾶�ֱ�Ϊ 1.2��2.5��6����
���ǵ������
*/

class FloatDoubleExer{
	public static void main(String[] args) {
		
		// Բ���ʳ���
		double pi = 3.14;
		
		// ����Բ�뾶ֵ
		double radius1 = 1.2;
		double radius2 = 2.5;
		int radius3 = 6;
		
		//��������Բ�뾶������ʾ
		double area1 = pi * radius1 * radius1;
		double area2 = pi * radius3 * radius3;
		double area3 = pi * radius3 * radius3;
		
		System.out.println("�뾶Ϊ��" + radius1 + ", ���Ϊ��" + area1);
		System.out.println("�뾶Ϊ��" + radius2 + ", ���Ϊ��" + area2);
		System.out.println("�뾶Ϊ��" + radius3 + ", ���Ϊ��" + area3);
	}
}