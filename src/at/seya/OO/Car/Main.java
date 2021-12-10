package at.seya.OO.Car;

import at.seya.OO.Car.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = "Audi";
        c1.model = "A4 55 TDI S-Line";
        c1.colour = "SnowWhite";
        c1.fuelType = "Diesel";
        c1.fuelConsumption = 3;
        c1.fuelAmount = 65;
        c1.fuelCapacity = 70;
        c1.serialNumber = "A987e";

        c1.drive();
        System.out.println("Aktueller Fuellstand: " + c1.fuelAmount);

        c1.ecoBoost();

        c1.honk(11);
    }
}
