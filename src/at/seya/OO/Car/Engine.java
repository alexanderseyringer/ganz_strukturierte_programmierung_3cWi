package at.seya.OO.car;

public class Engine {
    private Tank tank;
    public enum engineType {Diesel, Gas}
    private int power;
    private Engine.engineType engineType; // Kraftstofftyp

    public Engine(Tank tank, int power, Engine.engineType engineType) {
        this.tank = tank;
        this.power = power;
        this.engineType = engineType;
    }

    public void drive(int speed) {
        if(speed <= 100 && speed >= 0) {
            System.out.println("Das Auto beschleunigt nun mit " + speed + "% seiner Leistung!");
        }
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
