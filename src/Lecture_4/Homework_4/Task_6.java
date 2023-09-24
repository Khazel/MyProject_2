package Lecture_4.Homework_4;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task_6 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter text that includes alphanumeric characters");
        String input = sn.nextLine();

        int sum = 0;

        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            String foundNumber = matcher.group();
            int number = Integer.parseInt(foundNumber); // I am not sure if this task implies parser, but I cannot think of other way to solve it
            System.out.println(number);
            sum += number;
        }

        System.out.println("The sum of all numbers is: " + sum);
    }
}
