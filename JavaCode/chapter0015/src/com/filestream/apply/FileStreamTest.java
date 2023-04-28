package com.filestream.apply;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: FileStreamTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/28 9:28
 * @Version 1.0
 */
public class FileStreamTest {
    /*
     * 需求：复制一份Wrc_Subaru.jpg文件，命名为Wrc_Subaru_copy.jpg
     *
     * */
    @Test
    public void test1() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("Wrc_Subaru.jpeg");
            File destFile = new File("Wrc_Subaru_copy.jpg");

            //2. 创建相关的字节流  stream
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出  装字节游戏装入到小车 byte[]
            byte[] bBuffer = new byte[1024];    // 1kb = 1024b
            int len;    //记录每次读入到buffer中字节的个数
            while ((len = fis.read(bBuffer)) != -1) {
                fos.write(bBuffer, 0, len);
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /*
     * 需求：复制一份hello.txt文件，命名为hello_copy1.txt
     *
     *  可以使用字节流实现文本文件的复制。
     * */
    @Test
    public void test2() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("filereaderwriter.txt");
            File destFile = new File("filereaderwriter_copy_stream.txt");

            //2. 创建相关的字节流  stream
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出  装字节游戏装入到小车 byte[]
            byte[] bBuffer = new byte[5];
            int len;
            while ((len = fis.read(bBuffer)) != -1) {
                fos.write(bBuffer, 0, len);
            }

            System.out.println("复制成功");

        } catch (IOException e) {
            e.printStackTrace();

        } finally {
            //4. 关闭资源
            try {
                if (fos != null)
                    fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fis != null)
                    fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
