package at.seya.OO.geometricFigures;

public class Circle extends Figure {
    private double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public void getArea() {
        double area = (this.radius * this.radius) * Math.PI;
        System.out.println("Der Flächeninhalt beträgt: " + area + "cm^2");
    }
}
