package at.seya.schoolcheck.SmortLamp;

import java.util.ArrayList;
import java.util.List;

public class Lamp {
    private List<glowingFilament> glowingFilamentList;

    public Lamp() {
        this.glowingFilamentList = new ArrayList<>();
    }

    public void addFilaments(glowingFilament glowingFilamentList) {this.glowingFilamentList.add(glowingFilamentList);}

    public void turnAllOn() {
        int numberOfFilaments = this.glowingFilamentList.size();
        for (int i = 0; i < numberOfFilaments; i++) {
            if(glowingFilamentList.get(i).isStatus() == true) {
                System.out.println("Ich, " + glowingFilamentList.get(i).getFilamentName() + " bin bereits eingeschaltet!");
            }
            else {
                this.glowingFilamentList.get(i).setStatus(true);
                this.glowingFilamentList.get(i).setPowerUsage(this.glowingFilamentList.get(i).getPowerUsage() + 5);
            }


        }
    }

    public void getOverAllPowerUsage() {
        int numberOfFilaments = this.glowingFilamentList.size();
        double bigPowerNumbers = 0;
        for (int i = 0; i < numberOfFilaments; i++) {
            bigPowerNumbers = bigPowerNumbers + this.glowingFilamentList.get(i).getPowerUsage();
        }
        System.out.println("Der Gesamtstromverbrauch beträgt: " + bigPowerNumbers + "Kwh");
    }

    public void printNamesOfglowingFilaments() {
        int numberOfFilaments = this.glowingFilamentList.size();
        for (int i = 0; i < numberOfFilaments; i++) {
            System.out.println(this.glowingFilamentList.get(i).getFilamentName());
        }

    }

}
