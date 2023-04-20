package com._interface.exer2;

/**
 * ClassName: CompareTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 15:08
 * @Version 1.0
 */
public class CompareTest {
    public static void main(String[] args) {
//        ComparableCircle c1 = new ComparableCircle();
//        c1.setRadius(3.5);
        ComparableCircle c1 = new ComparableCircle(3.5);
        ComparableCircle c2 = new ComparableCircle();
        c2.setRadius(73.2);

        // compare 0 相同, 1 前面大, -1 后面大
        System.out.println(c1.compareTo(c2));   // -1 后面大

    }

}
