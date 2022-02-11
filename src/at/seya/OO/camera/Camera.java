package at.seya.OO.camera;

import at.seya.OO.handy.PhoneFile;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Camera {
    private int resolution;
    private int weight;
    private String colour;
    public enum imagesize {Small, Medium, Large}
    private Camera.imagesize imagesize;
    private Manufacturer manufacturer;
    private Objective objective;
    private SDCard sdCard;
    private int fileNumber;

    public Camera(int resolution, int weight, String colour, Camera.imagesize imagesize, Manufacturer manufacturer, Objective objective, SDCard sdCard) {
        this.resolution = resolution;
        this.weight = weight;
        this.colour = colour;
        this.imagesize = imagesize;
        this.manufacturer = manufacturer;
        this.objective = objective;
        this.sdCard = sdCard;
    }

    public int getResolution() {
        return resolution;
    }

    public int getWeight() {
        return weight;
    }

    public String getColour() {
        return colour;
    }

    public Camera.imagesize getImagesize() {
        return imagesize;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public Objective getObjective() {
        return objective;
    }

    public SDCard getSdCard() {
        return sdCard;
    }

    public void setSdCard(SDCard sdCard) {
        this.sdCard = sdCard;
    }

    public void takePicture() {
        int sizeInMB = 0;
        if (this.imagesize == imagesize.Large) {
            sizeInMB = 6;
        } else if (imagesize == imagesize.Medium) {
            sizeInMB = 4;
        } else if (imagesize == imagesize.Small) {
            sizeInMB = 2;
        }

        if (this.sdCard.getFreeSpace() > sizeInMB) {
            Date date = Calendar.getInstance().getTime();
            DateFormat dateFormat = new SimpleDateFormat("YYYY-MM-DD hh:mm:ss");
            String dateString = dateFormat.format(date);
            Image image = new Image("TD_Picture_" + fileNumber, dateString, this.imagesize);
            this.sdCard.saveFile(image);
            fileNumber++;


        } else {
            System.out.println("Es ist nicht genügend Speicherplatz (" + this.sdCard.getFreeSpace() + ") MB für das Bild vorhanden!");
            System.out.println("Bitte lege eine neue SD-Karte ein oder bitte lösche ein paar Bilder!");
        }

    }

    public void printAllFiles() {
        List<Image> imageList = this.sdCard.getImages();
        for (Image image:  imageList) {
            System.out.println(image.getInfo());
        }



    }

}
