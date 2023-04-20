import java.util.Scanner;

/**
 * ClassName: WeekArrayTest
 * Description:
 *      案例 2：输出英文星期几
 *      用一个数组，保存星期一到星期天的 7 个英语单词，从键盘输入 1-7，显示对
 *      应的单词
 *      {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"}
 * @Author wggglggg
 * @Create 2023/3/11 11:33
 * @Version 1.0
 */
public class WeekArrayTest {
    public static void main(String[] args) {
        // 声明并初始化星期的数组
        String[] aWeek =  {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};

        // 使用Scanner获取用户输入的数字1-7
        Scanner input = new Scanner(System.in);
        System.out.print("请输入[1-7]范围的整数: ");
        int number = input.nextInt();

        if (number > 7 || number < 1) {
            System.out.println("非法数字，请输入1-7的整数");
        }

        System.out.println("对应的星期为：" + aWeek[number - 1]);

        // 关闭Scanner
        input.close();
    }
}
