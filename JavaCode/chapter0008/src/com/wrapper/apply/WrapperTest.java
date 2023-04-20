package com.wrapper.apply;

import org.junit.Test;

/**
 * ClassName: WrapperTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/2 16:20
 * @Version 1.0
 */
public class WrapperTest {

    @Test
    public void test1(){
        int i1 = 10;
        Integer ii1 = Integer.valueOf(i1);
        System.out.println(ii1.toString());
        int ii11 = ii1.intValue();
        System.out.println(ii11);
        boolean iCompare = (ii11 == i1);
        System.out.println("````````````````````````````````");

        float f1 = 7.452452345F;
        Float ff1 = Float.valueOf(f1);
        System.out.println(ff1);
        float ff11 = ff1.floatValue();
        boolean fCompare = (ff11 == f1);
        System.out.println(fCompare);
        System.out.println("````````````````````````````````");

        String s1 = "10";
        Integer nn1 = Integer.valueOf(s1);
        System.out.println(nn1);
        int nn11 = nn1.intValue();

        // 打包方式
        Double dd1 = 35.2341324;
        System.out.println(dd1);
        System.out.println(dd1.getClass());
        // 拆包方式
        double d1 = dd1;
        System.out.println(d1);


    }
}
