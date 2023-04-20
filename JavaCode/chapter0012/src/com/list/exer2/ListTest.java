package com.list.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * ClassName: ListTest
 * Description:
 *          定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
         * (1) 创建集合，集合存放随机生成的30个小写字母
         *
         * (2) 用listTest统计，a、b、c、x元素的出现次数
         *
         * (3) 效果如下
 * @Author wggglggg
 * @Create 2023/4/16 20:03
 * @Version 1.0
 */
public class ListTest {

    // 定义方法public static int listTest(Collection list,String s)统计集合中指定元素出现的次数
    @Test
    public void test1(){
         List list = new ArrayList();

        for (int i = 0; i < 30; i++) {
            //'a' - 'z'  [97,122]
            list.add( (char) (Math.random() * (122 - 97 + 1) + 97)  + "");
        }

        System.out.println(list);

        int bCount = listTest(list, "b");
        int zCount = listTest(list, "z");
        int fCount = listTest(list, "f");
        int vCount = listTest(list, "v");
        int kCount = listTest(list, "k");

        /*
        [r, l, g, c, g, i, w, e, t, n, t, l, n, w, q, k, p, e, f, f, r, z, g, y, h, f, x, k, a, t]
        b:0
        z:1
        f:3
        v:0
        k:2
         */

        System.out.println("b:" + bCount);
        System.out.println("z:" + zCount);
        System.out.println("f:" + fCount);
        System.out.println("v:" + vCount);
        System.out.println("k:" + kCount);

    }

    public static int listTest(Collection list, String s) {
        int count = 0;
        for (Object c : list) {
            if (s.equals(c)) {
                count++;
            }
        }
        return count;
    }
}
