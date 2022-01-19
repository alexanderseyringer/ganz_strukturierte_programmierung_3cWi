package at.seya.OO.cars;

public class Car {
    private String colour;
    private int topSpeed;
    private int standardPriceRecommendation;
    private double standardFuelConsumption;
    private Engine engine;
    private Producer producer;
    int mileage;

    public Car(String colour, int topSpeed, int standardPriceRecommendation, double standardFuelConsumption, Engine engine, Producer producer, int mileage) {
        this.colour = colour;
        this.topSpeed = topSpeed;
        this.standardPriceRecommendation = standardPriceRecommendation;
        this.standardFuelConsumption = standardFuelConsumption;
        this.engine = engine;
        this.producer = producer;
        this.mileage = mileage;
    }

    public void discountedPrice() {
        double discountedPrice = this.standardPriceRecommendation - (this.standardPriceRecommendation * this.producer.getDiscount());
        System.out.println("Der Preis, nach abzug des Rabattes, beträgt: " + discountedPrice + "€");
    }

    public void newConsumption() {
        if(this.mileage >= 50000) {
            double newFuelConsumption = this.standardFuelConsumption + (this.standardFuelConsumption * 0.098);
            System.out.println("Der neue Spritverbrauch, nach 50.000km, beträgt: " + newFuelConsumption + "l/100km");
        }
        else {
            System.out.println("Alles in Ordnung!");
        }
    }
}
