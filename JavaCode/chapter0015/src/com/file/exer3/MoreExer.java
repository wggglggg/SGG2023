package com.file.exer3;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: MoreExer
 * Description:
 *      拓展1：删除指定文件目录及其下的所有文件
 *      public void deleteDirectory(File file)  //file可能是文件，也可能是文件目录
 * @Author wggglggg
 * @Create 2023/4/27 16:38
 * @Version 1.0
 */
public class MoreExer {
    @Test
    public void test1(){
        File file = new File("F:\\Android第三版JAVA");
        deleteDirectory(file);
        System.out.println("删除完毕");

    }
    public void deleteDirectory(File file){
        if (file.isDirectory()) {
            File[] list = file.listFiles();
            for (File l : list) {
                System.out.println("}}}}}}}}}}}}}");
                System.out.println(l);
                deleteDirectory(l);
            }
        }
        System.out.println("---------");
        file.delete();
    }

}
