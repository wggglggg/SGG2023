/*
案例 4：折纸珠穆朗玛峰
世界最高山峰是珠穆朗玛峰，它的高度是 8848.86 米，假如我有一张足够大的纸，它
的厚度是 0.1 毫米。
请问，我折叠多少次，可以折成珠穆朗玛峰的高度?
*/

public class ZFTest {
	public static void main(String[] args) {
		
		// 珠峰高度单位毫米
		int zf = 8848860;
		// 纸的厚度
		double paper = 0.1;
		// 折叠次数
		int count = 0;
		
		// 循环累加折纸的高度并与珠峰作对比
		while(paper < zf) {
			
			
			paper *= 2;
			count++;
		}
		
		System.out.println("对折后paper的次数为：" + count + " 次" );
		System.out.println("对折后paper的高度为：" + paper/1000 + "米， 已经超过了珠峰8848.86米" );
	}
}