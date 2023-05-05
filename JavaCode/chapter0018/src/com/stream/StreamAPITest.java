package com.stream;

import com.reference.data.Employee;
import com.reference.data.EmployeeData;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * ClassName: StreamAPITest
 * Description:
 *      测试Stream的实例化
 * @Author wggglggg
 * @Create 2023/5/5 14:23
 * @Version 1.0
 */
public class StreamAPITest {
    //创建 Stream方式一：通过集合
    @Test
    public void test1(){
        List<Employee> list = EmployeeData.getEmployees();

        // default Stream<E> stream() : 返回一个顺序流
        Stream<Employee> stream = list.stream();

        // default Stream<E> parallelStream() : 返回一个并行流
        Stream<Employee> employeeStream = list.parallelStream();

        System.out.println(stream);
        System.out.println(employeeStream);

    }

    //创建 Stream方式二：通过数组
    @Test
    public void test2(){
        //调用Arrays类的static <T> Stream<T> stream(T[] array): 返回一个流
        Integer[] integerArr = new Integer[]{1,2,5,3,6,4};

        Stream<Integer> streamArr = Arrays.stream(integerArr);

        int[] intArr = new int[]{1,2,5,3,6,4};
        IntStream steamArr2 = Arrays.stream(intArr);
    }

    //创建 Stream方式三：通过Stream的of()
    @Test
    public void test3(){
        Stream<String> streamTV = Stream.of("TCL", "Haier", "Hisenses", "LG", "HuaWei");
    }
}
