import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *输入中文名字拼音，然后输出西式的排列方式
 */
public class MyClassTest {
    public static void main(String[] args) {
        int num = 66;
        // 输入中文名字拼音，然后输出西式的排列方式
        printName("Wang", "Liang");  // Liang. Wang

        // 正数变负数 ，负数变正数
        printOppositeNum(10); // -10;
        printOppositeNum(-42); // 42;


        // 输入任务整数，自动判断偶数或基数偶数， 然后自动 +1，偶数变基数，基数变偶数
        if (isEven(num)) {
            num = sum(num, 1);
        } else {
            num = sum(num, -1);
        }
        System.out.println("Num数值为：" + num);

        // 方法不写static，使方法变成类对象来调用
        MyClassTest calculator = new MyClassTest();
        System.out.println(calculator.sum2(1,2));

        // String
        String str = "    Haier Hisenses   ";
        str = str.trim();   // 去头发展空格
        System.out.println("str 去头发展空格：" + str);
        // 替换字符Haier为Midea
        str = str.replace("Haier", "Midea");
        System.out.println("替换Haier字符为 Midea：" + str);
        //截取字符中一部分
        str = str.substring(6,14);
        System.out.println("截取字符中一部分" + str);
        // 给字符切片成单个字母char
        char[] charArray = str.toCharArray();
        System.out.println(charArray[0]);

        // Math数学运算类
        /*
        min(num1, num2) – 得到两个数之间的较小数
        sqrt(n) – 计算出n的平方根
        pow(num, n) – 计算出num的n次方
        floor(float) – 将浮点数变为最近的一个整数
        */
        double num1 = 14, num2 = 9.345;
        double minNum = Math.min(num1, num2);
        System.out.println("14 9.345两个数之间的较小数:" + minNum);
        // 将小数变成最近的整数
        minNum = Math.floor(minNum);
        System.out.println("9.345变成最近的小数:" + minNum);
        minNum = Math.sqrt(minNum);
        System.out.println("9 开方数:" + minNum);
        minNum = Math.pow(minNum, 3);  // 计算n次方 3次方
        System.out.println("3 3次文成数:" + minNum);

        /*
        * Arrays, Collections, List是经常被使用操作数组的类，这个类在java.util包中，所以我们想要调用时，必须在文件的最上面加上以下的import导入此类：
        *以下是常用的一些函数：
        * sort() – 将数组排序
        * toString() – 将数组变为已读的字符串
        * asList – 将数组转换成列表
        * reverse(array) – 将数组中的元素反转
        */
        Integer[] array = {5, 7, 6, 3, 4, 2, 1};

        // 排序sort
        Arrays.sort(array);
        System.out.println(array);

        // 将数组变为已读的字符串
        System.out.println(Arrays.toString(array));
        List<Integer> arrayList = Arrays.asList(array);
        System.out.println(arrayList);
        Collections.reverse(arrayList);
        System.out.println(arrayList);

        int[] a={1,6, 2,5,3,4};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        /*
         创建一个自己的方法sumList(array1, array2)，参数必须是两个长度相同的数组，然后在方法中将这两个数组的元素依次相加，返回一个含有相加元素的新数组含有参数。以下是调用此方法的效果：

        int[] array1 = {1, 5, 8, 9};
        int[] array2 = {2, 4, 8, 1};
        int[] sumArray = sumArray(array1, array2); // {3, 9, 16, 10}
         */

        int[] array1 = {1, 5, 8, 9};
        int[] array2 = {2, 4, 8, 1};
        int[] sumArray = sumArray(array1, array2);
        System.out.println(Arrays.toString(sumArray));






    }



    // 输入中文名字拼音，然后输出西式的排列方式
    public static void printName(String firstName, String lastName) {
        System.out.println(lastName + ". " + firstName);
    }

    // 输入任务正整数，自动判断偶数或基数,并返回true or false
    public static boolean isEven(int item) {
        if (item % 2 == 0) {
            return true;
        }
        return false;
    }

    // 接收两个数字 ，并两数相加
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }

    // 方法不写static，使方法变成类对象来调用
    public int sum2 (int num1, int num2) {
        return num1 + num2;
    }

    // 正数变负数 ，负数变正数
    public static void printOppositeNum(int num) {
        System.out.println(0 - num); // 也可以直接写 -num
    }

    // 两个数组相同位置的数相加
    public static int[] sumArray(int[] array1, int[] array2) {
        int[] arraySum = new int[array1.length];
//        int[] arraySum;
        for (int i = 0; i < array1.length; i++) {
            arraySum[i] = array1[i] + array2[i];
        }
        return arraySum;
    }

}



