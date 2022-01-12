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
        Tire tr1 = new Tire(Tire.manufacturer.Continental,205, 1230, 41, true, 221221, Tire.maxSpeedIndex.Z);
        Tire tr2 = new Tire(Tire.manufacturer.Michelin, 200, 1100, 35, true, 222222, Tire.maxSpeedIndex.Q);

        Tank t1 = new Tank(Tank.fuelType.Diesel, 65, 75);

        Engine e1 = new Engine(t1,145, Engine.engineType.Diesel);

        RearMirror r1 = new RearMirror(69, 0);
        RearMirror r2 = new RearMirror(35, -10);

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
        a6.addMirror(r1);
        a6.addMirror(r2);
        a6.addTires(tr1);
        a6.addTires(tr2);

        System.out.println(a6.getMirrors().get(0).getPosition());

        System.out.println(a6.getEngine().getEngineType());

        System.out.println(a6.getTires().get(1).getManufacturer());

        r1.movement();
    }
}
