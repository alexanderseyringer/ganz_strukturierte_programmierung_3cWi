package at.seya.OO.camera;

public class Objective {
    private String manufacturer;
    private int focalLength;

    public Objective(String manufacturer, int focalLength) {
        this.manufacturer = manufacturer;
        this.focalLength = focalLength;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getFocalLength() {
        return focalLength;
    }
}
