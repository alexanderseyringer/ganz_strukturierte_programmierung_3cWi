package at.seya.OO.handy;

public class PhoneFile{
    private String dataType;
    private int size;
    private String name;

    public PhoneFile(String dataType, int size, String name) {
        this.dataType = dataType;
        this.size = size;
        this.name = name;
    }

    public String getDataType() {
        return dataType;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
