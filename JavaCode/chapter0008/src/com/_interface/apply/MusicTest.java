package com._interface.apply;

/**
 * ClassName: MusicTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 14:20
 * @Version 1.0
 */
public class MusicTest {
    public static void main(String[] args) {

        Phone phones = new RedMi();

        phones.play();
        phones.stop();
        phones.call();
    }
}
