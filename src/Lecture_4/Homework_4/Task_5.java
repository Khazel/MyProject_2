package Lecture_4.Homework_4;

import java.util.Scanner;

public class Task_5 {

    public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);

        System.out.println("Please enter a single word");
        String input = sn.nextLine().toLowerCase();

        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (input.charAt(start) != input.charAt(end)) {
                isPalindrome = false;
            }

            start++;
            end--;
        }

        System.out.println(input + ((isPalindrome) ? " is palindrome." : " is not a palindrome."));
    }
}
