package com._this.exer1;

/**
 * ClassName: GirlBoyTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/21 9:30
 * @Version 1.0
 */
public class GirlBoyTest {
    public static void main(String[] args) {

        Boy Jack = new Boy("Jack", 20);
        Girl Rose = new Girl("Rose", 21);

        Jack.marry(Rose);

        Jack.shout();

        Girl Juliet = new Girl("Juliet", 24);
        Boy David = new Boy("David", 23);

        int compare = Rose.compare(Juliet);
    }
}
