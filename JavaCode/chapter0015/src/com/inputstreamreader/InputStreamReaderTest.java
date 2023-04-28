package com.inputstreamreader;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: InputStreamReaderTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/28 16:49
 * @Version 1.0
 */
public class InputStreamReaderTest {

    @Test
    public void test1(){
        InputStreamReader isr = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("bufferedreaderwriter_utf-8.txt");
            File srcFile2 =  new File("bufferedreaderwriter_gbk.txt");

            //2. 创建相关的转换流, 会将byte转成char类型的
//            isr = new InputStreamReader(new FileInputStream(srcFile2), "gbk");
            isr = new InputStreamReader(new FileInputStream(srcFile2),"utf-8"); // 4.1.2 Activity����������

            //3. 数据的读入和写出  装字节游戏装入到小车 char[]
            char[] cBuffer = new char[1024];
            int len;
            while ((len = isr.read(cBuffer)) != -1) {

                String str = new String(cBuffer, 0, len);
                System.out.println(str);
            }

            System.out.println("转换成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：将gbk格式的文件转换为utf-8格式的文件存储。
     * InputStreamReader读取时,会自动将文件转成char,只需指定第二参数源文件的类型gbk 或者 utf8
     * */
    @Test
    public void test2(){
        InputStreamReader isr = null;
        OutputStreamWriter osw = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("bufferedreaderwriter_gbk.txt");
            File destFile = new File("bufferedreaderwriter_gbk_to_utf-8.txt");

            //2. 创建相关的转换流, 会将byte转成char类型的
            isr = new InputStreamReader(new FileInputStream(srcFile), "gbk");
            osw = new OutputStreamWriter(new FileOutputStream(destFile), "utf-8");


            //3. 数据的读入和写出  装入到小车 char[]
            char[] cBuffer = new char[1024];
            int len;
            while((len = isr.read(cBuffer)) != -1) {
                osw.write(cBuffer, 0 , len);
            }

            System.out.println("操作完成");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                if (isr != null)
                    isr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (osw != null)
                    osw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
