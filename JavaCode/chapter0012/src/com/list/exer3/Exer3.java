package com.list.exer3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * ClassName: exer3
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/16 20:21
 * @Version 1.0
 */
public class Exer3 {
    private static ArrayList  musicList = new ArrayList();
    private static Scanner  scanner = new Scanner(System.in);
    public static void main(String[] args) {
        addMusicList();
        boolean isFlag = true;
        System.out.println("当前歌曲列表：" + musicList);      // 默认歌单

        while(isFlag) {

            System.out.println("-------------欢迎来到点歌系统------------");
            System.out.println("1.添加歌曲至列表");
            System.out.println("2.将歌曲置顶");
            System.out.println("3.将歌曲前移一位");
            System.out.println("4.退出");
            System.out.print("请输入操作序号：");

            // 用户输入菜单选择
            int input = scanner.nextInt();

            switch (input) {
                case 1:
                    addMusic();     // 添加歌曲至列表
                    System.out.println(musicList);
                    break;
                case 2:
                    setTopMusic();     // 将歌曲置顶
                    System.out.println(musicList);
                    break;
                case 3:
                    setPosition();         // 将歌曲前移一位
                    System.out.println(musicList);
                    break;
                case 4:             // 4.退出
                    System.out.println("----------------退出---------------");
                    System.out.println("您已退出系统");
                    isFlag = false;
                    break;
                default:
                    System.out.println("----------------------------------");
                    System.out.println("功能选择有误，请输入正确的功能序号!");
                    break;

            }
        }
    }

    private static void addMusicList() {
        musicList.add("本草纲目");
        musicList.add("你是我的眼");
        musicList.add("老男孩");
        musicList.add("白月光与朱砂痣");
        musicList.add("不谓侠");
        musicList.add("爱你");
    }

    private static void addMusic() {
        System.out.print("请输入要添加的歌曲名称：");
        String musicName = scanner.next();
        musicList.add(musicName);
        System.out.println("已成功添加歌曲：" + musicName);
    }

    private static void setTopMusic() {
        System.out.print("请输入要置顶的歌曲名称：");
        String musicName = scanner.next();

        int index = musicList.indexOf(musicName);       // 查找指定歌曲位置
        if (index < 0) {                                // 判断输入歌曲是否存在
            System.out.println("当前列表中没有输入的歌曲！");
        } else if (index == 0) {
            System.out.println("当前歌曲默认已置顶！");
        }else {
            musicList.remove(musicName);
//            musicList.set(0, musicName);
            musicList.add(0,musicName);
            System.out.println("已将歌曲《" + musicName + "》置顶");
        }
    }

    private static void setPosition() {
        System.out.print("请输入要置前的歌曲名称：");
        String musicName = scanner.next();
        int musicIndex = musicList.indexOf(musicName);

        if (musicIndex < 0) {
            System.out.println("当前列表中没有输入的歌曲！");
        } else if (musicIndex == 0) {// 判断歌曲是否已在第一位
            System.out.println("当前歌曲已在最顶部！");
        } else {
            musicList.remove(musicName);
            musicList.add(musicIndex - 1, musicName);
            System.out.println("已将歌曲《" + musicName + "》置前一位");
        }
    }

}
