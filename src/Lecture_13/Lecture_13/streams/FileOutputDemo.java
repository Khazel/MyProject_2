package Lecture_13.Lecture_13.streams;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputDemo {
    public static void main(String[] args) {
        byte[] w = {48, 49, 50, 13, 10, 49, 50, 51};
        String fileName = "test.txt";
        try (FileOutputStream outFile = new FileOutputStream(fileName)){
            System.out.println("Output file was opened.");
            outFile.write(w);
//            outFile.write("asdr"); //working only with int
//            outFile.write(24);
            outFile.write('c');
            System.out.println("Saved: " + w.length + " bytes.");
            System.out.println("Output stream was closed.");
        } catch (
                IOException e) {
            System.out.println("File Write Error: " + fileName);
        }
    }
}
