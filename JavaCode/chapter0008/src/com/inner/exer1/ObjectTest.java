package com.inner.exer1;

import org.w3c.dom.ls.LSOutput;

/**
 * ClassName: ObjectTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 15:07
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {

//        SubObject sub = new SubObject();
//        sub.sofa();

        new SubObject(){
            public void sofa() {
                System.out.println("new SubObject has a sofa");
            }
        }.sofa();

        A a = new A(){
            public void pear(){
                System.out.println("a has a pear");
            }
        };
        a.pear();

        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();


    }
}
class A extends Object{

    public void pear() {
//        System.out.println(" A has a pear");
    }
}

class SubObjects extends Object{
    public void test(){
        System.out.println("尚硅谷");
    }
}



