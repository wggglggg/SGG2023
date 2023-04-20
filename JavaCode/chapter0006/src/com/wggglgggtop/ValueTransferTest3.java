package com.wggglgggtop;

/**
 * ClassName: ValueTransferTest3
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/17 16:19
 * @Version 1.0
 */
public class ValueTransferTest3 {
    public static void main(String[] args) {
        ValueTransferTest3 test = new ValueTransferTest3();

        Data data = new Data();
        data.a = 10;
        data.b = 20;

        //a = 10, b = 20
        System.out.println("a = " + data.a + ", b = " + data.b);

//        int temp = data.a;
//        data.a = data.b;
//        data.b = temp;
//        a = 10, b = 20
//        a = 20, b = 10
//        System.out.println("a = " + data.a + ", b = " + data.b);

        test.swap(data);
//        a = 10, b = 20
//        a = 20, b = 10
//        传过去一个Data对象给swap方法，所以修改swap方法里的data.a b，就是修改Data对象
        System.out.println("a = " + data.a + ", b = " + data.b);




    }
    public void swap (Data data) {
        int temp = data.a;
        data.a = data.b;
        data.b = temp;
    }
}

class Data {
    int a;
    int b;
}
