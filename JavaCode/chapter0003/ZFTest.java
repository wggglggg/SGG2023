/*
���� 4����ֽ���������
�������ɽ������������壬���ĸ߶��� 8848.86 �ף���������һ���㹻���ֽ����
�ĺ���� 0.1 ���ס�
���ʣ����۵����ٴΣ������۳����������ĸ߶�?
*/

public class ZFTest {
	public static void main(String[] args) {
		
		// ���߶ȵ�λ����
		int zf = 8848860;
		// ֽ�ĺ��
		double paper = 0.1;
		// �۵�����
		int count = 0;
		
		// ѭ���ۼ���ֽ�ĸ߶Ȳ���������Ա�
		while(paper < zf) {
			
			
			paper *= 2;
			count++;
		}
		
		System.out.println("���ۺ�paper�Ĵ���Ϊ��" + count + " ��" );
		System.out.println("���ۺ�paper�ĸ߶�Ϊ��" + paper/1000 + "�ף� �Ѿ����������8848.86��" );
	}
}