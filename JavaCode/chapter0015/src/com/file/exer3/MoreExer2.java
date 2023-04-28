package com.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: MoreExer2
 * Description:
 *          拓展2：计算指定文件目录占用空间的大小
 *          public long getDirectorySize(File file)  //file可能是文件，也可能是文件目录
 * @Author wggglggg
 * @Create 2023/4/27 16:59
 * @Version 1.0
 */
public class MoreExer2 {
    @Test
    public void test1(){
        File file = new File("F:\\Android第三版JAVA");
        long directorySize = getDirectorySize(file);
        System.out.println(directorySize);

    }

    // 计算指定文件目录占用空间大小
    public long getDirectorySize(File file) {
        long size = 0;
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            for (File l : listFiles) {
                size += getDirectorySize(l);
            }
        } else if (file.isFile()) {
            size = file.length();

            System.out.println("size = " + size);
        }

        return size;
    }
}
