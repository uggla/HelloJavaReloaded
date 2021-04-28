package nene;

public abstract class Vehicle {
    private String color;
    private String brand;
    private int size;
    private String type;

    protected Vehicle(String color, String type, int size) {
        this.color = color;
        this.brand = type;
        this.size = size;
        setType();
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getType() {
        return type;
    }

    private void setType() {
        this.type = this.getClass().getName().replaceFirst("^.+\\.", "");
    }
}
