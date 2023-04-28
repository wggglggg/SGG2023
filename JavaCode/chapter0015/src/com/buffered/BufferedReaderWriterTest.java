package com.buffered;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: BufferedReaderWriterTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/28 16:06
 * @Version 1.0
 */
public class BufferedReaderWriterTest {

    @Test
    public void test1(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("filereaderwriter.txt");
            File destFile = new File("bufferedreaderwriter.txt");

            //2. 创建相关的缓冲流
            br = new BufferedReader(new FileReader(srcFile));
            bw = new BufferedWriter(new FileWriter(destFile));

            //3. 数据的读入和写出  装入到小车 char[]
            char[] cBuffer =  new char[1024];
            int len;
            while ((len = br.read(cBuffer)) != -1){
                bw.write(cBuffer, 0 , len);
            }

            System.out.println("复制完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
