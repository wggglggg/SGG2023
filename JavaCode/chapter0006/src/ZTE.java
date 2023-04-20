/**
 * ClassName: ZTE
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/15 9:27
 * @Version 1.0
 */
public class ZTE {
    public static void main(String[] args) {
        // 生成实例,有了实例就可以给它产生实质的属性
        Phone ZTE2021 = new Phone();

        ZTE2021.name = "ZTE2021";   // 给手机一个型号
        ZTE2021.color = "Black";    // 给手机一个颜色
        ZTE2021.size = 6.5;         // 给手机设置尺寸

        System.out.println("这是一款新手机，型号为: " + ZTE2021.name + "，外壳颜色是：" +
                ZTE2021.color + ",配备一块 " + ZTE2021.size + "inch的屏幕");

        ZTE2021.call(12345678);
        ZTE2021.photo();
        ZTE2021.message(987654321);

        /*
        这是一款新手机，型号为: ZTE2021，外壳颜色是：Black,配备一块 6.5inch的屏幕
        正在拨打电话给：12345678
        拍照片
        已发送消息给：987654321
         */
    }
}
