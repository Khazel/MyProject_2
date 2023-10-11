package Lecture_11.Lecture_11.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) throws FileNotFoundException {
        try(FileReader fr = new FileReader("src/Lecture_11/Lecture_11/exceptions/myFile.txt")) {
            // try {
            char[] a = new char[50];
            fr.read(a); // reads the content to the array
            for (char c : a)
                System.out.print(c);  // prints the characters one by one
        } catch (IOException e) {
            // This is a bad practice. We should log the error.
//            e.printStackTrace();
            System.out.println("No such file");
        }
    }
}
