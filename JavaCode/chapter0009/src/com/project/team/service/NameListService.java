package com.project.team.service;

import com.project.team.domain.*;


/**
 * ClassName: NameListService
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/8 20:19
 * @Version 1.0
 */
public class NameListService {
    private Employee[] employees;   // 存储Data文件中的数据


    /**
     * 初始化时,自动将Data文件中的数据写入到employees中
     */
    public NameListService() {
        employees = new Employee[Data.EMPLOYEES.length];
        for (int i = 0; i < employees.length; i++) {
            // 从Data文件中获取员工的类型
            int type = Integer.parseInt(Data.EMPLOYEES[i][0]);
            int id = Integer.parseInt(Data.EMPLOYEES[i][1]);
            String name = Data.EMPLOYEES[i][2];
            int age = Integer.parseInt(Data.EMPLOYEES[i][3]);
            double salary = Double.parseDouble(Data.EMPLOYEES[i][4]);


            Equipment equipment;
            double bonus;
            int stock;

            switch (type) {
                case Data.EMPLOYEE:
                    employees[i] = new Employee(id, name, age, salary);
                    break;
                case Data.PROGRAMMER:
                    equipment = getEquipment(i);
                    employees[i] = new Programmer(id, name, age, salary, equipment);
                    break;
                case Data.DESIGNER:
                    equipment = getEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    employees[i] = new Designer(id, name, age, salary, equipment, bonus);
                    break;
                case Data.ARCHITECT:
                    equipment = getEquipment(i);
                    bonus = Double.parseDouble(Data.EMPLOYEES[i][5]);
                    stock = Integer.parseInt(Data.EMPLOYEES[i][6]);
                    employees[i] = new Architect(id, name, age, salary, equipment, bonus, stock);
                    break;
            }
        }
    }

    /**
     * 从Data文件中提取出设备
     * @param index 第几行设备
     * @return
     */
    private Equipment getEquipment(int index) {
        int equipmentType = Integer.parseInt(Data.EQUIPMENTS[index][0]);

        String modelOrName = Data.EQUIPMENTS[index][1];
        String priceOrTypeOrDisplay = Data.EQUIPMENTS[index][2];

        switch (equipmentType) {
            case Data.PC:
                return new PC(modelOrName, priceOrTypeOrDisplay);
            case Data.NOTEBOOK:
                return new Notebook(modelOrName, Double.parseDouble(priceOrTypeOrDisplay));
            case Data.PRINTER:
                return new Printer(modelOrName, priceOrTypeOrDisplay);
        }
        return null;
    }


    public NameListService(Employee[] employees) {
        this.employees = employees;
    }

    /**
     * 获得整个employees数组
     * @return
     */
    public Employee[] getAllEmployees() {

        return employees;
    }

    /**
     * 获取指定id对应的员工
     * @param id
     * @return
     * @throws TeamException
     */
    public Employee getEmployee(int id) throws TeamException {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getId() == id) {
                return employees[i];
            }
        }
        //如果执行到此位置，就意味着没有找到
        throw new TeamException("找不到指定的员工");
    }
}
