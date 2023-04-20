package com.wggglgggtop;

/**
 * ClassName: RecursionExer01
 * Description:
 *      练习1：
 *      已知一个数列：f(20) = 1,f(21) = 4,f(n+2) = 2*f(n+1)+f(n),
 *      其中n是大于0的整数，求f(10)的值。
 * @Author wggglggg
 * @Create 2023/3/18 14:19
 * @Version 1.0
 */
public class RecursionExer01 {
    public static void main(String[] args) {
        RecursionExer01 test = new RecursionExer01();

        System.out.println(test.f(10));
    }

    public int f (int n) {
        if (n == 20) {
            return 1;
        }else if(n == 21){
            return 4;
        }else{
            // f(12) - 2*f(11)
            // f(14) - 2*f(13)
            // f(16) - 2*f(15)
            // .........接近if条件，所以方向正确
            return f(n+2) - 2*f(n+1);
        }
    }
}
