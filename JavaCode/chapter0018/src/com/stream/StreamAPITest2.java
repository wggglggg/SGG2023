package com.stream;

import com.reference.data.Employee;
import com.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * ClassName: StreamAPITest2
 * Description:
 *                  测试Stream的终止操作
 * @Author wggglggg
 * @Create 2023/5/5 15:01
 * @Version 1.0
 */
public class StreamAPITest2 {
    List<Employee> list = EmployeeData.getEmployees();
    //1-匹配与查找
    @Test
    public void test1(){
        //allMatch(Predicate p)——检查是否匹配所有元素。
        //练习：是否所有的员工的年龄都大于18 false
        System.out.println(list.stream().allMatch(employee -> employee.getAge() == 2));

        //anyMatch(Predicate p)——检查是否至少匹配一个元素。
        //练习：是否存在年龄大于18岁的员工     true
        System.out.println(list.stream().anyMatch(employee -> employee.getAge() == 2));

        //练习：是否存在员工的工资大于 10000  true
        System.out.println(list.stream().anyMatch(employee -> employee.getSalary() > 10000));

        //findFirst——返回第一个元素     Optional[Employee{id=1001, name='马化腾', age=34, salary=6000.38}]
        System.out.println(list.stream().findFirst());
    }

    @Test
    public void test2(){

        // count——返回流中元素getSalary() > 7000的总个数
        System.out.println(list.stream().filter(employee -> employee.getSalary() > 7000).count());      // 3

        // max(Comparator c)——返回流中最大值
        // 练习：返回最高工资的员工     Employee{id=1002, name='马云', age=2, salary=19876.12}
        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).get());

        //练习：返回最高的工资：
        //方式1   19876.12
        System.out.println(list.stream().max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())).map(employee -> employee.getSalary()).get());
        //方式2   Optional[19876.12]
        System.out.println(list.stream().map(employee -> employee.getSalary()).max(Double::compare));

        //min(Comparator c)——返回流中最小值
        //练习：返回最低工资的员工  Optional[Employee{id=1008, name='扎克伯格', age=35, salary=2500.32}]
        System.out.println(list.stream().min((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary())));
    }

    //2-归约
    @Test
    public void test3(){
        //reduce(T identity, BinaryOperator)——可以将流中元素反复结合起来，得到一个值。返回 T
        //练习1：计算1-10的自然数的和
        List<Integer> list1 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        System.out.println(list1.stream().reduce(0, (i1, i2) -> i1 + i2));   // 55
        System.out.println(list1.stream().reduce(0, (i1, i2) -> Integer.sum(i1, i2))); // 55
        System.out.println(list1.stream().reduce(0, Integer::sum));  // 55

        System.out.println(list1.stream().reduce(50, Integer::sum)); // 105, 50为基数


        //reduce(BinaryOperator) ——可以将流中元素反复结合起来，得到一个值。返回 Optional<T>
        //练习2：计算公司所有员工工资的总和     Optional[58424.08]
        System.out.println(list.stream().map(employee -> employee.getSalary()).reduce((s1, s2) -> Double.sum(s1, s2)));
        System.out.println(list.stream().map(employee -> employee.getSalary()).reduce(Double::sum));
    }

    //3-收集
    @Test
    public void test4(){
        // collect(Collector c)——将流转换为其他形式。接收一个 Collector接口的实现，用于给Stream中元素做汇总的方法
        // 练习1：查找工资大于6000的员工，结果返回为一个List或Set
        //Employee{id=1001, name='马化腾', age=34, salary=6000.38}
        //Employee{id=1002, name='马云', age=2, salary=19876.12}
        //Employee{id=1004, name='雷军', age=26, salary=7657.37}
        //Employee{id=1006, name='比尔盖茨', age=42, salary=9500.43}
        List<Employee> salary6000 = list.stream().filter(employee -> employee.getSalary() > 6000).collect(Collectors.toList());
        salary6000.forEach(System.out::println);
        System.out.println();
        list.forEach(System.out::println);      // 原List不改变
        System.out.println();

        //练习2：按照员工的年龄进行排序，返回到一个新的List中
        //Employee{id=1002, name='马云', age=2, salary=19876.12}
        //Employee{id=1004, name='雷军', age=26, salary=7657.37}
        //Employee{id=1007, name='任正非', age=26, salary=4333.32}
        //Employee{id=1003, name='刘强东', age=33, salary=3000.82}
        //Employee{id=1001, name='马化腾', age=34, salary=6000.38}
        //Employee{id=1008, name='扎克伯格', age=35, salary=2500.32}
        //Employee{id=1006, name='比尔盖茨', age=42, salary=9500.43}
        //Employee{id=1005, name='李彦宏', age=65, salary=5555.32}
        List<Employee> ageList = list.stream().sorted((e1, e2) -> e1.getAge() - e2.getAge()).collect(Collectors.toList());
        ageList.forEach(System.out::println);
    }
}
