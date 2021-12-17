package at.seya.OO.car;

public class Engine {
    public enum engineType {Diesel, Gas}
    private int power;
    private Engine.engineType engineType; // Kraftstofftyp

    public Engine(int power, Engine.engineType engineType) {
        this.power = power;
        this.engineType = engineType;
    }

    public void drive(int amount) {
        System.out.println("fährt diese strecke...");
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public Engine.engineType getEngineType() {
        return engineType;
    }

    public void setEngineType(Engine.engineType engineType) {
        this.engineType = engineType;
    }
}
