package com.project.team.domain;

import com.project.team.service.Status;

import java.net.PortUnreachableException;

/**
 * ClassName: Designer
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/8 20:03
 * @Version 1.0
 */
public class Designer extends Programmer {
    private double bonus;       // 资金

    public Designer() {
    }

    public Designer(int id, String name, int age, double salary, Equipment equipment, double bonus) {
        super(id, name, age, salary, equipment);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public String toString() {
        return getDetail() + "\t设计师\t" + getStatus() + "\t" +
                getBonus() + "\t\t\t" + getEquipment().getDescription();
    }

    public String getDetailForTeam() {
        return getBasicDetailForTeam() + "设计师\t" + getBonus();
    }
}
