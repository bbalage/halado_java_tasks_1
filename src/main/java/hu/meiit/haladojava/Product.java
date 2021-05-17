package hu.meiit.haladojava;

public class Product {
    private String name;
    private int serialNumber;

    public Product(String name, int serialNumber) {
        this.name = name;
        this.serialNumber = serialNumber;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
