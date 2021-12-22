package at.seya.OO.car;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private Engine engine;
    private List<RearMirror> mirrors;
    private int fuelConsumption;
    private int fuelAmount;
    private int fuelCapacity;
    private String serialNumber;
    private List<Tire> tires;

    public Car(Engine engine, String brand, String model) {
        this.engine = engine;
        this.brand = brand;
        this.model = model;
        this.mirrors = new ArrayList<>();
        this.tires = new ArrayList<>();
    }

    public void addMirror(RearMirror rearMirror) {
        this.mirrors.add(rearMirror);
    }

    public void addTires(Tire tires) {
        this.tires.add(tires);
    }

    public void drive() {
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Dat Auto löppt!");
    }

    public void breaking() {
        System.out.println("Ich Bremse");
    }

    public void ecoBoost() {
        if (fuelAmount > 0.10 * fuelCapacity) {
            System.out.println("Super Duper Boost Mode!");
        } else {
            System.out.println("Not enough Fuel to go superduperboost!");
        }
    }

    public void honk(int amountOfRepetitions) {
        for (int i = 0; i < amountOfRepetitions; i++) {
            System.out.println("Tuuuuuut");
        }
    }

    public void getRemainingRange() {
        int range = fuelAmount / fuelConsumption;
        range = range * 100;
        System.out.println("Die Restreichweite Beträgt: " + range + "km");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(int fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public List<RearMirror> getMirrors() {
        return mirrors;
    }

    public List<Tire> getTires() {
        return tires;
    }
}

