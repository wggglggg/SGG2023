package com.throwtest.exer4;

/**
 * ClassName: DivisionDemo
 * Description:
 *  编写应用程序DivisionDemo.java，接收命令行的两个参数，要求不能输入负数，计算两数相除。
 * 	对数据类型不一致(NumberFormatException)、缺少命令行参数(ArrayIndexOutOfBoundsException、
 *   	除0(ArithmeticException)及输入负数(BelowZeroException 自定义的异常)进行异常处理。
 *
 * 提示：
 * 	(1)在主类(DivisionDemo)中定义异常方法(divide)完成两数相除功能。
 * 	(2)在main()方法中调用divide方法，使用异常处理语句进行异常处理。
 * 	(3)在程序中，自定义对应输入负数的异常类(BelowZeroException)。
 * 	(4)运行时接受参数 java DivisionDemo 20 10   //args[0]="20" args[1]="10"
 * 	(5)Interger类的static方法parseInt(String s)将s转换成对应的int值。
 *         如：int a=Interger.parseInt("314");	//a=314;
 * @Author wggglggg
 * @Create 2023/4/6 19:40
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {


        try {
            int result = divide(args[0], args[1]);
            System.out.println(result);
        } catch (UnderZeroException e) {
            e.printStackTrace();
        } catch (NumberFormatException e) {
            System.out.println("对数据类型不一致");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("缺少命令行参数");
        } catch (ArithmeticException e) {
            System.out.println("不能输入0");
        }
    }

    public static int divide (String s1, String s2) throws UnderZeroException{

        int m = Integer.parseInt(s1);
        int n = Integer.parseInt(s2);

        if (m < 0 || n < 0) {
            throw new UnderZeroException ("不能输入负数");
        }

        return m / n;

    }
}
