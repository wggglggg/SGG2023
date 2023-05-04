package com.lambda.function;

import org.junit.Test;

/**
 * ClassName: MyFunctionInterfaceTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/4 16:14
 * @Version 1.0
 */
public class MyFunctionInterfaceTest {
    @Test
    public void test1(){
        MyFunctionInterface myFunctionInterface = () -> System.out.println("ImageView由View类派生而来");

        myFunctionInterface.method();       // ImageView由View类派生而来
    }
}
