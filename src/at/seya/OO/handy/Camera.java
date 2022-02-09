package at.seya.OO.handy;

public class Camera {
    private int resolution;
    private int fileNumber;

    public Camera(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public PhoneFile takePicture() {
        PhoneFile file = new PhoneFile("png", 5, "TA_PICTURE" + fileNumber);
        fileNumber++;
                return file;
    }
}
