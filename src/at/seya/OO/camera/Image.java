package at.seya.OO.camera;

public class Image {
    private String name;
    private String date;
    private int sizeInMB;
    private Camera.imagesize imagesize;

    public Image(String name, String date, Camera.imagesize imagesize) {
        this.name = name;
        this.date = date;
        this.imagesize = imagesize;
        if (imagesize == Camera.imagesize.Large) {
            this.sizeInMB = 6;
        } else if (imagesize == Camera.imagesize.Medium) {
            this.sizeInMB = 4;
        } else if (imagesize == Camera.imagesize.Small) {
            this.sizeInMB = 2;
        }

    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public int getSizeInMB() {
        return sizeInMB;
    }

    public Camera.imagesize getImagesize() {
        return imagesize;
    }

    public String getInfo() {
        return this.name + ":" + this.imagesize;
    }
}
