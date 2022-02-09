package at.seya.OO.camera;

public class Manufacturer {
    private String name;
    private String homeland;

    public Manufacturer(String name, String homeland) {
        this.name = name;
        this.homeland = homeland;
    }

    public String getName() {
        return name;
    }

    public String getHomeland() {
        return homeland;
    }
}
