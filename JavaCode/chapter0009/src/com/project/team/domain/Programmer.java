package com.project.team.domain;

import com.project.team.service.Status;

/**
 * ClassName: Programmer
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/8 19:50
 * @Version 1.0
 */
public class Programmer extends Employee{
    private int teamID;     // 成员加入开发团队后在团队中的ID
    private Status status = Status.FREE;    // 成员的状态
    private Equipment equipment;    // 该成员领用的设备

    public Programmer() {
    }

    public Programmer(int id, String name, int age, double salary,  Equipment equipment) {
        super(id, name, age, salary);
        this.equipment = equipment;
    }

    public int getTeamID() {
        return teamID;
    }

    public void setTeamID(int teamID) {
        this.teamID = teamID;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Equipment getEquipment() {
        return equipment;
    }

    public void setEquipment(Equipment equipment) {
        this.equipment = equipment;
    }

    @Override
    public String toString() {
        return getDetail() + "\t程序员\t" + status + "\t\t\t\t\t" + equipment.getDescription();
    }

    public String getBasicDetailForTeam() {
        return " " + getTeamID() + "/" + getId() + "\t" + getName() + "\t" + getAge() +
                "\t" + getSalary() + "\t";
    }

    public String getDetailForTeam() {
        return getBasicDetailForTeam() + "程序员";
    }
}
