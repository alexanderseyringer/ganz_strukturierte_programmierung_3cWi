package at.seya.OO.Car;

public class Car {
    public String brand;
    public String model;
    public String colour;
    public String fuelType;
    public int fuelConsumption;
    public int fuelAmount;
    public int fuelCapacity;
    public String serialNumber;

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
        System.out.println("Die Restreichweite Beträgt: " + range + "km!");
    }
}
