package at.seya.OO.handy;

import java.util.ArrayList;
import java.util.List;

public class SDCard {
    private int capacity;
    private List<PhoneFile> phoneFiles;

    public SDCard(int capacity) {
        this.capacity = capacity;
        this.phoneFiles = new ArrayList<>();
    }

    public int getCapacity() {
        return capacity;
    }

    public List<PhoneFile> getPhoneFiles() {
        return phoneFiles;
    }

    public void saveFile(PhoneFile file) {
        phoneFiles.add(file);
    }

    public int getFreeSpace() {
        int overallSpaceUsed = 0;
        int freeSpace = 0;
        for (PhoneFile phoneFile:phoneFiles) {
            overallSpaceUsed += phoneFile.getSize();
        }

        freeSpace = this.capacity - overallSpaceUsed;

        return  freeSpace;
    }
}
