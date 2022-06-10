package at.seya.schoolcheck.JuraGiga5;

public class BeanBin {
    private int fillLevel = 0; // in Percent
    private int maxFillLevel = 100; //in Percent

    public BeanBin(int fillLevel, int maxFillLevel) {
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
