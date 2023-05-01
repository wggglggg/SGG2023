package com._class;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * ClassName: ClassLoaderTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/5/1 20:40
 * @Version 1.0
 */
public class ClassLoaderTest {
    /*
     * 在jdk8中执行如下的代码：
     * */
    @Test
    public void test1(){
        //获取系统类加载  ystemClassLoader/ApplicationClassLoader:系统类加载器、应用程序类加载器, 我们自定义的类，默认使用的类的加载
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        System.out.println(systemClassLoader);  // jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b

        //获取扩展类加载器 ExtensionClassLoader/PlatformClassLoader
        ClassLoader extClassLoader = systemClassLoader.getParent();
        System.out.println(extClassLoader);     // jdk.internal.loader.ClassLoaders$PlatformClassLoader@77f03bb1

        //获取引导类加载器:失败  BootstrapClassLoader:引导类加载器、启动类加载器 使用的C++书写的代码无法获取
        ClassLoader classLoader = extClassLoader.getParent();
        System.out.println(classLoader);        // null
    }

    @Test
    public void test2() throws ClassNotFoundException {
        //用户自定义的类使用的是系统类加载器加载的。
        Class clazz1 = Order.class;
        ClassLoader classLoader = clazz1.getClassLoader();
        System.out.println(classLoader);    // jdk.internal.loader.ClassLoaders$AppClassLoader@63947c6b

        //对于Java的核心api使用引导类加载器加载  失败  BootstrapClassLoader:引导类加载器、启动类加载器
        Class clazz2 = Class.forName("java.lang.String");
        ClassLoader classLoader2 = clazz2.getClassLoader();
        System.out.println(classLoader2);   // null
    }

    /*
     * 需求：通过ClassLoader加载指定的配置文件
     * */
    @Test
    public void test3() throws IOException {
        Properties properties = new Properties();
        // 使用test测试工具  通过类的加载器读取的文件的默认的路径为：当前module下的src下
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("info.properties");

        properties.load(is);
        String company = properties.getProperty("Company");
        String from = properties.getProperty("From");
        String to = properties.getProperty("To");
        int price = Integer.parseInt(properties.getProperty("Price"));
        System.out.println(company + "[" + from + ":" + to + "]" + "价格：" + price);  // 顺丰[北京:广东]价格：35
    }

    /*
     * Properties:通过FileInputStream流 处理属性文件
     */
    @Test
    public void test4() throws IOException {
        Properties properties = new Properties();

        // 使用test测试工具 读取的文件的默认路径为：当前的module
        FileInputStream fis = new FileInputStream(new File("info.properties"));

        properties.load(fis);

        String company = properties.getProperty("Company");
        String from = properties.getProperty("From");
        String to = properties.getProperty("To");
        int price = Integer.parseInt(properties.getProperty("Price"));  // String转成int类型使用Integer.parseInt()
        System.out.println(company + "[" + from + ":" + to + "]" + "价格：" + price);  // 顺丰[北京:广东]价格：35


    }
}
