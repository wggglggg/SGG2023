package com.project.team.domain;

import com.project.team.service.Status;

/**
 * ClassName: Architeck
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/8 20:09
 * @Version 1.0
 */
public class Architect extends Designer{
    private int stock;  // 股票数量

    public Architect() {
    }

    public Architect(int id, String name, int age, double salary, Equipment equipment, double bonus, int stock) {
        super(id, name, age, salary, equipment, bonus);
        this.stock = stock;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return getDetail() + "\t架构师\t" + getStatus() + "\t" +
                getBonus() + "\t" + getStock() + "\t" + getEquipment().getDescription();
    }

    public String getDetailForTeam() {
        return getBasicDetailForTeam() + "架构师\t" + getBonus() + "\t" + getStock();
    }
}
