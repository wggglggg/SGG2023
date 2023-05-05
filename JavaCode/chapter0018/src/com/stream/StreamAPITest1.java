package com.stream;

import com.reference.data.Employee;
import com.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

/**
 * ClassName: SteamAPITest1
 * Description:
 *      测试Stream的中间操作
 * @Author wggglggg
 * @Create 2023/5/5 14:23
 * @Version 1.0
 */
public class StreamAPITest1 {
    //1-筛选与切片
    @Test
    public void test1(){
        //filter(Predicate p)——接收 Lambda，从流中排除某些元素。
        //练习：查询员工表中薪资大于7000的员工信息
        //Employee{id=1002, name='马云', age=2, salary=19876.12}
        //Employee{id=1004, name='雷军', age=26, salary=7657.37}
        //Employee{id=1006, name='比尔盖茨', age=42, salary=9500.43}
        List<Employee> list = EmployeeData.getEmployees();
        list.stream().filter(employee -> employee.getSalary() > 7000).forEach(System.out::println);
        System.out.println();

        //limit(n)——截断流，使其元素不超过给定数量。
        //错误的。因为stream已经执行了终止操作，就不可以再调用其它的中间操作或终止操作了。
        //stream.limit(2).forEach(System.out::println);
        //Employee{id=1002, name='马云', age=2, salary=19876.12}
        //Employee{id=1004, name='雷军', age=26, salary=7657.37}
        list.stream().filter(employee -> employee.getSalary() > 7000).limit(2).forEach(System.out::println);
        System.out.println();

        // distinct()——筛选，通过流所生成元素的 hashCode() 和 equals() 去除重复元素
        list.add(new Employee(1009, "矮子", 34, 9349.33));
        list.add(new Employee(1009, "矮子", 34, 9349.33));
        list.add(new Employee(1009, "矮子", 34, 9349.33));

        //Employee{id=1001, name='马化腾', age=34, salary=6000.38}
        //Employee{id=1002, name='马云', age=2, salary=19876.12}
        //Employee{id=1003, name='刘强东', age=33, salary=3000.82}
        //Employee{id=1004, name='雷军', age=26, salary=7657.37}
        //Employee{id=1005, name='李彦宏', age=65, salary=5555.32}
        //Employee{id=1006, name='比尔盖茨', age=42, salary=9500.43}
        //Employee{id=1007, name='任正非', age=26, salary=4333.32}
        //Employee{id=1008, name='扎克伯格', age=35, salary=2500.32}
        //Employee{id=1009, name='矮子', age=34, salary=9349.33}
        list.stream().distinct().forEach(System.out::println);
    }

    //2-映射
    @Test
    public void test2(){
        //map(Function f)——接收一个函数作为参数，将元素转换成其他形式或提取信息，该函数会被应用到每个元素上，并将其映射成一个新的元素。
        //练习：转换为大写
        List<String> list = Arrays.asList("aa", "bb", "cc", "dd");
        List<Employee> employees = EmployeeData.getEmployees();

        //方式一   AA BB CC DD
        list.stream().map(s -> s.toUpperCase()).forEach(System.out::println);
        //方式二   AA BB CC DD
        list.stream().map(String::toUpperCase).forEach(System.out::println);

        //练习：获取员工姓名长度大于3的员工姓名。    //比尔盖茨 扎克伯格
        //方式一
        employees.stream().filter(employee -> employee.getName().length() > 3).map(employee -> employee.getName()).forEach(System.out::println);
        //方式二
        employees.stream().map(employee -> employee.getName()).filter(name -> name.length() > 3).forEach(System.out::println);
        //方式三
        employees.stream().map(Employee::getName).filter(name -> name.length() > 3).forEach(System.out::println);

    }

    //3-排序,原数组arr与列表list不会改变与修改，得到的是一个新数组
    @Test
    public void test3(){
        //sorted()——自然排序
        Integer[] arr = new Integer[]{345,3,64,3,46,7,3,34,65,68};
        String[] arr1 = new String[]{"GG","DD","MM","SS","JJ"};

        Arrays.stream(arr).sorted().forEach(System.out::println);
        System.out.println();

        Arrays.stream(arr1).sorted().forEach(System.out::println);
        System.out.println();

        //因为Employee没有实现Comparable接口，所以报错！
        //List<Employee> list = EmployeeData.getEmployees();
        //list.stream().sorted().forEach(System.out::println)

        //sorted(Comparator com)——定制排序
        Arrays.stream(arr).sorted((o1, o2) -> o1.compareTo(o2)).forEach(System.out::println);

        //针对于字符串从大大小排列  倒序 SS MM JJ GG DD
        Arrays.stream(arr1).sorted((o1, o2) -> -o1.compareTo(o2)).forEach(System.out::println);
    }
}
