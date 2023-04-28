package com.buffered.exer;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputOutputStreamTest
 * Description:
 *      分别使用文件流(FileInputStream、FileOutputStream)和缓冲流(BufferedInputStream、BufferedOutputStream)
 *      实现文本文件/图片/视频文件的复制。并比较二者在数据复制方面的效率
 * @Author wggglggg
 * @Create 2023/4/28 16:32
 * @Version 1.0
 */
public class InputOutputStreamTest {

    @Test
    public void test1(){
        long start = System.currentTimeMillis();
        String srcPath = "F:\\迅雷下载\\zh-cn_windows_11_business_editions_version_22h2_updated_april_2023_x64_dvd_7f3f319b.iso";
        String descPath = "F:\\迅雷下载\\zh-cn_windows_11_business_editions_version_22h2.iso";

//        copyFileWithFile(srcPath, descPath);      // 20.542秒
        copyFileWithBuffered(srcPath, descPath);    // 16.403秒

        long end = System.currentTimeMillis();

        System.out.println("花费的时间为：" + (end - start));
    }

    // 文件流(FileInputStream、FileOutputStream)
    public void copyFileWithFile(String scrPath, String descPath){
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File(scrPath);
            File destFile = new File(descPath);

            //2. 创建相关的字节流  stream
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出  字节流 装入到小车 byte[]
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

    // 缓冲流(BufferedInputStream、BufferedOutputStream)
    public void copyFileWithBuffered(String srcPath, String descPath){
        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File(srcPath);
            File destFile = new File(descPath);

            //2. 创建相关的字节流、缓冲流
            bis = new BufferedInputStream(new FileInputStream(srcFile));
            bos = new BufferedOutputStream(new FileOutputStream(destFile));

            //3. 数据的读入和写出
            byte[] bBuffer = new byte[1024];        //1kb
            int len;                                //记录每次读入到buffer中字节的个数
            while ((len = bis.read(bBuffer)) != -1) {
                bos.write(bBuffer, 0, len);
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            //外层的流的关闭
            //由于外层流的关闭也会自动的对内层的流进行关闭操作。所以可以省略内层流的关闭
            try {
                if (bos != null)
                    bos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (bis != null)
                    bis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
