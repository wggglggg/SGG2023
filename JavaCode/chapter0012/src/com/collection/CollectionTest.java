package com.collection;

import org.junit.Test;

import java.util.*;

/**
 * ClassName: CollectionTest
 * Description:
 *      测试Collection中方法的使用
 * @Author wggglggg
 * @Create 2023/4/16 13:56
 * @Version 1.0
 */
public class CollectionTest {
    @Test
    public void test1(){

        // 创建一个Collection集合
        Collection collection = new ArrayList();
        // 往集合中添加几个元素，只有是引用数据类型，
        collection.add("AA");
        collection.add("BB");
        collection.add(111);    // 111是int类型,所以自动完成了int-->Integer装箱动作
        collection.add("CC");
        Person person = new Person("莉酱", 23);
        collection.add(person);

        for (Object o : collection){
            System.out.println(o);
        }
    }

    @Test
    public void test2(){
        // 创建一个Collection集合
        Collection collection = new ArrayList();
        // 往集合中添加几个元素，只有是引用数据类型，
        collection.add("AA");
        collection.add("BB");
        collection.add(111);    // 111是int类型,所以自动完成了int-->Integer装箱动作
        collection.add("CC");
        Person person = new Person("莉酱", 23);
        collection.add(person);

        Collection collection2 = new ArrayList();
        collection2.add("AA");
        collection2.add("BB");


        // boolean contains(Object obj)：判断当前集合中是否存在一个与obj对象equals返回true的元素
        boolean isContains = collection.contains("BB");
        System.out.println(isContains);     // true

        // boolean containsAll(Collection coll)：判断coll集合中的元素是否在当前集合中都存在。
        boolean isContainOthers = collection.containsAll(collection2);
        System.out.println(isContainOthers);    // true


    }

    // boolean remove(Object obj) ：从当前集合中删除第一个找到的与obj对象equals返回true的元素。
    @Test
    public void test3(){

        // 创建一个Collection集合
        Collection collection = new ArrayList();
        // 往集合中添加几个元素，只有是引用数据类型，
        collection.add("AA");
        collection.add("BB");
        collection.add(111);    // 111是int类型,所以自动完成了int-->Integer装箱动作
        collection.add("CC");
        Person person = new Person("莉酱", 23);
        collection.add(person);

        collection.remove("AA");
        System.out.println(collection); // [BB, 111, CC, Person{name='莉酱', age=23}]
    }

    @Test
    public void test4(){
        // 创建一个Collection集合
        Collection collection = new ArrayList();
        // 往集合中添加几个元素，只有是引用数据类型，
        collection.add("AA");
        collection.add("BB");
        collection.add(111);    // 111是int类型,所以自动完成了int-->Integer装箱动作
        collection.add("CC");
        Person person = new Person("莉酱", 23);
        collection.add(person);

        // 集合转成数组
        Object[] objects = collection.toArray();
        for (int i = 0; i < objects.length; i++) {
            System.out.println(objects[i]);
        }

        // 数组转成集合
        Person person1 = new Person("Lucy", 23);
        Person person2 = new Person("HanMeiMei", 20);
        Person person3 = new Person("Jelly", 49);
        Person[] p = new Person[]{person1, person2, person3};
        // 转换
        List  peopleList = Arrays.asList(p);
        for (Object o : peopleList) {
            System.out.println(o);
        }



    }
}

class Person{
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age && Objects.equals(name, person.name);
    }

}
