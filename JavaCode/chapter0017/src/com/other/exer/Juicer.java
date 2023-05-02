package com.other.exer;

/**
 * ClassName: Juicer
 * Description:
 *  案例：榨汁机榨水果汁，水果分别有苹果(Apple)、香蕉(Banana)、桔子(Orange)等
 *      2、声明榨汁机(Juicer)，包含运行方法：public void run(Fruit f)，方法体中，调用f的榨汁方法squeeze()
 * @Author wggglggg
 * @Create 2023/5/2 20:06
 * @Version 1.0
 */
public class Juicer {

    public void run(Fruit f) {
        f.squeeze();
    }
}
