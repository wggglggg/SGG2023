package com.buffered;

import org.junit.Test;

import java.io.*;
import java.sql.Time;
import java.util.Date;

/**
 * ClassName: BufferedSteamTest
 * Description:
 *      BufferedInputStream + BufferedOutputStream 复制文件
 * @Author wggglggg
 * @Create 2023/4/28 15:47
 * @Version 1.0
 */
public class BufferedSteamTest {
    @Test
    public void test1(){
        long start = System.currentTimeMillis();

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("F:\\迅雷下载\\zh-cn_windows_11_business_editions_version_22h2_updated_april_2023_x64_dvd_7f3f319b.iso");
            File destFile = new File("F:\\迅雷下载\\zh-cn_windows_11_business_editions_version_22h2.iso");

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

        long end = System.currentTimeMillis();

        System.out.println("花费时间为: " + (end - start) / 1000);
    }
}
