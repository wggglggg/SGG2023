
/*
���� 3��
��С���μ� Java ���ԣ����͸�������Ⱥ��ɳ�ŵ��
�����
�ɼ�Ϊ 100 ��ʱ������һ���ܳ���
�ɼ�Ϊ(80��99]ʱ������һ��ɽ�����г���
���ɼ�Ϊ[60,79]ʱ����������Ӱ��һ���Σ�
����ʱ������һ�١�
˵����Ĭ�ϳɼ�����[0,100]��Χ��

*/

class IfElseTest3 {
	public static void main (String[] args) {
		
		
		int score = 66;
		
		if(score == 100) {
			System.out.println("����һ���ܳ�");
		}else if(score <= 99 && score >= 80) {
			System.out.println("����һ��ɽ�����г�");
		}else if(score < 80 && score >= 60){
			System.out.println("��������Ӱ��һ����");
		}else{
			System.out.println("����һ����");
		}
	}
}
