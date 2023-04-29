package com.otherstream;

import org.junit.Test;

import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ClassName: Logger
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/29 15:39
 * @Version 1.0
 */
public class Logger {

    @Test
    public void test1(){
        log("4.1 记住活动页面");
        log("4.1.1 Activity的生命周期");
        log("4.1.2 Activity的启动结束");
    }

    /*
   记录日志的方法。
    */

    public static void log(String msg){
        PrintStream printStream = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("log.txt");

            //2. 创建相关的对象流
            printStream = new PrintStream(new FileOutputStream(srcFile, true));
            System.setOut(printStream);

            Date date = new Date();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
            String strformat = sdf.format(date);

            //3. 写出信息
            System.out.println(strformat + ":" + msg);
            printStream.flush();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭资源
            printStream.close();
        }
    }
}
