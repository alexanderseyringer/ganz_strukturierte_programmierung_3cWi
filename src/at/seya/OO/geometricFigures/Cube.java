package at.seya.OO.geometricFigures;

public class Cube extends Figure{
    private double length;

    public Cube(String name, double length) {
        super(name);
        this.length = length;
    }

    @Override
    public void getArea() {
        double area = (this.length * this.length) * 6;
        System.out.println("Der Flächeninhalt beträgt: " + area + "cm^2");
    }
}
