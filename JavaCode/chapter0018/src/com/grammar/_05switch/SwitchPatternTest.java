package com.grammar._05switch;

/**
 * ClassName: SwitchPatternTest
 * Description:
 *                                  switch模式匹配
 * @Author wggglggg
 * @Create 2023/5/8 16:32
 * @Version 1.0
 */
public class SwitchPatternTest {

    public static void main(String[] args) {
        System.out.println(formatter(12));

//        System.out.println(formatterSwitchPatter("打印机"));
    }
    /*
     * JDK17之前
     * */
    static String formatter(Object o) {
        String formatted = "unknown";
        if (o instanceof Integer i) {
            formatted = "int:" + i;
        } else if (o instanceof Long l) {
            formatted = "long:" + l;
        }else if (o instanceof Double d) {
            formatted = "double:" + d;
        }else if (o instanceof String s) {
            formatted = "int:" + s;
        }
        return formatted;
    }

    /*
     * JDK17中switch的模式匹配
     * */
//    static String formatterSwitchPatter(Object o) {
//        String formatted = switch (o) {
//            case Integer i: yield "int:" + i;
//            case Long l: yield "long:" + l;
//            case Double d: yield "double:" + d;
//            case String s: yield "String:" + s;
//            default: yield o.toString();
//        };
//        return formatted;
//    }
}
