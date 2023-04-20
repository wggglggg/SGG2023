package com.map.exer1;

import java.util.*;

/**
 * ClassName: SingerTest
 * Description:
 *      添加几位歌手以及你喜欢他唱过的歌曲,并遍历
 * @Author wggglggg
 * @Create 2023/4/18 15:30
 * @Version 1.0
 */
public class SingerTest {
    public static void main(String[] args) {
        HashMap singers = new HashMap();

        String singer1 = "伊能静";
        Set songs1 = new HashSet();
        songs1.add("萤火虫");
        songs1.add("电话中拥抱你");
        songs1.add("19岁的最后一天");
        songs1.add("annie`s talk");
        songs1.add("我是猫");

        String singer2 = "孙燕姿";
        Set songs2 = new HashSet();
        songs2.add("我不难过");
        songs2.add("Honey Honey");
        songs2.add("半句再见");
        songs2.add("原点");


        singers.put(singer1, songs1);
        singers.put(singer2, songs2);

        Set entrySet = singers.entrySet();

        // 方式一
        for (Object entry : entrySet) {
            Map.Entry entry1 = (Map.Entry) entry;
            System.out.println("歌手: " + entry1.getKey());
            System.out.println("歌曲: " + entry1.getValue());

        }
        // 方式二
//        Iterator iterator = entrySet.iterator();
//
//        while (iterator.hasNext()) {
//            Map.Entry entry = (Map.Entry) iterator.next();
//            System.out.println("歌手: " + entry.getKey());
//            System.out.println("歌曲: " + entry.getValue());
//        }
    }
}
