package at.seya.OO.cars;

public class Producer {
    private String producerName;
    private String originatingCountry;
    private double discount;

    public Producer(String pruducerName, String originatingCountry, double discount) {
        this.producerName = pruducerName;
        this.originatingCountry = originatingCountry;
        this.discount = discount;
    }

    public String getPruducerName() {
        return producerName;
    }

    public String getOriginatingCountry() {
        return originatingCountry;
    }

    public double getDiscount() {
        return discount;
    }
}
