/*
���� 1������ 1-100 ��ż��������������ż���ĺ͡�ż���ĸ������ۼӵ�˼��
*/

public class DoWhileTest1 {
	public static void main(String[] args) {
		
		// ż���ĺ�
		int sum = 0;
		// ż������
		int count = 0;
		// num���� ��һ�ν���if���ֵΪ0�����0�����ȥ������ֵҪΪ1
		int num = 1;
		
		// ����������ż���ĺ͡�ż���ĸ���
		
		do{
			if(num % 2 == 0) {
				System.out.println("1-100 ��ż��Ϊ��" + num);
				count++;
				sum += num;
			}
			num++;			// ������һ�κ�numҪ�Լ�һ�Σ������޷����� 
		}while(num <= 100);	// ���NumС�ڵ���100���ͻ����do��ѭ��
		
		System.out.println("1-100 ��ż������Ϊ��" + count);
		System.out.println("1-100 ��ż���ĺ�Ϊ��" + sum);
		
	}
}