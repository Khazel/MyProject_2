package Lecture_4.Homework_4;

public class Task_10 {

    public static void main(String[] args) {

        String input = "The quirky penguin waddled gracefully on the rocky shore.";

        String newString = input.replaceAll("[pqr]", "");

        System.out.println(newString);
    }
}
