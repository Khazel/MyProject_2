package Lecture_13.Lecture_13.streams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ReadersWritersDemo {
    public static void main(String[] args) {
        String fileName = "test.txt";
        FileWriter fw = null;
        BufferedWriter bw = null;

        FileReader fr = null;
        BufferedReader br = null;
        String data = "Some data to be written and read\r\n"; // added 13 10
        try {
            fw = new FileWriter(fileName);
            bw = new BufferedWriter(fw);
            System.out.println("Write data to file: " + fileName);
            for (int i = (int) (Math.random() * 10); --i >= 0; ) {
                bw.write(data);
            }
            bw.close();

            // *****************************
            fr = new FileReader(fileName);
            br = new BufferedReader(fr);
            String s = null;
            int count = 0;
            System.out.println("Read data from file: " + fileName);
            while ((s = br.readLine()) != null) {
                System.out.println("row " + ++count + " read:" + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
