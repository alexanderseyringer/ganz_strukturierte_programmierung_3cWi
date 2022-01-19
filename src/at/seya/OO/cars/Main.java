package at.seya.OO.cars;

import at.seya.OO.car.Tank;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(110, at.seya.OO.car.Engine.engineType.Gas);

        Engine e2 = new Engine(365, at.seya.OO.car.Engine.engineType.Gas);

        Producer audi = new Producer("Audi", "Germany", 0.10);

        Producer opel = new Producer("Opel", "Germany", 0.35);

        Car rs6Avant = new Car("sunsetOrange", 350, 78000, 6.8, e2, audi, 10654);

        Car astraST = new Car("magicSilver", 200, 32000,3.23, e1, opel, 65000);

        astraST.discountedPrice();

        astraST.newConsumption();

        rs6Avant.discountedPrice();

        rs6Avant.newConsumption();

    }
}
