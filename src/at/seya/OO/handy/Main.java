package at.seya.OO.handy;

public class Main {
    public static void main(String[] args) {
        SIM a1Sim = new SIM(1, "+436673185433");

        SDCard wdSdCard = new SDCard(64000);

        Camera sonyCamera = new Camera(12);

        Phone chinaPhone = new Phone("Mystic Black", a1Sim, sonyCamera, wdSdCard);

        sonyCamera.takePicture();

        chinaPhone.doCall("+4322354654");

        chinaPhone.takePicture();
        chinaPhone.takePicture();
        chinaPhone.takePicture();
        chinaPhone.printAllFiles();

        System.out.println(chinaPhone.getFreeSpace());

    }
}
