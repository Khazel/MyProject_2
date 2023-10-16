package Lecture_13.Lecture_13.enums;

public class EnumDemo {
    public static void main(String[] args) {

        for (Seasons s : Seasons.values()) {
            System.out.println(s + " " + s.getTemp());
        }

        Seasons.SPRING.getTemp();

    }
}
