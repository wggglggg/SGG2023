package com.inputstreamreader.exer;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderDemo
 * Description:
 *
        把当前module下的《康师傅的话.txt》字符编码为GBK，复制到电脑桌面目录下的《寄语.txt》，
        字符编码为UTF-8。
 * @Author wggglggg
 * @Create 2023/4/28 17:17
 * @Version 1.0
 */
public class InputStreamReaderDemo {
    @Test
    public void test1(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("康师傅的话.txt");
            File destFile = new File("d:\\wggglggg\\Desktop\\寄语.txt");

            //2. 创建相关的转换流, 会将byte转成char类型的
            isr = new InputStreamReader(new FileInputStream(srcFile), "gbk");
            osw = new OutputStreamWriter(new FileOutputStream(destFile), "utf-8");

            //3. 数据的读入和写出  装入到小车 char[]
            char[] cBuffer = new char[1024];
            int len;
            while ((len = isr.read(cBuffer)) != -1) {
                osw.write(cBuffer, 0, len);
            }

            System.out.println("文件复制完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (osw != null)
                    osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
