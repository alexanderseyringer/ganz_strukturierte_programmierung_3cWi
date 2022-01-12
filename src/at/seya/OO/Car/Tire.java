package at.seya.OO.car;

public class Tire {
    public enum manufacturer {Michelin, Goodyear, Continental, Pirelli}
    private int tireWidth;
    private int maxLoad;
    private int maxPressure;
    private boolean tubeless;
    private int createDate;
    public enum maxSpeedIndex {Q,R,S,T,H,V,Z,W}
    private Tire.manufacturer manufacturer;
    private Tire.maxSpeedIndex maxSpeedIndex;

    public Tire(Tire.manufacturer manufacturer, int tireWidth, int maxLoad, int maxPressure, boolean tubeless, int createDate, Tire.maxSpeedIndex maxSpeedIndex) {
        this.tireWidth = tireWidth;
        this.maxLoad = maxLoad;
        this.maxPressure = maxPressure;
        this.tubeless = tubeless;
        this.createDate = createDate;
    }

    public int getTireWidth() {
        return tireWidth;
    }

    public void setTireWidth(int tireWidth) {
        this.tireWidth = tireWidth;
    }

    public int getMaxLoad() {
        return maxLoad;
    }

    public void setMaxLoad(int maxLoad) {
        this.maxLoad = maxLoad;
    }

    public int getMaxPressure() {
        return maxPressure;
    }

    public void setMaxPressure(int maxPressure) {
        this.maxPressure = maxPressure;
    }

    public boolean isTubeless() {
        return tubeless;
    }

    public void setTubeless(boolean tubeless) {
        this.tubeless = tubeless;
    }

    public int getCreateDate() {
        return createDate;
    }

    public void setCreateDate(int createDate) {
        this.createDate = createDate;
    }

    public Tire.manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Tire.manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Tire.maxSpeedIndex getMaxSpeedIndex() {
        return maxSpeedIndex;
    }

    public void setMaxSpeedIndex(Tire.maxSpeedIndex maxSpeedIndex) {
        this.maxSpeedIndex = maxSpeedIndex;
    }
}
