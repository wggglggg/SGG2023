package com.file.exer1;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer01
 * Description:
 *      练习：
 *          创建一个与hello.txt文件在相同文件目录下的另一个名为abc.txt文件
 * @Author wggglggg
 * @Create 2023/4/27 15:54
 * @Version 1.0
 */
public class Exer01 {
    @Test
    public void test1(){
        // C:\Users\wggglggg\OneDrive\venvs\JavaProjects\SGG2023\JavaCode\chapter0015\hello.txt
        File file1 = new File("hello.txt");
        // C:\Users\wggglggg\OneDrive\venvs\JavaProjects\SGG2023\JavaCode\chapter0015\
//        System.out.println(file1.getAbsoluteFile().getParent());
        File file2 = new File(file1.getAbsoluteFile().getParent(), "abc.txt");
        // C:\Users\wggglggg\OneDrive\venvs\JavaProjects\SGG2023\JavaCode\chapter0015\abc.txt
        System.out.println(file1.getAbsoluteFile());
    }
}
