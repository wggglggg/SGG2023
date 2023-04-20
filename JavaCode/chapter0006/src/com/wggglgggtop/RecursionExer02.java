package com.wggglgggtop;

/**
 * ClassName: RecursionExer02
 * Description:
 *      //    练习2：
 *      //    已知有一个数列：f(0) = 1,f(1) = 4,
 *      //    f(n+2)=2*f(n+1) + f(n),其中n是大于0的整数，求f(10)的值。
 * @Author wggglggg
 * @Create 2023/3/18 14:38
 * @Version 1.0
 */
public class RecursionExer02 {
    public static void main(String[] args) {
        RecursionExer02 test = new RecursionExer02();

        System.out.println(test.f(10)); //10497

    }

    public int f(int n) {
        if (n == 0) {
            return 1;
        }else if(n == 1) {
            return 4;
        }else{
            return 2*f(n-1) + f(n-2);
        }
    }
}
