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

        Tank t1 = new Tank(Tank.fuelType.Diesel, 65, 75);

        Engine e1 = new Engine(t1,145, Engine.engineType.Diesel);

        Car a6 = new Car(e1, "Audi", "A6 75 TDI S-Line");
        a6.setBrand("Audi");
        a6.getBrand();
        a6.getModel();
        a6.setColour("ArcticWhite");
        a6.getColour();
        a6.getEngine();
        a6.setFuelConsumption(5);
        a6.getFuelConsumption();
        a6.setFuelAmount(t1.getFuelAmount());
        a6.getFuelAmount();
        a6.setFuelCapacity(t1.getFuelLevel());
        a6.getFuelCapacity();
        a6.setSerialNumber("A782d");
        a6.getSerialNumber();

        e1.drive(50);

        a6.drive();
       System.out.println("Aktueller Fuellstand: " + a6.getFuelAmount());

        a6.ecoBoost();

        a6.getRemainingRange();
    }
}
