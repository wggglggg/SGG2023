package com.collections.exer;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * ClassName: PokerTest
 * Description:
 *      模拟斗地主洗牌和发牌，牌没有排序
 *      效果如图。

 *      提示：不要忘了大王、小王
 * @Author wggglggg
 * @Create 2023/4/19 21:38
 * @Version 1.0
 */
public class PokerTest {
    String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};
    ArrayList poker = new ArrayList();

    // 三位玩家与底牌
    List hanmeimei = new ArrayList();
    List lily = new ArrayList();
    List lucy = new ArrayList();


    List lastThreeCard = new ArrayList();

    @Test
    public void test1(){
        // 一 组合牌
        for (int i = 0; i < color.length; i++) {
            for (int j = 0; j < num.length; j++) {

                poker.add(color[i] + num[j]);
            }
        }
        // 提示：不要忘了大王、小王
        poker.add("小王");
        poker.add("大王");

        // [方片♦A, 方片♦2, 方片♦3, 方片♦4, 方片♦5, 方片♦6, 方片♦7, 方片♦8, 方片♦9, 方片♦10, 方片♦J, 方片♦Q, 方片♦K,
        //  梅花♣A, 梅花♣2, 梅花♣3, 梅花♣4, 梅花♣5, 梅花♣6, 梅花♣7, 梅花♣8, 梅花♣9, 梅花♣10, 梅花♣J, 梅花♣Q, 梅花♣K,
        //  红桃♥A, 红桃♥2, 红桃♥3, 红桃♥4, 红桃♥5, 红桃♥6, 红桃♥7, 红桃♥8, 红桃♥9, 红桃♥10, 红桃♥J, 红桃♥Q, 红桃♥K,
        //  黑桃♠A, 黑桃♠2, 黑桃♠3, 黑桃♠4, 黑桃♠5, 黑桃♠6, 黑桃♠7, 黑桃♠8, 黑桃♠9, 黑桃♠10, 黑桃♠J, 黑桃♠Q, 黑桃♠K]
        System.out.println(poker);

        // 二 洗牌
        Collections.shuffle(poker);
        /*
        [黑桃♠6, 方片♦7, 梅花♣3, 梅花♣J, 方片♦9, 方片♦2, 方片♦4, 红桃♥10, 梅花♣5, 红桃♥4, 黑桃♠3, 黑桃♠A, 黑桃♠9,
         红桃♥3, 红桃♥8, 方片♦10, 方片♦Q, 梅花♣9, 方片♦K, 红桃♥A, 黑桃♠J, 方片♦J, 方片♦5, 黑桃♠8, 红桃♥K, 黑桃♠5,
         红桃♥2, 梅花♣7, 黑桃♠2, 红桃♥7, 黑桃♠10, 梅花♣2, 黑桃♠K, 方片♦8, 方片♦6, 梅花♣10, 黑桃♠4, 红桃♥5, 梅花♣6,
         梅花♣A, 方片♦3, 红桃♥6, 红桃♥9, 梅花♣4, 方片♦A, 梅花♣Q, 黑桃♠Q, 红桃♥J, 黑桃♠7, 梅花♣K, 红桃♥Q, 梅花♣8]
         */
        System.out.println(poker);

        // 分牌
        for (int i = 0; i < poker.size(); i++) {
            if (i >= poker.size() - 3) {        // 先取出3张作为底牌
                lastThreeCard.add(poker.get(i));
            }else if (i % 3 == 0) {
                hanmeimei.add(poker.get(i));
            } else if (i % 3 == 1) {
                lily.add(poker.get(i));
            } else if (i % 3 == 2) {
                lucy.add(poker.get(i));
            }
        }


        /**
         * Hanmeimei牌为：
         * [梅花♣9, 方片♦2, 梅花♣5, 红桃♥3, 黑桃♠6, 梅花♣J, 方片♦Q, 黑桃♠5, 方片♦7, 红桃♥Q, 方片♦3, 大王, 红桃♥A, 方片♦8, 红桃♥8, 红桃♥9, 方片♦10]
         * Lily牌为：
         * [黑桃♠K, 方片♦A, 梅花♣3, 黑桃♠9, 红桃♥7, 梅花♣A, 红桃♥J, 黑桃♠A, 方片♦6, 黑桃♠Q, 红桃♥K, 梅花♣10, 梅花♣6, 梅花♣4, 方片♦4, 梅花♣2, 黑桃♠3]
         * Lucy牌为：
         * [黑桃♠2, 红桃♥6, 黑桃♠4, 方片♦5, 黑桃♠7, 梅花♣K, 黑桃♠10, 红桃♥5, 红桃♥10, 红桃♥4, 黑桃♠8, 方片♦K, 梅花♣Q, 小王, 黑桃♠J, 梅花♣8, 红桃♥2]
         * 三张底牌为：
         * [方片♦9, 梅花♣7, 方片♦J]
         */
        // 秀出每个人的牌与三张底牌
        System.out.println("Hanmeimei牌为：");
        System.out.println(hanmeimei);

        System.out.println("Lily牌为：");
        System.out.println(lily);

        System.out.println("Lucy牌为：");
        System.out.println(lucy);

        System.out.println("三张底牌为：");
        System.out.println(lastThreeCard);
    }

}
