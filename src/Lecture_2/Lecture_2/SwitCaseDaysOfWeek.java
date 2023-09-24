package Lecture_2.Lecture_2;

import java.util.Scanner;

public class SwitCaseDaysOfWeek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number [1-7]");
        int userNumber = sc.nextInt();

        switch (userNumber) {
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Wrong number [1-7]");
        }

        //reusing of code
        switch (userNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Workday!");
                break;
            case 6:
            case 7:
                System.out.println("Weekend!");
                break;
            default:
                System.out.println("Wrong number [1-7]");
        }

        //default at top
        switch (userNumber) {
            default:
                System.out.println("Wrong number [1-7]");
                break;
            case 1 :
                System.out.println("Monday");
                break;
            case 2 :
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

        // from Java 13 returning a value
        int day = switch (userNumber) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                yield 10;
            case 6:
            case 7:
                yield 15;
            default:
                yield 20;
        };

        System.out.println(day);

        // after Java 12 we can use lambda
        switch (userNumber) {
            case 1 -> {
                int a = 10;
                int b = 20;
                int sum = a + b;
                System.out.println("1");
                System.out.println(sum);
            }
            case 2 -> System.out.println("2");
            case 3 -> System.out.println("3");
            case 4 -> System.out.println("4");
            case 5 -> System.out.println("5");
            case 6 -> System.out.println("6");
            case 7 -> System.out.println("7");
            default -> System.out.println("Wrong number [1-7]");
        }
    }
}
