/**
 * ClassName: OverloadTest
 * Description:
 *      练习 2：编写程序，定义三个重载方法并调用。
 * 方法名为 mOL。
 * 三个方法分别接收一个 int 参数、两个 int 参数、一个字符串参数。分别执行平方运算并输
 * 出结果，相乘并输出结果，输出字符串信息。
 * 在主类的 main ()方法中分别用参数区别调用三个方法。
 *      练习 3：定义三个重载方法 max()，第一个方法求两个 int 值中的最大值，第二
 * 个方法求两个 double 值中的最大值，第三个方法求三个 double 值中的最大
 * 值，并分别调用三个方法。
 * @Author wggglggg
 * @Create 2023/3/16 20:00
 * @Version 1.0
 */
public class OverloadTest {

    public static void main(String[] args) {
        OverloadTest overloadTest = new OverloadTest();

        System.out.println(overloadTest.max(2.3, 90.2, 23.4));
        overloadTest.mOL(5,29);
    }

    public void mOL(int num) {
        System.out.println(num << 1);
    }

    public void mOL(int num1, int num2) {
        System.out.println(num1 * num2);
    }

    public void mOL(String str) {
        System.out.println(str);
    }

    public int max(int num1, int num2) {
        return (num1 > num2)?num1 :num2;
    }

    public double max(double dou1, double dou2) {
        return (dou1 > dou2)? dou1:dou2;
    }

    public double max(double dou1, double dou2, double dou3) {
        double tempMax = (dou1 > dou2)? dou1 : dou2;
        return (tempMax > dou3)? tempMax : dou3;
    }
}
