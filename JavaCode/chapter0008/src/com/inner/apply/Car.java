package com.inner.apply;

/**
 * ClassName: Car
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/4/1 14:30
 * @Version 1.0
 */
public class Car extends Vehicle{

    private Logo logo;

    public Car() {
    }

    public Car(String brand, String color, Logo logo) {
        super(brand, color);
        this.logo = logo;
    }

    public void run() {
        System.out.println(logo + " 的Car running");
    }

    public Logo getLogo() {
        return logo;
    }

    public void setLogo(Logo logo) {
        this.logo = logo;
    }

    public class Logo{
        private String logo_Name;

        public Logo() {
        }

        public Logo(String logo_Name) {
            this.logo_Name = logo_Name;
        }

        public String getLogo_Name() {
            return logo_Name;
        }

        public void setLogo_Name(String logo_Name) {
            this.logo_Name = logo_Name;
        }
    }
}
