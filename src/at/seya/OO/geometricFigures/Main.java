package at.seya.OO.geometricFigures;

public class Main {
    public static void main(String[] args) {
        Circle c1 = new Circle("Kreis", 3);

        System.out.println(c1.getName());
        c1.getArea();

        Rectangle r1 = new Rectangle("Rechteck", 4,5);

        System.out.println(r1.getName());
        r1.getArea();

        Cube cu1 = new Cube("Würfel", 3);

        System.out.println(cu1.getName());
        cu1.getArea();
    }
}
