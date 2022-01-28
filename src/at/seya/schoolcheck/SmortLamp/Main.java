package at.seya.schoolcheck.SmortLamp;

public class Main {
    public static void main(String[] args) {
        glowingFilament f1 = new glowingFilament("Osram", "WarmWHite", 5, false) ;
        glowingFilament f2 = new glowingFilament("Phillips", "ColdWhite", 5, false);

        Lamp l1 = new Lamp();

        l1.addFilaments(f1);
        l1.addFilaments(f2);

        f1.turnOn();

        //System.out.println(f1.isStatus());
        //System.out.println(f1.getPowerUsage());

        l1.turnAllOn();

        l1.getOverAllPowerUsage();

        l1.printNamesOfglowingFilaments();
    }
}
