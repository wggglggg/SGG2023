package com.otherstream;

import org.apache.commons.io.FileUtils;
import org.junit.Test;

import java.io.*;

/**
 * ClassName: OtherStreamTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/29 15:58
 * @Version 1.0
 */

public class OtherStreamTest {

    /*
     * 从键盘输入字符串，要求将读取到的整行字符串转成大写输出。
     * 然后继续进行输入操作，直至当输入“e”或者“exit”时，退出程序。
     * */
    @Test
    public void test1(){
        System.out.println("请输入信息(退出输入e或exit):");
        BufferedReader br = null;

        try {
            //1. 把"标准"输入流(键盘输入)这个字节流包装成字符流,再包装成缓冲流
            br = new BufferedReader(new InputStreamReader(System.in));

            //2. 读入一整行
            String s = null;
            while((s = br.readLine()) != null) {

               // 当输入“e”或者“exit”时，退出程序
                if ("e".equalsIgnoreCase(s) || "exit".equalsIgnoreCase(s)){
                    System.out.println("安全退出!!");
                    break;
                }

                System.out.println("-->:" + s.toUpperCase());
                System.out.println("继续输入信息");
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                if (br != null)
                    br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 输出ASCII字符
    @Test
    public void test2(){
        PrintStream printStream = null;
        try {
            //1. 创建相关的File类的对象
            File destFile = new File("Unicode.txt");

            //2. 创建相关的对象流
            printStream = new PrintStream(new FileOutputStream(destFile, false));

            //3. 写出信息
            if (printStream != null) {  // 把标准输出流(控制台输出)改成文件
                System.setOut(printStream);
            }

            for (int i = 0; i <= 255; i++) {
                System.out.print("序号为 " + i + ":" + (char) i + ", ");   // 输出ASCII字符
                // 每50个数据一行
                if (i % 10 == 0){
                    System.out.println();
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            if (printStream != null)
                printStream.close();
        }
    }

    @Test
    public void test3(){
        try {
            File srcFile = new File("Unicode.txt");
            File descFile = new File("Unicode_copy.txt");

            FileUtils.copyFile(srcFile, descFile);

            System.out.println("复制完成");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
