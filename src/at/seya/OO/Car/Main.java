package at.seya.OO.Car;

import at.seya.OO.Car.Car;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car("Audi", "A4 55 TDI S-Line", "Diesel");
        c1.colour = "SnowWhite";
        c1.fuelConsumption = 3;
        c1.fuelAmount = 65;
        c1.fuelCapacity = 70;
        c1.serialNumber = "A987e";

        Car c2 = new Car("Audi", "A6 Avant 75 TFSI BusinessLine", "Diesel");
        c2.colour = "ArcticWhite";
        c2.fuelConsumption = 5;
        c2.fuelAmount = 65;
        c2.fuelCapacity = 80;
        c2.serialNumber = "A667e";

        c2.drive();
        System.out.println("Aktueller Fuellstand: " + c2.fuelAmount);

        c2.ecoBoost();

        c2.getRemainingRange();
    }
}
