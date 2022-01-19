package at.seya.OO.calculator;

public class BasicCalculator {
    private String producer;
    private String model;
    private String color;

    public BasicCalculator(String producer, String model, String color) {
        this.producer = producer;
        this.model = model;
        this.color = color;
    }

    public String getProducer() {
        return producer;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void addition(int firstNumber, int secondNumber) {
        int result;
        result = firstNumber + secondNumber;
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }

    public void subtracation(int firstNumber, int secondNumber) {
        int result;
        result = firstNumber - secondNumber;
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }

    public void multiplication(int firstNumber, int secondNumber) {
        int result;
        result = firstNumber * secondNumber;
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }

    public void division(int firstNumber, int secondNumber) {
        int result;
        result = firstNumber / secondNumber;
        System.out.println("Das Ergebnis der Berechnung lautet: " + result);
    }

}
