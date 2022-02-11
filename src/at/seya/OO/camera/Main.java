package at.seya.OO.camera;

public class Main {
    public static void main(String[] args) {
        SDCard wdSDCard = new SDCard(64000);
        Objective canonEF200 = new Objective("Canon", 200);
        Manufacturer canon = new Manufacturer("Canon", "Japan");
        Camera canonMARK2 = new Camera(50, 15, "Absolute Black", Camera.imagesize.Large, canon, canonEF200, wdSDCard);

        canonMARK2.takePicture();
        canonMARK2.printAllFiles();
        System.out.println(wdSDCard.getFreeSpace());
    }
}
