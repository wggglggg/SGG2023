
/*
���� 3���������� 2��10 ���Ժ����ܼ���
Ҫ�󣺿���̨���"�������� 2��10 ���Ժ����� x"��
*/

class ConditionExer3 {
	public static void main (String[] args) {
		
		
		int whatDay = 3;
		whatDay += 10;
		whatDay %= 7;    // ȡ��10�������ڲ���7���ȡ��������֪10������ܼ�
		
		
		System.out.println("�������ܶ���10 ���Ժ����ܼ�: ���� " + ((whatDay == 0)? "��" : whatDay));

	}
}
