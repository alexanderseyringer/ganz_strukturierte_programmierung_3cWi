package at.seya.schoolcheck.JuraGiga5;

public class Controller {
    private int degreeOfGrinding = 5; //Mahlgrad
    private int coffeeSize = 40; //in ml
    private BeanBin beanBin;
    private WaterTank waterTank;
    private boolean isSwitchedOn = false;

    public Controller(BeanBin beanBin, WaterTank waterTank) {
        this.beanBin = beanBin;
        this.waterTank = waterTank;
    }

    public void switchOn() {
        if (this.isSwitchedOn == false) {
            this.isSwitchedOn = true;
            System.out.println("System is Booting up...");
            System.out.println("Bitte wählen!");
        }
        else {
            System.out.println("Das Gerät ist bereits eingeschaltet!"); //sleep gibts einfach ned - die maschine ist zu smort!
        }
    }

    public void switchOff() {
        if (this.isSwitchedOn) {
            this.isSwitchedOn = false;
            System.out.println("Das Gerät wird gespült und heruntergefahren...");
            System.out.println("Auf Widersehen!");
        }
    }

    public void setDegreeOfGrinding(int grindingDegree) {
        if (grindingDegree >= 1 && grindingDegree <= 10) {
            this.degreeOfGrinding = grindingDegree;
            System.out.println("Der Mahlgrad wurde auf eine Stärke von " + this.degreeOfGrinding + " gestellt!");
        }
        else {
            System.out.println("Dies ist ein nicht zulässiger Wert! Zurück zum anfang!");
        }
    }

    public void setCoffeeSize(int coffeeSize) {
        if (coffeeSize >= 40 && coffeeSize <= 200) {
            this.coffeeSize = coffeeSize;
            System.out.println("Die Kaffeegröße wurde auf " + this.coffeeSize + "ml gestellt!");
        }
        else {
            System.out.println("Dies ist ein nicht zulässiger Wert! Zurück zum anfang!");
        }
    }

    public void fillWaterTank(int refillValue) {
        if (refillValue + this.waterTank.getFillLevel() <= this.waterTank.getMaxFillLevel()) {
            this.waterTank.setFillLevel(this.waterTank.getFillLevel() + refillValue);
            System.out.println("Das Wasser wurde nachgefüllt!");
            System.out.println("Der Wasserstand beträgt nun " + this.waterTank.getFillLevel() + "ml!");
        }
        else {
            System.out.println("Dies ist genug Wasser für eine Kleinstadt! Zurück zum Anfang!");
        }
    }

    public void refillBeans(int refillValue) {
        if (this.beanBin.getFillLevel() + refillValue <= this.beanBin.getMaxFillLevel()) {
            this.beanBin.setFillLevel(this.beanBin.getFillLevel() + refillValue);
            System.out.println("Der Bohnenbehälter wurde befüllt!");
            System.out.println("Der Füllstand beträgt nun " + this.beanBin.getFillLevel() + "%!");
        }
        else {
            System.out.println("Dies ist ein nicht zulässiger Wert! Zurück zum anfang!");
        }
    }

    public void getJava() {
        if (this.isSwitchedOn && this.beanBin.getFillLevel() >= this.degreeOfGrinding && this.waterTank.getFillLevel() >= this.coffeeSize) {
            System.out.println("Es wird ein Kaffee mit der Größe von " + this.coffeeSize + "ml und einer Stärke von " + this.degreeOfGrinding + " zubereitet...");
            this.waterTank.setFillLevel(this.waterTank.getFillLevel() - this.coffeeSize);
            this.beanBin.setFillLevel(this.beanBin.getFillLevel() - this.degreeOfGrinding);
            System.out.println("Produkt bitte entnehmen!");
        }

        else if (this.isSwitchedOn == false) {
            System.out.println("Das Gerät ist nicht eingeschaltet! Wie hast du das hinbekommen?");
        }

        else if (this.beanBin.getFillLevel() <= this.degreeOfGrinding) {
            System.out.println("Der Bohnenbehälter hat zu wenig Inhalt um deinen Kaffee zubereiten zu können!");
        }

        else if (this.waterTank.getFillLevel() <= this.coffeeSize) {
            System.out.println("Der Wassertank hat weniger Füllstand als dein Kaffee groß ist!");
        }

        else {
            System.out.println("Okay ich weiß nicht was du angestellt hast, aber es geht ned!");
        }
    }

    public boolean isSwitchedOn() {
        return isSwitchedOn;
    }
}
