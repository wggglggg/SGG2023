package com._abstract.exer2;

import java.util.Calendar;

/**
 * ClassName: SalaredEmployee
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/30 9:09
 * @Version 1.0
 */
public class SalaredEmployee extends Employee{
    private double monthlySalar;  //月工资

    public SalaredEmployee() {}
    public SalaredEmployee(String name, int number, MyDate birthday, double monthlySalar){
        super(name, number, birthday);
        this.monthlySalar = monthlySalar;
    }

    // 月工资
    public double earnings() {
        return monthlySalar;
    }
    public void setMonthlySalar() {
        this.monthlySalar = monthlySalar;
    }

    public String toString() {
        return "SalariedEmployee[ " + super.toString() + " ]";
    }
}
