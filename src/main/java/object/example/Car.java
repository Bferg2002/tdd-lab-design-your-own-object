package object.example;

public class Car {
    private String model;
    private String brand;
    private int year;
    private String color;
    private int mileage;
    private boolean isElectric;

    public Car(String model, String brand, int year, String color, int mileage, boolean isElectric) {
        this.model = model;
        this.brand = brand;
        this.year = year;
        this.color = color;
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative");
        }
        this.mileage = mileage;
        this.isElectric = isElectric;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public boolean isElectric() {
        return isElectric;
    }

    public void setElectric(boolean electric) {
        isElectric = electric;
    }

    public void drive(int milesDriven){
        setMileage(getMileage() + milesDriven);
    }

    public void displayCarInfo(){
        System.out.println("**********************");
        System.out.println("Model " + getModel());
        System.out.println("Brand " + getBrand());
        System.out.println("Year: " + getYear());
        System.out.println("Color " + getColor());
        System.out.println("Mileage " + getMileage());
        if(isElectric()) {
            System.out.println("This vehicle runs on electricity.");
        } else {
            System.out.println("This vehicle runs on gasoline.");
        }
    }
}
