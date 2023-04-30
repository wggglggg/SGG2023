package com.tcpudp;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;


/**
 * ClassName: TCPTest1
 * Description:
 *  例题1：客户端发送内容给服务端，服务端将内容打印到控制台上。
 * @Author wggglggg
 * @Create 2023/4/30 11:30
 * @Version 1.0
 */
public class TCPTest1 {
    @Test
    public void test1(){
        Socket socket = null;
        OutputStream outputStream = null;
        try {
            //1. 创建一个Socket
            InetAddress inetAddress = InetAddress.getByName("127.0.0.1");
            int port = 60000;
            socket = new Socket(inetAddress, port);

            //2. 创建流
            outputStream = socket.getOutputStream();

            //3. 发送数据
            outputStream.write("测试TCP第一次".getBytes());

            System.out.println("发送成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭socket、关闭流
            try {
                if (outputStream != null)
                    outputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Test
    public void test2(){
        ServerSocket serverSocket = null;
        Socket socket = null;
        InputStream inputStream = null;
        ByteArrayOutputStream byteArrayOutputStream = null;
        try {
            //1. 创建Socket
            int port = 60000;
            serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();

            System.out.println("服务器开启");

            System.out.println("接受来自" + socket.getInetAddress().getHostName() + "的连接");

            //2. 创建流
            inputStream = socket.getInputStream();


            //3. 接受数据
            byte[] cBuffer = new byte[5];
            byteArrayOutputStream = new ByteArrayOutputStream();    // 数据保存到byte数组中,一次写出去
            int len;
            while ((len = inputStream.read(cBuffer)) != -1) {
                byteArrayOutputStream.write(cBuffer, 0, len);
            }
            System.out.println(byteArrayOutputStream);

            System.out.println("接受完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭socket、关闭流
            try {
                if (byteArrayOutputStream != null)
                    byteArrayOutputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (inputStream != null)
                    inputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (socket != null)
                    socket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            try {
                if (serverSocket != null)
                    serverSocket.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
