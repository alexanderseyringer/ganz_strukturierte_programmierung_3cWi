package at.seya.OO.calculator;

public class ScientificCalculator extends BasicCalculator{
    public ScientificCalculator(String producer, String model, String color) {
        super(producer, model, color);
    }

    public void sinCalc(double deg) {
        double result = Math.sin(deg);
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }

    public void cosCalc(double deg) {
        double result = Math.cos(deg);
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }
}
