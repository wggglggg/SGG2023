/**
 * ClassName: StringConcatTest
 * Description:
 *      n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，那么返回空字符串""
 * @Author wggglggg
 * @Create 2023/3/17 10:27
 * @Version 1.0
 */
public class StringConcatTest {

    public static void main(String[] args) {

        StringConcatTest str = new StringConcatTest();

//        String finalResult = str.concat(",", "First Code", "Android", "Version 4th");
        String finalResult = str.concat(",", "");
        System.out.println(finalResult);
    }

    public String concat(String operator, String ... strs) {
        String result = "";
        System.out.println(strs.length);
        // 如果接收字符串组只有一个元素
        for (int i = 0; i < strs.length; i++) {
            if (i == 0 ) {
                result += strs[i];
            } else {
                result += operator + strs[i];
            }
        }

        return result;
    }
}
