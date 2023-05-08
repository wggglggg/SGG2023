package com.api._01optional;

import org.junit.Test;

import java.util.Optional;

/**
 * ClassName: OptionalTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/8 20:09
 * @Version 1.0
 */
public class OptionalTest {
    //使用Optional避免空指针的问题
    @Test
    public void test1(){

        String star = "乒乓球";
        String other = "羽毛球";
        star = null;

        //1. 实例化：
        //ofNullable(T value)`：用来创建一个Optional实例，value可能是空，也可能非空
        String result = Optional.ofNullable(star)   // 如果star为null,则使用orElse内的值
        //orElse(T other):如果Optional实例内部的value属性不为null，则返回value。如果value为null，
        //则返回other。
                .orElse(other);

        // star为空,则返回在Other的值 ,如果不为空,则返回原值star
        System.out.println(result.toString());  // 羽毛球
    }
    // 接收值 可以是Optional  //get():取出内部的value值。
    @Test
    public void test2(){
        String star = "乒乓球";
        Optional<String> optionalS = Optional.ofNullable(star);

        System.out.println(optionalS.get());        //乒乓球
    }
}
