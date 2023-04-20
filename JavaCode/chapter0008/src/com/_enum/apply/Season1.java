package com._enum.apply;

/**
 * ClassName: Season1
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 19:26
 * @Version 1.0
 */
public class Season1 {

    private final String seasonName;
    private final String desc;

    public Season1(String seasonName, String desc) {
        this.seasonName = seasonName;
        this.desc = desc;
    }

    public String getSeasonName() {
        return seasonName;
    }

    public String getDesc() {
        return desc;
    }

    public final static Season1 SPRING = new Season1("春天", "春意盎然");
    public final static Season1 SUMMER = new Season1("夏天", "夏日炎炎");
    public final static Season1 FALL = new Season1("秋天", "秋风瑟瑟");
    public final static Season1 WINTER = new Season1("冬天", "白雪皑皑");

    public String toString() {
        return "Season{ " +
                "seasonName :" + seasonName +
                " ,desc :" + desc +
                " }";
    }

}
