package com.compare.comparable;

import com.compare.Product;
import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: ComparableTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/15 15:35
 * @Version 1.0
 */
public class ComparableTest {
    Product[] products = new Product[]{
            new Product("Xiaomi5X", 1200),
            new Product("IPhone5", 1200),
            new Product("IPhoneSE", 1800),
            new Product("RedmiNote2", 799),
    };
    @Test
    public void test1(){

        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }

    @Test
    public void test2(){
        Arrays.sort(products);
        for (int i = 0; i < products.length; i++) {
            System.out.println(products[i]);
        }
    }
}
