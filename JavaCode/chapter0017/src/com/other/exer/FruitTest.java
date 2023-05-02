package com.other.exer;

import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Properties;
import java.util.function.Function;

/**
 * ClassName: FruitTest
 * Description:
 * 5、在FruitTest测试类中，
 * （1）读取配置文件，获取水果类名，并用反射创建水果对象，
 * （2）创建榨汁机对象，并调用run()方法
 *
 * @Author wggglggg
 * @Create 2023/5/2 20:11
 * @Version 1.0
 */
public class FruitTest {
    // 读取配置文件，获取水果类名，并用反射创建水果对象
    @Test
    public void test1() throws Exception {
        Properties properties = new Properties();

        // 两种配置文件读取选一个
        InputStream is = ClassLoader.getSystemClassLoader().getResourceAsStream("config.properties");
//        FileInputStream is = new FileInputStream(new File("src/config.properties"));

        properties.load(is);    // 导入配置文件
        String fruitName = properties.getProperty("fruitName"); // 获取配置文件中fruitName的值,值为 全类名

        Fruit fruit = getFruit(fruitName);      // 通过全类名,获取到了水果类,Apple Banana Orange

//        //2. 通过反射，创建指定全类名对应的类的实例
//        Class clazz = Class.forName(fruitName);
//        Constructor declaredConstructor = clazz.getDeclaredConstructor();
//        declaredConstructor.setAccessible(true);
//
//        Fruit fruit = (Fruit) declaredConstructor.newInstance();

        //3. 通过榨汁机的对象调用run()
        Juicer juicer = new Juicer();
        juicer.run(fruit);
    }

    //2. 通过反射，创建指定全类名对应的类的实例
    public <T> T getFruit(String fruitClass) {
        T t = null;
        try {
            Class clazz = Class.forName(fruitClass);

            Constructor declaredConstructor = clazz.getDeclaredConstructor();
            declaredConstructor.setAccessible(true);

            t = (T) declaredConstructor.newInstance();
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (NoSuchMethodException e) {
            throw new RuntimeException(e);
        } catch (SecurityException e) {
            throw new RuntimeException(e);
        } catch (InstantiationException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e) {
            throw new RuntimeException(e);
        } catch (InvocationTargetException e) {
            throw new RuntimeException(e);
        } finally {
            return t;
        }


    }
}
