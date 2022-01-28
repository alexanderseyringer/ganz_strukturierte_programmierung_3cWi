package at.seya.schoolcheck.smortLamp;

public class GlowingFilament {
    private String FilamentName;
    private String FilamentColor;
    private double PowerUsage;
    private boolean Status = false;

    public GlowingFilament(String filamentName, String filamentColor, int powerUsage) {
        FilamentName = filamentName;
        FilamentColor = filamentColor;
        PowerUsage = powerUsage;
    }

    public String getFilamentName() {
        return FilamentName;
    }

    public String getFilamentColor() {
        return FilamentColor;
    }

    public double getPowerUsage() {
        return PowerUsage;
    }

    public boolean isStatus() {
        return Status;
    }

    public void setStatus(boolean status) {
        Status = status;
    }

    public void setPowerUsage(double powerUsage) {
        PowerUsage = powerUsage;
    }

    public void turnOn() {
        double newPowerUsage = 0;

            if(Status == true) {
                System.out.println("Ich, " + FilamentName + " bin bereits eingeschaltet!");
            }
            else {
                newPowerUsage = (PowerUsage + 5);
                this.PowerUsage = newPowerUsage;
                setStatus(true);
            }

    }

    public void turnOff() {
        setStatus(false);
    }
}
