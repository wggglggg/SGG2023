package com.collections.exer;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: PokerMapTest
 * Description:
 *  模拟斗地主洗牌和发牌，牌没有排序
 *      效果如图。

 *      提示：不要忘了大王、小王
 * @Author wggglggg
 * @Create 2023/4/19 22:10
 * @Version 1.0
 */
public class PokerMapTest {
    String[] num = {"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
    String[] color = {"方片♦","梅花♣","红桃♥","黑桃♠"};
    HashMap poker = new HashMap();
    List indexList = new ArrayList();
    int index = 0;

    // 三位玩家与底牌
    TreeSet Hanmeimei = new TreeSet();
    TreeSet Lily = new TreeSet();
    TreeSet Lucy = new TreeSet();
    TreeSet lastThreeCards = new TreeSet();

    @Test
    public void test1(){

        // 一 组牌
        for (String c : color) {
            for (String n : num) {  // 将牌存入HashMap poder中
                poker.put(index, c.concat(n));  // key为index, value为color+num
                indexList.add(index);
                index++;
            }
        }

        poker.put(index, "小王");
        indexList.add(index++);
        poker.put(index, "大王");
        indexList.add(index);

        // 二 洗牌
        Collections.shuffle(indexList);          // 只洗index,最后展示牌是用index来取牌

        // 三 发牌
        for (int i = 0; i < indexList.size(); i++) {
            if (i >= indexList.size()-3) {
                lastThreeCards.add(indexList.get(i));
            } else if (i % 3 == 0) {
                Hanmeimei.add(indexList.get(i));
            } else if (i % 3 == 1) {
                Lily.add(indexList.get(i));
            } else if (i % 3 == 2) {
                Lucy.add(indexList.get(i));
            }
        }

        // 秀牌 每人手上都是排序好的牌
        // Hanmeimei的牌:
        //方片♦4, 方片♦6, 方片♦7, 方片♦Q, 梅花♣3, 梅花♣4, 梅花♣5, 梅花♣6, 梅花♣9, 红桃♥9, 红桃♥K, 黑桃♠2, 黑桃♠5, 黑桃♠6, 黑桃♠8, 黑桃♠J, 黑桃♠K,
        //Lily的牌:
        //方片♦A, 方片♦3, 方片♦8, 方片♦9, 方片♦J, 梅花♣7, 梅花♣10, 梅花♣J, 梅花♣Q, 梅花♣K, 红桃♥2, 红桃♥5, 红桃♥J, 黑桃♠3, 黑桃♠7, 黑桃♠10, 黑桃♠Q,
        //Lucy的牌:
        //方片♦2, 方片♦10, 梅花♣A, 梅花♣2, 红桃♥A, 红桃♥3, 红桃♥4, 红桃♥6, 红桃♥7, 红桃♥8, 红桃♥10, 红桃♥Q, 黑桃♠A, 黑桃♠4, 黑桃♠9, 小王, 大王,
        showPoker("Hanmeimei", Hanmeimei, poker);
        showPoker("Lily", Lily, poker);
        showPoker("Lucy", Lucy, poker);


    }

    /**
     * 循环TreeSet里面的index , Set自已会自动排序,然后map.get(index)来拿到map里的value,也就是每张排序后的牌
     * @param name  牌友的名字
     * @param ts    存储牌友每张牌的index
     * @param map   通过上面的index, 从HashMap中拿到牌
     */
    public static void showPoker(String name, TreeSet ts, HashMap map) {
        System.out.println(name + "的牌: ");
        for (Object index : ts) {
            System.out.print(map.get(index) + ", ");
        }
        System.out.println();
    }

}
