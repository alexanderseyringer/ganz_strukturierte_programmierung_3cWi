package at.seya.OO.cars;

import at.seya.OO.car.Tank;

public class Main {
    public static void main(String[] args) {

        Engine e1 = new Engine(110, at.seya.OO.car.Engine.engineType.Gas);

        Producer opel = new Producer("Opel", "Germany", 0.35);

        Car astraST = new Car("magicSilver", 200, 32000,3.23, e1, opel);

        astraST.discountedPrice();

        astraST.newConsumption(65000);

    }
}
