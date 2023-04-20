package com.project.team.service;

import com.project.team.domain.Employee;
import com.project.team.domain.Programmer;
import com.project.team.view.TSUtility;
import org.junit.Test;

/**
 * ClassName: TeamView
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/9 9:41
 * @Version 1.0
 */
public class TeamView {
    private NameListService listSvc = new NameListService();
    private TeamService teamSvc = new TeamService();

    /**
     * 主界面显示及控制方法
     */
    public void enterMainMenu() {
        int key = 0;
        boolean isFlag = true;

        while (isFlag) {
            if (key != '1') {
                listAllEmployees();
            }

            System.out.print("1-团队列表  2-添加团队成员  3-删除团队成员 4-退出   请选择(1-4)：");
            key = TSUtility.readMenuSelection();

            switch (key) {
                case '1':
                    getTeam();
                    break;
                case '2':
                    addMember();
                    break;
                case '3':
                    deleteMember();
                    break;
                case '4':
                    isFlag = false;
                    break;
            }
        }
    }

    /**
     * 显示所有的员工成员
     */
    private void listAllEmployees() {
        System.out.println("\n-------------------------------优尚开发团队调度系统--------------------------------");
        System.out.println("ID\t姓名\t\t年龄\t工资\t\t职位\t\t状态\t\t奖金\t\t股票\t\t领用设备");
        Employee[] employee = listSvc.getAllEmployees();
        ;
        if (employee.length == 0) {
            System.out.println("没有客户记录！");
        }
        for (int i = 0; i < employee.length; i++){
            System.out.println(employee[i]);
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    /**
     * 显示开发团队成员列表
     */
    private void getTeam() {
        System.out.println("\n--------------------团队成员列表---------------------");
        System.out.println("TID/ID\t姓名\t\t年龄\t工资\t\t职位\t\t奖金\t\t股票");
        Programmer[] programmer = teamSvc.getTeam();

        if (programmer.length == 0) {
            System.out.println("开发团队目前没有成员！");
        }

        for (int i = 0; i < programmer.length; i++) {
            System.out.println(programmer[i].getDetailForTeam());
        }
        System.out.println("-------------------------------------------------------------------------------");
    }

    /**
     * 添加成员到团队
     */
    private void addMember(){
        System.out.println("---------------------添加成员---------------------");
        System.out.print("请输入要添加的员工ID：");
        int id = TSUtility.readInt();
        try {
            Employee employee = listSvc.getEmployee(id);
            teamSvc.addMember(employee);
            System.out.println("添加成功");
        } catch (TeamException e) {
            System.out.println("添加失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    private void deleteMember() {

        System.out.println("---------------------删除成员---------------------");
        System.out.print("请输入要删除员工的TeamID：");
        int teamID = TSUtility.readInt();

        System.out.print("确认是否删除(Y/N)：");
        char yn = TSUtility.readConfirmSelection();
        if (yn == 'N') {
             getTeam();
        }
        try {
            teamSvc.removeMember(teamID);
            System.out.println("删除成功");
        }catch (TeamException e) {
            System.out.println("删除失败，原因：" + e.getMessage());
        }
        // 按回车键继续...
        TSUtility.readReturn();
    }

    public static void main(String[] args) {
        TeamView view = new TeamView();
        view.enterMainMenu();

    }
}
