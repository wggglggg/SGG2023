/**
 * ClassName: RectanglesTest
 * Description:
 *          （2）在测试类中创建长度为 3 的 Rectangle[]数组，用来装 3 个矩形对象，并
 *      给 3 个矩形对象的长分别赋值为 10,20,30，宽分别赋值为 5,15,25，遍历输出
 * @Author wggglggg
 * @Create 2023/3/16 9:06
 * @Version 1.0
 */
public interface RectanglesTest {
    public static void main(String[] args) {
        // 生成一个数组，数组里装的3个rectangles对象
        Rectangles[] rectangles = new Rectangles[3];

        for (int i = 0; i < rectangles.length; i++) {
            // 实例外对象，按要求为3个
            // 长分别赋值为 10,20,30，宽分别赋值为 5,15,25
            rectangles[i] = new Rectangles();
            rectangles[i].length = 10 * (i + 1);
            rectangles[i].width = 5 * (2 * i + 1);
        }
        // 遍历输出信息
        for (int i = 0; i < rectangles.length; i++) {
            System.out.println(rectangles[i].getInfo());
        }

    }
}
