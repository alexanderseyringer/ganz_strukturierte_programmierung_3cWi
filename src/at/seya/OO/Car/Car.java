package at.seya.OO.car;

public class Car {
    private String brand;
    private String model;
    private String colour;
    private String fuelType;
    private int fuelConsumption;
    private int fuelAmount;
    private int fuelCapacity;
    private String serialNumber;

    public Car(String brand, String model, String fuelType) {
        this.brand = brand;
        this.model = model;
        this.fuelType = fuelType;
    }


    public void drive(){
        this.fuelAmount = this.fuelAmount - fuelConsumption;
        System.out.println("Dat Auto löppt!");
    }

    public void breaking(){
        System.out.println("Ich Bremse");
    }

    public void ecoBoost(){
        if(fuelAmount > 0.10*fuelCapacity){
            System.out.println("Super Duper Boost Mode!");
        }

        else {
            System.out.println("Not enough Fuel to go superduperboost!");
        }
    }

    public void honk(int amountOfRepetitions){
        for (int i = 0; i < amountOfRepetitions ; i++) {
            System.out.println("Tuuuuuut");
        }
    }

    public void getRemainingRange(){
        int range = fuelAmount/fuelConsumption;
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

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
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
}
