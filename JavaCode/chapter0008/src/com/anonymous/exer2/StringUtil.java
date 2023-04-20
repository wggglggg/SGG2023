package com.anonymous.exer2;

import java.util.Arrays;

/**
 * ClassName: StringUtil
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/3 15:03
 * @Version 1.0
 */
public class StringUtil {

    public static String[] select(String[] stringArray, StringFilter filter) {
        String[] resultArray = new String[0];
        int count = 0;
        // 循环老数组,找到需要的字符串
        for (String str : stringArray) {
            if (filter.isMatch(str)) {
                count++;
                resultArray = Arrays.copyOf(stringArray, count);
                resultArray[count-1] = str;
            }
        }

        return resultArray;
    }

    public static String[] select2(String[] originArray, StringFilter2 filter, String sign) {
        String[] resultArray = new String[0];
        int count = 0;
        for (String str : originArray) {
            if (filter.isMatch(str, sign)) {
                count++;
                resultArray = Arrays.copyOf(resultArray, count);
                resultArray[count-1] = str;
            }
        }
        return resultArray;
    }
}
