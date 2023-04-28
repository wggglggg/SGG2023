package com.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: Exer03
 * Description:
 *      练习：
 *      遍历指定文件目录下的所有文件的名称，包括子文件目录中的文件。
 *      public void printFileName(File file)  //file可能是文件，也可能是文件目录
 * @Author wggglggg
 * @Create 2023/4/27 16:24
 * @Version 1.0
 */
public class Exer03 {
    @Test
    public void test1(){
        File file = new File("F:\\Android第三版JAVA");
        printFileName(file);

    }

    public void printFileName(File file) {


        if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (File l : list){
                printFileName(l);
            }

        } else if (file.isFile()){
            if (file.getName().endsWith(".jpg")){
                System.out.println(file.getAbsolutePath());
            }
        }


    }
}
