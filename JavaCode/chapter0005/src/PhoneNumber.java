/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *案例 1：升景坊单间短期出租 4 个月，550 元/月（水电煤公摊，网费 35 元/
 *       月），空调、卫生间、厨房齐全。屋内均是 IT 行业人士，喜欢安静。所以要求
 *       来租者最好是同行或者刚毕业的年轻人，爱干净、安静。
 * @Author wggglggg
 * @Create ${DATE} ${TIME}
 * @Version 1.0
 */
public class PhoneNumber {
    public static void main(String[] args) {
        // Phone Number
        int[] arr = new int[] {3, 9, 1, 4, 5, 2, 7};
        int[] index = new int[] {2, 0, 1, 2, 5, 3, 6, 4, 5, 1, 6};
        // Real Number
        String tel = "";

        //从arr的Index处取号码
        for (int i = 0; i < index.length; i++) {
            tel += arr[index[i]];
        }
        System.out.println("Your Number is: " + tel);
    }
}