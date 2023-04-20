package com.map.exer2;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 * ClassName: CityMapTest
 * Description:
 *案例：二级联动

     * 将省份和城市的名称保存在集合中，当用户选择省份以后，二级联动，显示对应省份的地级市供用户选择。

     * 效果演示见课件。

     * 提示：如果输入的省份不正确，需要重新输入。 如果输入的城市不正确，需要重新输入。
 * @Author wggglggg
 * @Create 2023/4/18 16:00
 * @Version 1.0
 */
public class CityMapTest {


    public static void main(String[] args) {
        Map map = CityMap.model;
        Scanner scanner = new Scanner(System.in);
        String[] cities;

        // 一 显示省份直辖市
        Set provinces = map.keySet();
        for (Object province : provinces) {
            System.out.print(province + "\t\t");
        }

        // 二 用户输入所有省份,显示 省份下的城市
        while (true) {
            System.out.print("\n请选择你所在的省份：");
            String province = scanner.next();

            cities = (String[]) map.get(province);
            if (cities == null || cities.length == 0){
                System.out.println("你输入的省份有误，请重新输入");
            }else {
                break;      //意味着用户输入的省份是存在的，则跳出当前循环
            }
        }

        for (String city: cities) {
            System.out.print(city + "\t\t");
        }

        l:while (true) {
            System.out.print("\n请选择你所有的城市:");
            String city = scanner.next();

            for (int i = 0; i < cities.length; i++) {
                if (city.equals(cities[i])) {
                    System.out.println("信息登记完毕");
                    break l;
                }
            }
            System.out.println("你输入的城市有误，请重新输入");
        }

        scanner.close();
    }

    @Test
    public void test1(){
        Map map = CityMap.model;
        Scanner scan = new Scanner(System.in);
        Object[] cities;



        Set provinces = map.keySet();

        for (Object province: provinces) {
            System.out.print(province + "\t\t");
        }

        while (true) {
            System.out.print("\n请输入所在省份:");
            String province = scan.next();

            cities = (Object[]) map.get(province);

            if (cities == null || cities.length == 0) {
                System.out.println("输入省份有误!");
            } else {
                break;
            }
        }

        for (int i = 0; i < cities.length; i ++) {
            System.out.print(cities[i] + "\t\t");
        }

        l:while (true){
            System.out.print("\n请输入所在城市:");
            String city = scan.next();

            for (int i = 0; i < cities.length; i++) {
                if (city.equals(cities[i])) {
                    System.out.println("信息登记完毕");
                    break l;
                }
            }
            System.out.println("你输入的城市有误，请重新输入");

        }

    }

}

class CityMap{

    public static Map model = new HashMap();

    static {
        model.put("北京", new String[] {"北京"});
        model.put("辽宁", new String[] {"沈阳","盘锦","铁岭","丹东","大连","锦州","营口"});
        model.put("吉林", new String[] {"长春","延边","吉林","白山","白城","四平","松原","null"});
        model.put("河北", new String[] {"承德","沧州","邯郸","邢台","唐山","保定","石家庄"});
        model.put("河南", new String[] {"郑州","许昌","开封","洛阳","商丘","南阳","新乡"});
        model.put("山东", new String[] {"济南","青岛","日照","临沂","泰安","聊城","德州"});
        model.put("重庆" , null);
    }

}
