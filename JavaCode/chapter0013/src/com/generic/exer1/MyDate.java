package com.generic.exer1;

import java.util.Comparator;
import java.util.Objects;

/**
 * ClassName: MyDate
 * Description:
 *          2. MyDate类包含:
 *    private成员变量year,month,day；并为每一个属性定义 getter, setter 方法；
 * @Author wggglggg
 * @Create 2023/4/20 16:50
 * @Version 1.0
 */
public class MyDate implements Comparable<MyDate> {
    private int year;
    private int month;
    private int day;

    public MyDate() {
    }

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "[" + year + "年" + month + "月" + day + "日]";
    }

    @Override
    public int compareTo(MyDate o) {
        int yearCompare = this.getYear() - o.getYear();
        int monthCompare = this.getMonth() - o.getMonth();
        int dayCompare = this.getDay() - o.getDay();


        if (yearCompare != 0) {
            return yearCompare;
        }else if (monthCompare != 0) {
            return monthCompare;
        }
        return dayCompare;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return year == myDate.year && month == myDate.month && day == myDate.day;
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}
