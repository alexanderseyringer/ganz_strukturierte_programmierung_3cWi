package at.seya.OO.car;

public class Tank {
    public enum fuelType {Diesel, Gas}
    private int fuelAmount;
    private int fuelCapacity;
    private Tank.fuelType fuelType;

    public Tank(Tank.fuelType fuelType, int fuelAmount, int fuelLevel) {
        this.fuelAmount = fuelAmount;
        this.fuelCapacity = fuelLevel;
        this.fuelType = fuelType;
    }

    public int getFuelAmount() {
        return fuelAmount;
    }

    public void setFuelAmount(int fuelAmount) {
        this.fuelAmount = fuelAmount;
    }

    public int getFuelLevel() {
        return fuelCapacity;
    }

    public void setFuelLevel(int fuelLevel) {
        this.fuelCapacity = fuelLevel;
    }

    public Tank.fuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(Tank.fuelType fuelType) {
        this.fuelType = fuelType;
    }
}
