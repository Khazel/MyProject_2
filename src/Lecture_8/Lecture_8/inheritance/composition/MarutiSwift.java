package Lecture_8.Lecture_8.inheritance.composition;

public class MarutiSwift extends Car {
    private String model;

    public MarutiSwift() {
        this.model = "Maruti Swift";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model=" + model +
                ", maxSpeed=" + getMaxSpeed() +
                ", color='" + getColor() + '\'' +
                ", engine=" + getEngine() +
                '}';
    }
}
