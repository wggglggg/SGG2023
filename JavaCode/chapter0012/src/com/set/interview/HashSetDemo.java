package com.set.interview;

import java.util.HashSet;

/**
 * @author shkstart
 * @create 15:35
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        Person p1 = new Person(1001,"AA");
        Person p2 = new Person(1002,"BB");

        set.add(p1);                    // hash校验值  33111
        set.add(p2);
        System.out.println(set);

        p1.name = "CC";                 // 改了属性不触发hashCode机制，也就没有生成新的hash校验值 还是披着33111的皮，属性name却不是AA了
//        int num = p1.hashCode();      // 手动计算会发现33175，所以只有add，remove才触发hash值校验
        set.remove(p1);                 // 先用CC计算hashcode校验值拿着33175，去数组里匹配33175,发现并没有，remove也就这样结束了
        System.out.println(set);        // name AA改成了name CC

        Person p3 = new Person(1001, "CC");
        set.add(p3);
//        System.out.println(p3.hashCode());  // add了P3，生成了hash校验值 33175,前面remove删除了空气，现在真的是33175了

        System.out.println(set);
//
        set.add(new Person(1001,"AA")); // 33111  与第一个set.add(p1)的值33111一样
        System.out.println(set);    // 虽然拿到33111，但是会去比较id 与 name,发现也不 一样,也添加到了set集合中

    }
}
