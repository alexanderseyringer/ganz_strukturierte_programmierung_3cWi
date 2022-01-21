package at.seya.OO.calculator;

public class RootCalculator extends BasicCalculator {
    public RootCalculator(String producer, String model, String color) {
        super(producer, model, color);
    }

    public void rootCalc(double number1) {
        double result = Math.sqrt(number1);
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }
}
