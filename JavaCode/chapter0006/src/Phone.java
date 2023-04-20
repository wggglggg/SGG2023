/**
 * ClassName: Phone
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/15 9:18
 * @Version 1.0
 */
public class Phone {

    // Phone类的属性，例如型号 颜色 屏幕大小
    String name;    // 型号
    String color;   // 颜色
    double size;    // 尺寸

    // Phone的方法， 例如手机可以打电话， 拍照， 发消息
    public void call(long number){
        System.out.println("正在拨打电话给：" + number);
    }

    public void photo() {
        System.out.println("拍照片");
    }

    public void message(long number) {
        System.out.println("已发送消息给：" + number);
    }
}
