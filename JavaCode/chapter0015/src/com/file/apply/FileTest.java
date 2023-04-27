package com.file.apply;

import org.junit.Test;

import java.io.File;

/**
 * ClassName: FileTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/26 20:23
 * @Version 1.0
 */
public class FileTest {

    /**
     * `public File(String pathname) ` ：以pathname为路径创建File对象，可以是绝对路径或者相对路径，如果pathname是相对路径，则默认的当前路径在系统属性user.dir中存储。
     * `public File(String parent, String child) ` ：以parent为父路径，child为子路径创建File对象。
     * `public File(File parent, String child)` ：根据一个父File对象和子文件路径创建File对象
     */
    @Test
    public void test1(){
        // public File(String pathname)
        File file1 = new File("123.md");
        // public File(String parent, String child)
        // 参数1：一定是一个文件目录
        // 参数2：可以是一个文件，也可以是一个文件目录
        File file2 = new File("111", "111.md");
        // public File(File parent, String child)
        //参数1：一定是一个文件目录
        //参数2：可以是一个文件，也可以是一个文件目录
        File file3 = new File(file2, "222.md" );
        File file4 = new File(file2.getAbsolutePath(), "333.md");
        // 绝对路径
        File file5 = new File("f:\\444\\444.md");
        File file6 = new File("f:/444/444.md");
        File file7 = new File("f:/444", "444.md");

    }
}
