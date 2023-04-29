package com.net;

import org.junit.Test;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * ClassName: InetAddressTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/29 21:13
 * @Version 1.0
 */
public class InetAddressTest {
    @Test
    public void test1(){
        InetAddress inet1 = null;
        InetAddress inet2 = null;
        InetAddress inet3 = null;
        InetAddress inet4 = null;
        try {
            //1. 实例化
            //getByName(String host)：获取指定ip对应的InetAddress的实例
            inet1 = InetAddress.getByName("www.google.com");
            inet2 = InetAddress.getByName("www.youtube.com");
            inet3 = InetAddress.getByName("8.8.4.4");

            //getLocalHost():获取本地ip对应的InetAddress的实例
            inet4 = InetAddress.getLocalHost();
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }

        System.out.println(inet1.getHostName());
        System.out.println(inet2.getHostAddress());
        System.out.println(inet3.getHostAddress());
        System.out.println(inet4.getHostName());
    }
}
