package Lecture_13.Lecture_13.serialize;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class DemoSerialization {
	// /*- Binary
	public static void main(String[] args) {
		//
	    Student student = new Student("ComputerScience", 1, "Ivanov", "12345");
	    System.out.println(student);
	    // save object in file
	    File fw = new File("demo.dat");
	    try {
	        ObjectOutputStream ostream = new ObjectOutputStream(new FileOutputStream(fw));
	        ostream.writeObject(student);
	        ostream.close();
	    } catch (IOException e) {
	        System.err.println(e);
	    }
	    //
	    // change value of static field and nor static field
	    Student.bachelor = "Mathematic";
		student.setId(2);

		System.out.println(student);

		// Read from files
	    File fr = new File("demo.dat");
	    try {
	        ObjectInputStream istream = new ObjectInputStream(new FileInputStream(fr));
	        Student unknown = (Student) istream.readObject();
	        istream.close();
	        System.out.println("DESERIALIZATION:\n" + unknown);
	    } catch (ClassNotFoundException | IOException e) {
	        System.err.println(e.getMessage());
	    }
	    //
	}
}
