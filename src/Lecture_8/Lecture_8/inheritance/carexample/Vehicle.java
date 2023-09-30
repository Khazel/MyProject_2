package Lecture_8.Lecture_8.inheritance.carexample;

public class Vehicle {
    String model;
    int maxSpeed;
    String fuel;
    String color;
    Person owner;
    boolean isSportsVehicle;
    double price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public boolean isSportsVehicle() {
        return isSportsVehicle;
    }

    public void setSportsVehicle(boolean sportsVehicle) {
        isSportsVehicle = sportsVehicle;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void addFuel() {

    }
}
