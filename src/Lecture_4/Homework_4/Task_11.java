package Lecture_4.Homework_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_11 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter an email");
        String input = sn.nextLine();

        Pattern pattern = Pattern.compile("^(?=.{1,64}@)[A-Za-z0-9_-]+(.[A-Za-z0-9_-]+)@[^-][A-Za-z0-9-]+(.[A-Za-z0-9-]+)(.[A-Za-z]{2,})$");
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("This email has a valid format.");
        } else {
            System.out.println("This email has an invalid format.");
        }
    }
}
