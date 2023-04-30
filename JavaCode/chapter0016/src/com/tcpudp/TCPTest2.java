package com.tcpudp;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ClassName: TCPTest2
 * Description:
 *          例题2：客户端发送文件给服务端，服务端将文件保存在本地。
 * @Author wggglggg
 * @Create 2023/4/30 15:06
 * @Version 1.0
 */
public class TCPTest2 {
    // 客户端
    @Test
    public void test1(){
        Socket socket = null;
        FileInputStream fis = null;
        OutputStream os = null;
        try {
            //1. 创建Socket
            InetAddress inet = InetAddress.getByName("127.0.0.1");
            int port = 6000;
            socket = new Socket(inet, port);

            //2. 创建File的实例、FileInputStream的实例 通过Socket，获取输出流
            File file =  new File("yaya.jpg");
            fis = new FileInputStream(file);
            os = socket.getOutputStream();

            //3. 读写数据
            byte[] bBuffer = new byte[1024];
            int len;
            while((len = fis.read(bBuffer)) != -1) {
                os.write(bBuffer, 0, len);
            }

            System.out.println("数据发送完毕");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //4. 关闭Socket和相关的流
            try {
                if (os != null)
                    os.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if(fis != null)
                    fis.close();
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

    // 服务端
    @Test
    public void test2(){
        Socket socket = null;
        InputStream is = null;
        FileOutputStream fos = null;
        try {
            //1. 创建Socket
            int port = 6000;
            ServerSocket serverSocket = new ServerSocket(port);
            socket = serverSocket.accept();         // 有多少个客户端连接就需要多少个accept()

            //2. 创建File的实例、FileOutputStream的实例 通过Socket，获取输出流
            is = socket.getInputStream();

            File file = new File("yaya_copy.jpg");
            fos = new FileOutputStream(file);

            //3. 读写数据
            byte[] bBuffer = new byte[1024];
            int len;
            while((len = is.read(bBuffer)) != -1) {
                fos.write(bBuffer, 0, len);
            }

            System.out.println("数据接受完毕");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭Socket和相关的流
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
        }

    }
}
