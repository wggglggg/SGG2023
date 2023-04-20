package com.string.exer2;

import org.junit.Test;

import java.util.Arrays;

/**
 * ClassName: StringTest
 * Description:
     * 题目2：将一个字符串进行反转。将字符串中指定部分进行反转。
     *       比如"abcdefg"反转为"abfedcg"
 * @Author wggglggg
 * @Create 2023/4/12 20:41
 * @Version 1.0
 */
public class StringTest {

    @Test
    public void test(){
        String s1 = "abcdefg";


        int head = 2;
        int back = 5;

        String s2 = reserve(s1, head, back);
        System.out.println(s2);


    }

    /**
     * 翻转字符串，
     * @param s 需要翻译的字符串
     * @param head  要反转的index，包含head
     * @param back  要反转的Index 包含back
     * @return  转换后的新字符串
     */
    private String reserve(String s, int head, int back) {
        char[] c = s.toCharArray();

        for (int i = head, j = back; i < j; i++, j--) {
            char temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        return new String(c);
    }

    /**
         * 题目3：获取一个字符串在另一个字符串中出现的次数。
         *       比如：获取"ab"在 "abkkcadkabkebfkabkskab" 中出现的次数
     */
    @Test
    public void test2(){
        String s1 = "abkkcadkabkebfkabkskab";
        String s2 = "ab";

        int i = count(s1, s2);
        System.out.println(i);

    }

    /**
     * 计算subStr在str中出现的次数
     * @param s
     * @param sub
     * @return
     */
    private int count(String s, String sub){

        int countNumber = 0;
        if (s.length() > sub.length()) {
            int index = s.indexOf(sub);
            while (index >= 0) {

                countNumber++;
                index = s.indexOf(sub, index+sub.length());
            }
        }
        return countNumber;
    }

    @Test
    public void test3(){
        String str = "abcwerthelloyuiodef";
        char[] charArr = str.toCharArray();

        Arrays.sort(charArr);
        String newStr = new String(charArr);
        System.out.println(newStr);
    }

    @Test
    public void test4(){
        String s1 = "abcwertheelloeyuiodef";
        String s2 = "heel";

        String[] result1 = getMaxSameSubString(s1,s2);
        for (String s : result1) {
            System.out.println(s);// he
        }

    }

    private String[] getMaxSameSubString(String str1, String str2){
        if (str1 != null && str2 != null) {
            String[] subString = new String[0];
            int subStringLen = 1;


            String maxStr = str1.length() > str2.length() ? str1 : str2;
            String minStr = str1.length() > str2.length() ? str2 : str1;
            int minStrLen = minStr.length();

            for (int i = 0; i < minStrLen; i++) {
                for (int head = 0, tail = minStrLen - i; tail <= minStrLen; head++, tail++) {

                    if (maxStr.contains(minStr.substring(head, tail))){
//                         return minStr.substring(head, tail);

                        subString = Arrays.copyOf(subString, subStringLen);
                        subString[subStringLen - 1] = minStr.substring(head, tail);
                        subStringLen++;
                    }

                }
            }
            return subString;
        }
        return null;
    }
}
