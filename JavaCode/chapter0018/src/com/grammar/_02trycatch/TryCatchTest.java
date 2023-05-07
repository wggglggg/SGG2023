package com.grammar._02trycatch;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: TryCatchTest
 * Description:
 *                          try-catch的新特性
 * @Author wggglggg
 * @Create 2023/5/7 20:22
 * @Version 1.0
 */
public class TryCatchTest {
    /*
     * 举例1：
     * JDK7之前的写法
     * */
    @Test
    public void test1(){
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter("test.txt");
            bw = new BufferedWriter(fw);

            bw.write("hello, world");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (bw != null)
                    bw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 举例1：
     * JDK7中的写法
     * */
    @Test
    public void test2(){
        try(FileWriter fw = new FileWriter("test.txt");
            BufferedWriter bw = new BufferedWriter(fw);
            ) {
            bw.write("Hello World");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /*
     * 举例2：从test.txt(utf-8)文件中，读取内容，写出到abc.txt(gbk)文件中
     * JDK7之前的写法
     * */
    @Test
    public void test3(){
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            FileInputStream fis = new FileInputStream("test.txt");
            InputStreamReader isr = new InputStreamReader(fis, "utf-8");
            br = new BufferedReader(isr);

            FileOutputStream fos = new FileOutputStream("abc.txt");
            OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
            bw = new BufferedWriter(osw);

            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
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

    /*
     * 举例2：从test.txt(utf-8)文件中，读取内容，写出到abc.txt(gbk)文件中
     * JDK7中的写法
     * */
    @Test
    public void test4(){

        try(
                FileInputStream fis = new FileInputStream("test.txt");
                InputStreamReader isr = new InputStreamReader(fis, "utf-8");
                BufferedReader br = new BufferedReader(isr);

                FileOutputStream fos = new FileOutputStream("abc.txt");
                OutputStreamWriter osw = new OutputStreamWriter(fos, "gbk");
                BufferedWriter bw = new BufferedWriter(osw);
        )  {


            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
                bw.flush();

            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //jdk9中举例：
    @Test
    public void test5(){
        InputStreamReader isr = new InputStreamReader(System.in);
        OutputStreamWriter osw = new OutputStreamWriter(System.out);
        try(isr; osw) {
            //reader、writer是final的，不可再被赋值
//            reader = new InputStreamReader(System.in);
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
