package com._enum.apply;

import org.w3c.dom.ls.LSOutput;

/**
 * ClassName: Season
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 19:11
 * @Version 1.0
 */
public enum Season implements Drinking{

    SPRING("春天", "春意盎然"){
        public void water() {
            System.out.println("春天多喝水");
        }
    },
    SUMMER("夏天", "夏日炎炎"){
        public void water() {
            System.out.println("夏天品尝雪糕");
        }
    },
    FALL("秋天", "秋风瑟瑟"){
        public void water() {
            System.out.println("秋天容易上火");
        }
    },
    WINTER("冬天", "白雪皑皑"){
        public void water() {
            System.out.println("冬天吃牛肉火锅");
        }
    };


    private final String seasonName;
    private final String desc;
    private static int i = 0;

    private Season(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDesc() {
        return desc;
    }

    public int getNumber() {
        i++;
        return i;
    }

    public String toString() {
        return "Season{ " +
                "seasonName :" + seasonName +
                " ,desc :" + desc +
                " }";
    }
}
