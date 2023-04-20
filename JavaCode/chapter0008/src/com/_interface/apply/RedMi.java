package com._interface.apply;

/**
 * ClassName: RedMiNote2
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 14:05
 * @Version 1.0
 */
public class RedMi extends Phone implements Music{

    private String phoneName;
    private int RAM;
    private int ROM;
    public RedMi() {
        this.RAM = 1;
        this.ROM = 8;
    };
    public RedMi(String phoneName, int RAM, int ROM) {
        this.phoneName = phoneName;
        this.RAM = RAM;
        this.ROM = ROM;
    }
    public void call() {
        System.out.println("打电话");
    }
    public void message() {
        System.out.println("发短信");
    }

    public String getPhoneName() {
        return phoneName;
    }

    public void setPhoneName(String phoneName) {
        this.phoneName = phoneName;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getROM() {
        return ROM;
    }

    public void setROM(int ROM) {
        this.ROM = ROM;
    }

    public void play() {
        System.out.println("播放 Take me to the Moon");
    }
    public void stop() {
        System.out.println("停止音乐");
    }

    public String toString() {
        return  "Model: " + phoneName +
                "RAM: " + RAM +
                "ROM: " + ROM;
    }
}
