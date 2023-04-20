package com.wggglgggtop;

/**
 * ClassName: ValueTransferTest2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/17 15:59
 * @Version 1.0
 */
public class ValueTransferTest2 {
    public static void main(String[] args) {
        ValueTransferTest2 test = new ValueTransferTest2();
        int a = 10;
        int b = 20;
        System.out.println("a = " + a + ", b = " + b);

        //交换两个变量的值
//        a = 10, b = 20
//        a = 20, b = 10
//        int temp = a;
//        a = b;
//        b = temp;
//        System.out.println("a = " + a + ", b = " + b);

        //操作2：
        //调用方法

        System.out.println(test.swap(a, b));
        //20,10
//        a = 10, b = 20
//        a = 10, b = 20
//        操作只是swap方法，并不对main内的a与b产生影响
//        System.out.println("a = " + a + ", b = " + b);


    }

    public String swap(int a , int b) {
        int temp = a;
        a = b;
        b = temp;
        // 如果想交换，一定要把a b return回去

        return a + "," + b;
    }
}
