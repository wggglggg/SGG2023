package com.generic.exer2;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

/**
 * ClassName: Exer2
 * Description:
 *      （1）创建一个ArrayList集合对象，并指定泛型为<Integer>
 *
 *      （2）添加5个[0,100)以内的随机整数到集合中
 *
 *      （3）使用foreach遍历输出5个整数
 *
 *      （4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
 *
 *      （5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
 * @Author wggglggg
 * @Create 2023/4/20 19:29
 * @Version 1.0
 */
public class Exer2 {
    @Test
    public void test1(){
        //（1）创建一个ArrayList集合对象，并指定泛型为<Integer>
        List<Integer> list = new ArrayList<>();

        //（2）添加5个[0,100)以内的随机整数到集合中
        for (int i = 0; i < 5; i++) {
            list.add ((int) (Math.random() * (99 - 0 + 1)));
        }

        // （3）使用foreach遍历输出5个整数
        for (Integer l :
                list) {
            System.out.print(l + " ,");
        }

        // （4）使用集合的removeIf方法删除偶数，为Predicate接口指定泛型<Ineteger>
        list.removeIf(new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                return integer > 50 && integer < 99;
            }
        });
        System.out.println();
        // （5）再使用Iterator迭代器输出剩下的元素，为Iterator接口指定泛型<Integer>
        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
        }

    }
}
