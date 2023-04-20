/**
 * ClassName: ArrayTools
 * Description:
 *      案例：
 *      根据上一章数组中的常用算法操作，自定义一个操作int[]的工具类。
 *      涉及到的方法有：求最大值、最小值、总和、平均数、遍历数组、复制数组、
 *              数组反转、数组排序(默认从小到大排序)、查找等
 * @Author wggglggg
 * @Create 2023/3/15 20:07
 * @Version 1.0
 */
public class ArrayTools {

    /**
     * 获取int[]数组的最大值
     * @param arr 一个数组
     * @return 返回数组的最大值
     */
    public int getMax (int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    /**
     * 获取int[]数组的最小值
     * @param arr 一个数组
     * @return 返回数组的最小值
     */
    public int getMin (int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }

    /**
     * 获取int[]数组的元素的总和
     * @param arr 一个数组
     * @return 返回数组的总和
     */
    public int getSum (int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    /**
     * 获取int[]数组的元素的平均值
     * @param arr 一个数组
     * @return 返回数组平均值
     */
    public int getAvg (int[] arr) {
        return getSum(arr) / arr.length;
    }

    /**
     * 遍历int[]数组的元素，并打印出来
     * @param arr 一个数组
     */
    public void oneByOne (int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                System.out.print(arr[i]);
            } else {
                System.out.print("," + arr[i]);
            }
        }
        System.out.println("]");
    }

    /**
     * 克隆int[]数组
     * @param arr 一个数组
     * @return 返回新克隆后的数组
     */
    public int[] copyArray (int[] arr) {
        // 一个新数组，用来存放旧数组
        int[] newArray = new int[arr.length];
        for (int i = 0; i < arr.length; i ++) {
            newArray[i] = arr[i];
        }
        return newArray;
    }

    /**
     * 反转int[]数组的元素，并打印出来
     * @param arr 一个数组
     */
    public void reverseArray (int[] arr) {  // [0,1,2,3,4]
        for (int i = 0, j = arr.length - 1; i < arr.length / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    /**
     * 排序int[]数组
     * @param arr 一个数组
     */
    public void sortArray (int[] arr) {

        // 使用冒泡排序

        for (int i = 1; i < arr.length; i ++) {
            boolean isFlag = true;
            for (int j = 0; j < arr.length - i; j ++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isFlag = false;
                }
            }
            if (isFlag) {
                break;
            }
        }
    }

    /** 给一个数组排序
     * 排序int[]数组,可以指定正序与倒序
     * @param arr 一个数组
     * @param orderBy 排序方式 正序“asc”， 与倒序"desc"
     */
    public void sortArray (int[] arr, String orderBy) {

        // 使用冒泡排序,有正序与倒序
        if ("asc".equals(orderBy)) {
            for (int i = 1; i < arr.length; i ++) {
                boolean isFlag = true;
                for (int j = 0; j < arr.length - i; j ++) {
                    if (arr[j] > arr[j + 1]) {
                        swap(arr, j, j+1);
                        isFlag = false;
                    }
                }
                if (isFlag) {
                    break;
                }
            }
        } else if ("desc".equals(orderBy)) {
            for (int i = 1; i < arr.length; i ++) {
                boolean isFlag = true;
                for (int j = 0; j < arr.length - i; j ++) {
                    if (arr[j] < arr[j + 1]) {
                        // 可以多次调用swap交换方法
                        swap(arr, j, j+1);
                        isFlag = false;
                    }
                }
                if (isFlag) {
                    break;
                }
            }
        } else {
            System.out.println("请输入正确的排序方式，'asc'是正序，'desc'是倒序");
        }
    }

    /**
     * 将交换写成一个方法
     * @param arr   传一个数组对象
     * @param i     传的A下标
     * @param j     传的B下标
     */
    public void swap (int[] arr, int i, int j ) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 查询int[]数组中的元素
     * @param arr 一个数组
     * @return 返回新元素的下标index,未找到返回-1
     */
    public int searchArray (int[] arr, int target) {
        sortArray(arr);
        int left = 0;
        int right = arr.length - 1;
        int middle = (left + right) / 2;
        while (arr[middle] != target) {

            if (target > arr[middle] && right >= left) {
                left = middle + 1;
            } else if (target < arr[middle] && right >= left) {
                right = middle - 1;
            } else {
                System.out.println("目标不存在");
                return - 1;
            }
            middle = (left + right) / 2;
        }
        return middle;
    }
}
