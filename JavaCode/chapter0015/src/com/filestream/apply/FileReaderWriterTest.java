package com.filestream.apply;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: FileReaderWriterTest
 * Description:
 *      因为字符流不适合用来处理非文本文件, 只能处理txt文档
 * @Author wggglggg
 * @Create 2023/4/28 8:30
 * @Version 1.0
 */

public class FileReaderWriterTest {
    /*
     * 需求：读取hello.txt中的内容，显示在控制台上。
     *
     * 异常使用throws的方式处理，不太合适。见 test2()
     * */
    @Test
    public void test1() throws IOException {
        //1.创建File类的对象，对应着hello.txt文件
        File file = new File("filereaderwriter.txt");

        //2.创建输入型的字符流，用于读取数据
        FileReader fileReader = new FileReader(file);
        int data;
        //3.读取数据，并显示在控制台上
        while ((data = fileReader.read()) != -1) {

            System.out.print((char) data);
        }

        //4. 流资源的关闭操作（必须要关闭，否则会内存泄漏）
        fileReader.close();
    }

    /*
     * 需求：读取hello.txt中的内容，显示在控制台上。
     * 使用try-catch-finally的方式处理异常。确保流一定可以关闭，避免内存泄漏
     * */
    @Test
    public void test2() {
        FileReader fileReader = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("filereaderwriter.txt");

            //2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);
            int len;
            //3.读取数据，并显示在控制台上
            while ((len = fileReader.read()) != -1) {

                System.out.print((char) len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源的关闭操作（必须要关闭，否则会内存泄漏）
            try {
                if (fileReader != null)      // 如果文件为Null时,fr.close()为报空指针错误,所以加判断
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：读取hello.txt中的内容，显示在控制台上。
     *
     * 对test2()进行优化，每次读取多个字符存放到字符数组中，减少了与磁盘交互的次数，提升效率。
     *
     * */
    @Test
    public void test3() {
        FileReader fileReader = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("filereaderwriter.txt");

            //2.创建输入型的字符流，用于读取数据
            fileReader = new FileReader(file);
            char[] cBuffer = new char[5];

            //3.读取数据，并显示在控制台上
            int len;           // 装放是每一次读取的文件信息,不满足5个字节时,有多少就显示多少

            while ((len = fileReader.read(cBuffer)) != -1) {
                //遍历数组:错误的写法
//                for (int i = 0; i < cBuffer.length; i++) {
//                    System.out.print(cBuffer[i]);
//                }

                //遍历数组:正确的写法        , len中有多少个数据就写多少个
                for (int i = 0; i < len; i++) {
                    System.out.print(cBuffer[i]);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 流资源的关闭操作（必须要关闭，否则会内存泄漏）
            try {
                if (fileReader != null)     // 如果文件为Null时,fr.close()为报空指针错误,所以加判断
                    fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：将内存中的数据写出到指定的文件中
     * */
    @Test
    public void test4() {
        FileWriter fw = null;
        try {
            //1.创建File类的对象，对应着hello.txt文件
            File file = new File("filereaderwriter.txt");


            //2. 创建输出流
            //覆盖文件，使用的构造器：
            fw = new FileWriter(file);
//         fw = new FileWriter(file,false);  // false表示不覆盖,默认为false可不写
            //在现有的文件基础上，追加内容使用的构造器：
//         fw = new FileWriter(file,true);

            //3. 写出的具体过程
            //输出的方法：write(String str) / write(char[] cdata)
            fw.write("4.1 记住活动页面\n");
            fw.write("\t4.1.1 Activity的启动和结束\n");
            fw.write("\t4.1.2 Activity的生命周期\n");

            System.out.println("输出成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            try {
                if (fw != null)     // 如果文件为Null时,fw.close()为报空指针错误,所以加判断
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 需求：复制一份filereaderwriter.txt文件，命名为filereaderwriter_copy.txt
     * */
    @Test
    public void test5() {
        FileReader fr = null;
        FileWriter fw = null;
        try {
            //1. 创建File类的对象
            File srcFile = new File("filereaderwriter.txt");
            File destFile = new File("filereaderwriter_copy.txt");

            //2. 创建输入流、输出流
            fr = new FileReader(srcFile);
            fw = new FileWriter(destFile);

            //3. 数据的读入和写出的过程
            char[] cBuffer = new char[5];       // 读取5个char然后存入char[]中
            int len;    //记录每次读入到cbuffer中的字符的个数
            while ((len = fr.read(cBuffer)) != -1) {

                //write(char[] cBuffer,int fromIndex,int len)
                fw.write(cBuffer, 0, len); //正确的 )
//                fw.write(cBuffer); //错误的
            }

            System.out.println("复制成功");
        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            //4. 关闭流资源
            //方式1：
//            try {
            //if (fw != null)
//                  fw.close();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }finally {
//
//                try {
            //if (fr != null)
//                    fr.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//            }
            //方式2：

            try {
                if (fw != null)
                    fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (fr != null)
                    fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

}
