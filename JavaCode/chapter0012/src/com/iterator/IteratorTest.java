package com.iterator;

import com.collection.CollectionTest;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * ClassName: IteratorTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/16 15:07
 * @Version 1.0
 */
public class IteratorTest {

    @Test
    public void test1(){
        Collection collection =  new ArrayList();
        collection.add("Android");
        collection.add("IPhone");
        collection.add("Windows");
        collection.add("Linux");
        collection.add("HMS");

        Iterator iterator = collection.iterator();

//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }

//        iterator.remove();
        System.out.println(collection.isEmpty());       // false
    }
}
