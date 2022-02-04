package at.seya.OO.handy;

public class Phone {
    private String color;
    private SIM sim;
    private Camera camera;
    private SDCard sdCard;

    public Phone(String color, SIM sim, Camera camera, SDCard sdCard) {
        this.color = color;
        this.sim = sim;
        this.camera = camera;
        this.sdCard = sdCard;
    }
}
