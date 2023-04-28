package com.filestream.apply;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ClassName: exer1
 * Description:
 *              加密与解密
 * @Author wggglggg
 * @Create 2023/4/28 12:21
 * @Version 1.0
 */
public class exer1 {

    /**
     实现图片加密操作。加密的规则就是做异或运算 data ^ 5

     提示：
     int b = 0;
     while((b = fis.read()) != -1){
     fos.write(b ^ 5);
     }
     */

    // 加密encryption
    @Test
    public void test1(){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("Wrc_Subaru.jpeg");
            File destFile = new File("Wrc_Subaru_copy_encryption.jpg");

            //2. 创建相关的字节流  stream
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出
            int len;
            while((len = fis.read()) != -1) {
                fos.write(len ^ 5);
            }

            System.out.println("复制并加密成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 解密decryption
    @Test
    public void test2(){
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("Wrc_Subaru_copy_encryption.jpg");
            File destFile = new File("Wrc_Subaru_copy_decryption.jpg");

            //2. 创建相关的字节流  stream
            fis = new FileInputStream(srcFile);
            fos = new FileOutputStream(destFile);

            //3. 数据的读入和写出
            int len;
            while((len = fis.read()) != -1) {
                fos.write(len ^ 5);
            }

            System.out.println("复制并解密成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
