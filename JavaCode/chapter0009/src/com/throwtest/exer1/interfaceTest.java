package com.throwtest.exer1;

import org.junit.Test;

/**
 * ClassName: interfaceTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/6 19:07
 * @Version 1.0
 */
public class interfaceTest {
    @Test
    public void test1(){
        ComparableCircle c1  = new ComparableCircle(7.5);
        ComparableCircle c2  = new ComparableCircle(3);


        try {
            int compareValue = c1.compareTo(c2);
            if (compareValue > 0) {
                System.out.println("c1对象大");
            } else if (compareValue < 0) {
                System.out.println("c2对象大");
            } else {
                System.out.println("c1和c2一样大");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
