package at.seya.OO.car;

public class Main {
    public static void main(String[] args) {
      /*  Car c1 = new Car("Audi", "A4 55 TDI S-Line", "Diesel");
        c1.colour = "SnowWhite";
        c1.fuelConsumption = 3;
        c1.fuelAmount = 65;
        c1.fuelCapacity = 70;
        c1.serialNumber = "A987e";

       */

        Car c2 = new Car("Audi", "A6 Avant 75 TFSI BusinessLine", "Diesel");
        c2.setBrand("Audi");
        c2.getBrand();
        c2.getModel();
        c2.setColour("ArcticWhite");
        c2.getColour();
        c2.getFuelType();
        c2.setFuelConsumption(5);
        c2.getFuelConsumption();
        c2.setFuelAmount(65);
        c2.getFuelAmount();
        c2.setFuelCapacity(75);
        c2.getFuelCapacity();
        c2.setSerialNumber("A782d");
        c2.getSerialNumber();

        c2.drive();
       System.out.println("Aktueller Fuellstand: " + c2.getFuelAmount());

        c2.ecoBoost();

        c2.getRemainingRange();
    }
}
