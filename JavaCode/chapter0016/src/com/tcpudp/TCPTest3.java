package com.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest3
 * Description:
 *  例题3：从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给客户端。并关闭相应的连接。
 * @Author wggglggg
 * @Create 2023/4/30 15:32
 * @Version 1.0
 */
public class TCPTest3 {
    // 服务端
    @Test
    public void test1(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        OutputStream os = null;
        try {
            //1. 创建Socket
            int port = 6000;
            serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();

            //2. 创建File 流
            is = socket.getInputStream();
            File file =  new File("yaya_copy.jpg");
            fos = new FileOutputStream(file);


            //3. 写出文件到硬盘
            byte[] bBuffer =  new byte[1024];
            int len;
            while((len = is.read(bBuffer)) != -1) {
                fos.write(bBuffer, 0, len);
            }

            //3.1 并返回“发送成功”给客户端 创建相关流
            os = socket.getOutputStream();
            os.write("文件已经接收完毕".getBytes());

            System.out.println("数据接收完毕");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭相关socket 和流
            try {
                os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                is.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                serverSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 客户端
    @Test
    public void test2(){
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream os = null;
        InputStream is = null;
        try {
            //1. 创建Socket
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            int port = 6000;
            socket = new Socket(inet, port);

            //2. 创建File 流
            File file =  new File("yaya.jpg");
            fis = new FileInputStream(file);

            os = socket.getOutputStream();

            //3. 读取文件
            byte[] bBuffer =  new byte[1024];
            int len;
            while((len = fis.read(bBuffer)) != -1) {
                os.write(bBuffer, 0, len);
            }

            System.out.println("文件发送完毕");
            socket.shutdownOutput();

            //3.1 接收服务端的回馈,并显示到控制台
            is = socket.getInputStream();

            byte[] bBuffer1 = new byte[5];
            int len1;
            ByteArrayOutputStream bos =  new ByteArrayOutputStream();   // 用一个数组来装接受的服务器回馈
            while((len1 = is.read(bBuffer1)) != -1) {
//                String str = new String(bBuffer1, 0, len1);// 会有乱码的状况 错误写法
                 bos.write(bBuffer1, 0, len1);
            }

            System.out.print(bos.toString());                       // 打印服务器回馈
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭流 socket
            try {
                is.close();
                os.close();
                fis.close();
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }


    }
}
