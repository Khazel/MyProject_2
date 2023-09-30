package Lecture_8.Lecture_8.inheritance.composition;

public class Engine {
    private int pistons;
    private String fuel;
    private String driveChain;

    public int getPistons() {
        return pistons;
    }

    public void setPistons(int pistons) {
        this.pistons = pistons;
    }

    public String getFuel() {
        return fuel;
    }

    public void setFuel(String fuel) {
        this.fuel = fuel;
    }

    public String getDriveChain() {
        return driveChain;
    }

    public void setDriveChain(String driveChain) {
        this.driveChain = driveChain;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "pistons=" + pistons +
                ", fuel='" + fuel + '\'' +
                ", driveChain='" + driveChain + '\'' +
                '}';
    }
}
