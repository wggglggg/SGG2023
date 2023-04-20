package com.anonymous.exer1;

import java.util.Arrays;

/**
 * ClassName: StringUtil
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/3 13:03
 * @Version 1.0
 */
public class StringUtil {
    public static String[] select(String[] originArray, StringFilter filter){
        // 新数组,存放符合filter过滤器的字符串数组
        String[] resultArray = new String[0];
        // count为了扩展新数组而需要的参数
        int count  = 0;

        // 循环字符串数组,用过滤器来比对,发现
        for (String str : originArray) {
            if (filter.isMatch(str)) {
                count++;
                resultArray = Arrays.copyOf(originArray, count);
                // 将找到的字符串,添加到数组最后一位
                resultArray[count - 1] = str;
            }
        }
        return resultArray;

    }

}

