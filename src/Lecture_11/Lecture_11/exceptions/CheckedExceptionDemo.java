package Lecture_11.Lecture_11.exceptions;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class CheckedExceptionDemo {
    public static void main(String[] args) {
        File myFile = new File("src/exceptions/myFile22.txt");
        Scanner reader = null;

        try {
            reader = new Scanner(myFile);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
       } catch (FileNotFoundException | ArithmeticException | IndexOutOfBoundsException exceptionName) {
            //exceptionName.printStackTrace();
            System.out.println("There is not such file: " + myFile.getName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("End of main!");
    }
}
