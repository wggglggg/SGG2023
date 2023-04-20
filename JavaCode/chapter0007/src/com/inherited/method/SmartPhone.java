package com.inherited.method;

/**
 * ClassName: SmartPhone
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/25 15:28
 * @Version 1.0
 */
public class SmartPhone extends Phone{



    public void call() {
        System.out.println("语言通话 OR 视频通话");

    }

    @Override
    public void showNum() {
        System.out.println("来电显示号码");
        System.out.println("来电头像");
    }
}

