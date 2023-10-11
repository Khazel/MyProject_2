package Lecture_11.Lecture_11.exceptions;

import java.util.Scanner;

import java.io.File;
import java.io.FileNotFoundException;

public class ReadFile {

    public static void main(String[] args) {
        Scanner reader = null;
        File myFile = new File("src/exceptions/myFile222.txt");
        System.out.println(myFile.getAbsolutePath());

        try {
            reader = new Scanner(myFile);
            while (reader.hasNextLine()){
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Please provide an existing file!");
        } finally {
            System.out.println("Finally executed");
            reader.close();
//            if (reader != null) {
//                reader.close();
//            }
        }
    }
}
