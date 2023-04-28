package com.file.exer2;

import org.junit.Test;

import java.io.File;
import java.io.FilenameFilter;

/**
 * ClassName: Exer2
 * Description:
 *          练习：
 *              判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
 *          提示：File类提供了文件过滤器方法(拓展)
 *               public String[] list(FilenameFilter filter)
 * @Author wggglggg
 * @Create 2023/4/27 16:05
 * @Version 1.0
 */
public class Exer2 {
    // 方法一
    @Test
    public void test1(){
        File dir = new File("F:\\Android第三版JAVA\\Android第3版源码\\android3\\chapter20\\src\\main\\res\\drawable-xhdpi");

        // 将目录中的文件和文件夹存入一个String[]中
        String[] fileList = dir.list();
        for (String f : fileList) {
            if (f.endsWith(".jpg")) {
                System.out.println(f);
            }
        }
    }

    // 方式二
    @Test
    public void test2(){
        File dir = new File("F:\\Android第三版JAVA\\Android第3版源码\\android3\\chapter20\\src\\main\\res\\drawable-xhdpi");

        // 将目录中的文件和文件夹存入一个String[]中,条件为endWith(".jpg")
        String[] listJpg = dir.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                return name.endsWith(".jpg");
            }
        });

        for (String l : listJpg){
            System.out.println(l);
        }

    }
}
