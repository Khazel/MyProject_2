package Lecture_8.Lecture_8.inheritance.carexample;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Car extends Vehicle {
    private int currentGear;
    private int currentSpeed;

    public Car() {
        currentSpeed = 0;
        currentGear = 1;
        owner = new Person();
    }

    public Car(String model, String color, boolean isSportsCar, double price, String fuel) {
        this();
        this.model = model;
        this.color = color;
        this.isSportsVehicle = isSportsCar;
        this.price = price;
        this.fuel = fuel;
    }

    public int getCurrentGear() {
        return currentGear;
    }

    public void setCurrentGear(int currentGear) {
        this.currentGear = currentGear;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed) {
        this.currentSpeed = currentSpeed;
    }

    public boolean isMoreExpensive(Car car) {
        if(getPrice() > car.getPrice()) {
            return true;
        } else {
            return false;
        }
    }

    public double calculateCarPriceForScrap(double metalPrice) {
        double coef = 0.2;
        if (color.equalsIgnoreCase("White") || color.equalsIgnoreCase("Black")) {
            coef = coef + 0.05;
        }
        if (isSportsVehicle) {
            coef = coef + 0.05;
        }
        return metalPrice * coef;
    }

    public void ownerInfo() {
        System.out.println("Owner name is " + getOwner().getName());
        System.out.println("Owner's age is " + getOwner().getAge());
    }

    public void accelerate() {
        if (currentSpeed < maxSpeed) {
            currentSpeed += 10;
            System.out.println(currentSpeed);
        } else {
            System.out.println("You can't accelerate further, you are already driving with " + maxSpeed + "km");
        }
    }

    public void changeGearUp() {
        if (currentGear < 5) {
            currentGear++;
            System.out.println("Your current gear is " + currentGear);
        } else {
            System.err.println("You can't switch. You are already driving with maxGear!");
        }
    }

    public void changeGearDown() {
        if (currentGear > 1) {
            currentGear--;
            System.out.println("Your current gear is " + currentGear);
        } else {
            System.err.println("You can't switch. You are already on 1st gear");
        }
    }

    public void changeGear(int nextGear) {
        if (nextGear >= 1 && nextGear <= 5) {
            currentGear = nextGear;
            System.out.println("Your current gear is " + currentGear);
        } else {
            System.err.println("You can't switch You have no such gear!");
        }
    }

    public void changeColor(String newColor) {
        if (newColor == null) {
            System.err.println("Color can't be NULL");
            return;
        }

        Pattern pattern = Pattern.compile("[A-Za-z]+");
        Matcher matcher = pattern.matcher(newColor);
        if (matcher.matches()) {
            color = newColor;
            System.out.println("Your new color is " + color);
        } else {
            System.err.println("Invalid color!");
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "currentGear=" + currentGear +
                ", currentSpeed=" + currentSpeed +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", fuel='" + fuel + '\'' +
                ", color='" + color + '\'' +
                ", owner=" + owner +
                ", isSportsVehicle=" + isSportsVehicle +
                ", price=" + price +
                '}';
    }
}
