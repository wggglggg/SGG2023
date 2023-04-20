package com._abstract.exer2;

/**
 * ClassName: HourlyEmployee
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 9:09
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{
    private double wage;    // 薪资/每小时
    private double hour;    // 小时

    public HourlyEmployee() {}
    public HourlyEmployee(String name, int number, MyDate birthday, double wage, double hour) {
        super(name, number, birthday);
        this.wage = wage;
        this.hour = hour;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double getHour() {
        return hour;
    }

    public void setHour(double hour) {
        this.hour = hour;
    }

    public double earnings() {
        return wage * hour;
    }

    public String toString() {
        return "HourlyEmployee[ " + super.toString() + " ]";
    }
}
