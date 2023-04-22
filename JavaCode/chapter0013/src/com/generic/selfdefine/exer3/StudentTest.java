package com.generic.selfdefine.exer3;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: StudentTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/22 19:54
 * @Version 1.0
 */
public class StudentTest {
    @Test
    public void test1(){
        Student<String> HanMeiMei = new Student<>("HanMeiMei", "及格");
        Student<Double> LiLen = new Student<>("LiLei", 65.0);
        Student<Character> Lucy = new Student<>("Lucy", 'C');
        Student<Character> Lilly = new Student<>("Lilly", 'B');

        HashSet set = new HashSet();

        set.add(HanMeiMei);
        set.add(Lilly);
        set.add(LiLen);
        set.add(Lucy);

//        Iterator iterator = set.iterator();
//
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

        ArrayList arrayList = new ArrayList<Student>(set);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }



}
