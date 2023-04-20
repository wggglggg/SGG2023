package com._interface.exer3;

/**
 * ClassName: VehicleTest
 * Description:
 *
 * @Author wggglggg
 * @Create 2023/3/31 10:38
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[3];
        Developer developer = new Developer();

        // { 0, 1, 2,.........}

        vehicles[0] = new Bicycle("Giant", "red");
        vehicles[1] = new ElectricVehicle("好迪", "silver");
        vehicles[2] = new Car("Subaru", "blue", "云BM633S");


        for (int i = 0; i < vehicles.length; i++) {
            developer.takingVehicle(vehicles[i]);
            if (vehicles[i] instanceof IPower) {
                IPower IPvehicles = (IPower) vehicles[i];
                IPvehicles.power();
            }
        }
        ElectricVehicle ev1 = new ElectricVehicle();
        ev1.washWindow();
        ev1.pump();
        IPower2.washWindow();


    }
}
