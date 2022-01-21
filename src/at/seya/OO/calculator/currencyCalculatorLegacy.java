package at.seya.OO.calculator;

public class currencyCalculatorLegacy extends BasicCalculator{

    public currencyCalculatorLegacy(String producer, String model, String color) {
        super(producer, model, color);
    }

    public void toEuro(String originatingCurrency, double originatingAmount) {
        double newAmount;
        if(originatingCurrency == "Dollar") {
            newAmount = originatingAmount * 0.88; //Stand 19.01.2022 09:33
            System.out.println("Der neue Betrag lautet: " + newAmount);
        }
    }

}
