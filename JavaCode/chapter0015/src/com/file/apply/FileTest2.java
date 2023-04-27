package com.file.apply;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: FileTest2
 * Description:
     * public String getName() ：获取名称
     * public String getPath() ：获取路径
     * public String getAbsolutePath()`：获取绝对路径
     * public File getAbsoluteFile()：获取绝对路径表示的文件
     * public String getParent()`：获取上层文件目录路径。若无，返回null
     * public long length() ：获取文件长度（即：字节数）。不能获取目录的长度。
     * public long lastModified() ：获取最后一次的修改时间，毫秒值
 * @Author wggglggg
 * @Create 2023/4/26 20:39
 * @Version 1.0
 */
public class FileTest2 {
    @Test
    public void test1(){
        File file1 = new File("f:\\hello.txt");  // hello java
        System.out.println(file1.getName());        // hello.txt
        System.out.println(file1.getPath());        // f:\hello.txt
        System.out.println(file1.getAbsolutePath());// f:\hello.txt
        System.out.println(file1.getAbsoluteFile());// f:\hello.txt
        System.out.println(file1.getParent());      // f:\
        System.out.println(file1.getAbsoluteFile().getParent()); // f:\
        System.out.println(file1.length());         // 10         hello java
        System.out.println(new Date(file1.lastModified()));   // 1682513221643 创建时间标记Wed Apr 26 20:47:01 CST 2023
    }

    @Test
    public void test2(){
        File file = new File("F:\\迅雷下载");
        String[] fileList = file.list();

        for (String f: fileList){
            System.out.println(f);
        }

        System.out.println();

        File[] files = file.listFiles();

        for (File f : files) {
            System.out.println(f);
        }
    }

    /*
    File类的重命名功能
    - public boolean renameTo(File dest):把文件重命名为指定的文件路径。

    举例：
    file1.renameTo(file2):要想此方法执行完，返回true。要求：
       file1必须存在，且file2必须不存在，且file2所在的文件目录需要存在。
    * */
    @Test
    public void test3(){
        File file1 = new File("F:\\hello.txt");
        File file2 = new File("F:\\java.txt");

        boolean renameTo = file1.renameTo(file2);

        System.out.println((renameTo)? "命名成功" : "命名失败");

    }

    /*
    判断功能的方法
        - `public boolean exists()` ：此File表示的文件或目录是否实际存在。
        - `public boolean isDirectory()` ：此File表示的是否为目录。
        - `public boolean isFile()` ：此File表示的是否为文件。
        - public boolean canRead() ：判断是否可读
        - public boolean canWrite() ：判断是否可写
        - public boolean isHidden() ：判断是否隐藏
     */
    @Test
    public void test4(){
        File file = new File("F:\\java.txt");
        /*
            true
            false
            true
            true
            true
            false
         */

        System.out.println(file.exists());
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());
        System.out.println(file.canRead());
        System.out.println(file.canWrite());
        System.out.println(file.isHidden());

        System.out.println();

        /*
            true
            true
            false
            true
            true
            false
         */
        File file1 = new File("F:\\迅雷下载");
        System.out.println(file1.exists());
        System.out.println(file1.isDirectory());
        System.out.println(file1.isFile());
        System.out.println(file1.canRead());
        System.out.println(file1.canWrite());
        System.out.println(file1.isHidden());
    }

    /*
    创建、删除功能
    - `public boolean createNewFile()` ：创建文件。若文件存在，则不创建，返回false。
    - `public boolean mkdir()` ：创建文件目录。如果此文件目录存在，就不创建了。如果此文件目录的上层目录不存在，也不创建。
    - `public boolean mkdirs()` ：创建文件目录。如果上层文件目录不存在，一并创建。
    - `public boolean delete()` ：删除文件或者文件夹
      删除注意事项：① Java中的删除不走回收站。② 要删除一个文件目录，请注意该文件目录内不能包含文件或者文件目录。
    * */
    @Test
    public void test5() throws IOException {
        File file = new File("f:\\java.txt");
        if (!file.exists()){
            boolean success = file.createNewFile();
            if (success) {
                System.out.println("创建成功");
            }
        } else {
            System.out.println("文件已经存在");

            System.out.println(file.delete() ? "删除成功" : "删除失败");
        }
    }

    @Test
    public void test6(){
        File file1 = new File("F:\\code0\\code01");
        file1.mkdir();  // false     code0不存在,所以无法创建code01

        File file2 = new File("F:\\code0\\code01");
        file1.mkdirs(); // true   code0不存在,code0与code01都创建好
    }
}
