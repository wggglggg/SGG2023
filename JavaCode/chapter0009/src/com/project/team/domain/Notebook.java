package com.project.team.domain;

/**
 * ClassName: Notebook
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/8 19:36
 * @Version 1.0
 */
public class Notebook implements Equipment{
    private String model;       // 机器的型号
    private double price;       // 价格

    public Notebook() {
    }

    public Notebook(String model, double price) {
        this.model = model;
        this.price = price;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return model + "(" + price + ")";
    }
}
