package Lecture_8.Lecture_8.inheritance.composition;

public class Car {
    private int maxSpeed;
    private String color;
    private Engine engine;

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "maxSpeed=" + maxSpeed +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
