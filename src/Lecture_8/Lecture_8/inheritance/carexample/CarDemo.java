package Lecture_8.Lecture_8.inheritance.carexample;

public class CarDemo {
    public static void main(String[] args) {
        Car mustang = new Car("Ford Mustang", "Silver", false, 20000, "Gasoline");
        CarOwner john = new CarOwner("John", 1090904578, true);
        CarSeller joe = new CarSeller("Joe", 1809126869, false);

        joe.sellCar(mustang,john);
        System.out.println(mustang);
    }
}
