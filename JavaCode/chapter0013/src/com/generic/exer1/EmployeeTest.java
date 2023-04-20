package com.generic.exer1;

import org.junit.Test;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * ClassName: EmployeeTest
 * Description:
 *      3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义）

 *      4. 分别按以下两种方式对集合中的元素进行排序，并遍历输出：

 *          1). 使Employee 实现 Comparable 接口，并按 name 排序
 *          2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
 * @Author wggglggg
 * @Create 2023/4/20 16:54
 * @Version 1.0
 */
public class EmployeeTest {

    @Test
    public void test1(){
        // 3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义）
        Employee haimeimei = new Employee("HaiMeiMei", 29, new MyDate(1992, 11, 9));
        Employee lilei = new Employee("LiLei", 23, new MyDate(1977, 1, 22));
        Employee lucy = new Employee("Lucy", 37, new MyDate(1983, 7, 14));
        Employee lily = new Employee("LiLy", 36, new MyDate(1984, 10, 5));
        Employee jack = new Employee("Jack", 44, new MyDate(1972, 8, 1));

        TreeSet<Employee> employeeTreeSet = new TreeSet<>();

        employeeTreeSet.add(haimeimei);
        employeeTreeSet.add(lilei);
        employeeTreeSet.add(lucy);
        employeeTreeSet.add(lily);
        employeeTreeSet.add(jack);

        // 4. 分别按以下两种方式对集合中的元素进行排序，并遍历输出
        //      1). 使Employee 实现 Comparable 接口，并按 name 排序
        Iterator<Employee> iterator = employeeTreeSet.iterator();
        while (iterator.hasNext()) {
            Employee employee = iterator.next();
            System.out.println(employee);
        }
    }

     // 2). 创建 TreeSet 时传入 Comparator对象，按生日日期的先后排序。
    @Test
    public void test2(){
        // 3. 创建该类的 5 个对象，并把这些对象放入 TreeSet 集合中（TreeSet 需使用泛型来定义）
        Employee haimeimei = new Employee("HaiMeiMei", 29, new MyDate(1992, 11, 9));
        Employee lilei = new Employee("LiLei", 44, new MyDate(1972, 8, 1));
        Employee lucy = new Employee("Lucy", 37, new MyDate(1983, 7, 14));
        Employee lily = new Employee("LiLy", 36, new MyDate(1984, 10, 5));
        Employee jack = new Employee("Jack", 44, new MyDate(1972, 8, 1));

        // Comparator对象,也就是按需求排序  方式一
//        Comparator<Employee> comparable = new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                int yearCompare = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                if (yearCompare != 0) {
//                    return yearCompare;
//                }
//                int monthCompare = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//                if (monthCompare != 0) {
//                    return monthCompare;
//                }
//                return o1.getBirthday().getDay() - o2.getBirthday().getDay();
//            }
//        };
//        TreeSet<Employee> employeeTreeSet = new TreeSet<>(comparable);

        // Comparator对象,也就是按需求排序  方式二
//        TreeSet<Employee> employeeTreeSet = new TreeSet<>(new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                int yearCompare = o1.getBirthday().getYear() - o2.getBirthday().getYear();
//                int monthCompare = o1.getBirthday().getMonth() - o2.getBirthday().getMonth();
//                int dayCompare = o1.getBirthday().getDay() - o2.getBirthday().getDay();
//                int ageCompare = o1.getAge() - o2.getAge();
//
//                if (yearCompare != 0) {
//                    return yearCompare;
//                } else if (monthCompare != 0) {
//                    return monthCompare;
//                } else if (dayCompare != 0) {
//                    return dayCompare;
//                } else if (ageCompare != 0) {
//                    return ageCompare;
//                } else {
//                    return o1.getName().compareTo(o2.getName());
//                }
//
//            }
//        });

        // 方式三
        TreeSet<Employee> employeeTreeSet = new TreeSet<>(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                int birthdayCompare = o1.getBirthday().compareTo(o2.getBirthday());
                if (birthdayCompare != 0) {
                    return birthdayCompare;
                }
                return o1.compareTo(o2);
            }
        });

        employeeTreeSet.add(haimeimei);
        employeeTreeSet.add(lilei);
        employeeTreeSet.add(lucy);
        employeeTreeSet.add(lily);
        employeeTreeSet.add(jack);


        // 排序方式一
        for (Employee employee : employeeTreeSet) {
            System.out.println(employee);
        }

        // 排序方式二
//        Iterator<Employee> iterator = employeeTreeSet.iterator();

//        while (iterator.hasNext()) {
//            Employee employee = iterator.next();
//            System.out.println(employee);
//        }
    }
}
