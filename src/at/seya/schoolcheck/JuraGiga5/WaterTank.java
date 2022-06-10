package at.seya.schoolcheck.JuraGiga5;

public class WaterTank {
    private int fillLevel = 1000; //In ml
    private int maxFillLevel = 1500;

    public WaterTank(int fillLevel, int maxFillLevel) {
        this.fillLevel = fillLevel;
        this.maxFillLevel = maxFillLevel;
    }

    public int getFillLevel() {
        return fillLevel;
    }

    public int getMaxFillLevel() {
        return maxFillLevel;
    }

    public void setFillLevel(int fillLevel) {
        this.fillLevel = fillLevel;
    }
}
