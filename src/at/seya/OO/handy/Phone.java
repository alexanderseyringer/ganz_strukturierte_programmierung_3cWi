package at.seya.OO.handy;

import java.util.List;

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

    public void doCall(String number) {
        this.sim.doCall(number);
    }

    public void takePicture() {
        PhoneFile file = this.camera.takePicture();
        this.sdCard.saveFile(file);
        System.out.println("Ein Foto wurde unter dem Namen " + file.getName() + " gespeichert!");
    }

    public void printAllFiles() {
        List<PhoneFile> phoneFilesList = this.sdCard.getPhoneFiles();
        for (PhoneFile file:  phoneFilesList) {
            System.out.println(file.getInfo());
        }
    }

    public int getFreeSpace() {
        return this.sdCard.getFreeSpace();
    }
}
