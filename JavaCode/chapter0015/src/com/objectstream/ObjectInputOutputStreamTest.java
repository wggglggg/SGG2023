package com.objectstream;

import org.junit.Test;

import java.io.*;

/**
 * ClassName: ObjectInputOutputStreamTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/29 14:55
 * @Version 1.0
 */
public class ObjectInputOutputStreamTest {
    /*
     * 序列化过程：使用ObjectOutputStream流实现。将内存中的Java对象保存在文件中或通过网络传输出去
     * */
    @Test
    public void test1(){
        ObjectOutputStream oos = null;
        try {
            //1. 创建相关的File类的对象
            File destFile = new File("ObjectOutputStream.txt");

            //2. 创建相关的对象流
            oos = new ObjectOutputStream(new FileOutputStream(destFile));

            //3. 数据写出   即为序列化的过程
            oos.writeUTF("高峡出平湖,神女应无恙,当惊世界殊");
            oos.flush();

            System.out.println("定稿成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /*
     * 反序列化过程：使用ObjectInputSteam流实现。将文件中的数据或网络传输过来的数据还原为内存中的Java对象
     * */
    @Test
    public void test2(){
        ObjectInputStream ois = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("ObjectOutputStream.txt");

            //2. 创建相关的对象流
            ois = new ObjectInputStream(new FileInputStream(srcFile));

            //3. 数据写出   即为序列化的过程
            String str = (String) ois.readUTF();

            System.out.println(str);

        } catch (IOException e) {
            e.printStackTrace();
        }finally {

            //4. 关闭资源
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    //演示自定义类的对象的序列化和反序列化过程
    // 序列化
    @Test
    public void test3(){
        ObjectOutputStream oos = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("PersonObjectOutputStream.dat");
            Person person = new Person("缓圆", 27);

            //2. 创建相关的对象流
            oos = new ObjectOutputStream(new FileOutputStream(srcFile));

            //3. 数据写出   即为序列化的过程
            oos.writeObject(person);

            System.out.println("定稿成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                oos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    // 反序列化
    @Test
    public void test4(){
        ObjectInputStream ois = null;
        try {
            //1. 创建相关的File类的对象
            File srcFile = new File("PersonObjectOutputStream.dat");


            //2. 创建相关的对象流
            ois = new ObjectInputStream(new FileInputStream(srcFile));

            //3. 数据写出   即为序列化的过程
            Person person = (Person) ois.readObject();

            System.out.println(person);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        } finally {

            //4. 关闭资源
            try {
                ois.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
