package Lecture_12.Homework_12;

import java.util.*;

public class Task_2 {
    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);
        Random rn = new Random();

        List<Integer> integerList = new ArrayList<>();

        for (int i = 0; i <= 20; i++) {
            integerList.add(rn.nextInt(0, 5001));
        }

        System.out.println("Please enter your number in range between 0 and 5000");
        try {
            int userNumber = sn.nextInt();

            if (integerList.contains(userNumber)) {
                int indexOfUserNumber = integerList.indexOf(userNumber);
                System.out.println("Your number index is " + indexOfUserNumber);
            } else {
                System.out.println("Your number is not in the list.");
            }

            Iterator<Integer> iteratorMin = integerList.iterator();
            int min = iteratorMin.next();

            while (iteratorMin.hasNext()) {
                int current = iteratorMin.next();

                if (current < min) {
                    min = current;
                }
            }

            Iterator<Integer> iteratorMax = integerList.iterator();
            int max = iteratorMax.next();

            while (iteratorMax.hasNext()) {
                int current = iteratorMax.next();

                if (current > max) {
                    max = current;
                }
            }

            System.out.println("Minimum number in the list is " + min);
            System.out.println("Maximum number in the list is " + max);
            System.out.println(integerList);
        } catch (InputMismatchException e) {
            System.out.println("Your input is not an integer.");
        }
    }
}
