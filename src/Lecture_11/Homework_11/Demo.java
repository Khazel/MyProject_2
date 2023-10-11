package Lecture_11.Homework_11;

public class Demo {
    public static void main(String[] args) {

        String[] student_1_Files = {"File_1.java", "File_2.java", "File_3.java", "File_4.java", ""};

        String[] student_2_Files = {"File_6.txt", "File_7.java", "File_8.java", null, "File_10.png"};

        String[] student_3_Files = {"File_11.java", "File_12.java", "File_13.java", "File_14.java", null};

        Student student_1 = new Student("Student_1", student_1_Files);
        Student student_2 = new Student("Student_2", student_2_Files);
        Student student_3 = new Student("Student_3", student_3_Files);

        student_1.checkFiles();
        student_2.checkFiles();
        student_3.checkFiles();
    }
}
