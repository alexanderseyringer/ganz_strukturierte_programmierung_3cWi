package at.seya.OO.camera;

import at.seya.OO.camera.Image;
import at.seya.OO.handy.PhoneFile;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<Image> Images;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.Images = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<Image> getImages() {
        return Images;
    }

    public void setImages(List<Image> images) {
        Images = images;
    }

    public void saveFile(Image image) {
        Images.add(image);
    }

    public int getFreeSpace() {
        int overallSpaceUsed = 0;
        int freeSpace = 0;
        for (Image image : Images) {
            overallSpaceUsed += image.getSizeInMB();
        }
        freeSpace = this.capacity - overallSpaceUsed;

        return freeSpace;
    }


}
