package at.seya.schoolcheck.smortLamp;

public class Main {
    public static void main(String[] args) {
        GlowingFilament f1 = new GlowingFilament("Osram", "WarmWHite", 5, false) ;
        GlowingFilament f2 = new GlowingFilament("Phillips", "ColdWhite", 5, false);

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
