package Lecture_8.Homework_8;

public class Demo {

    public static void main(String[] args) {

        Person [] people = new Person[10];

        Person person_1 = new Person("Person", "One", 32, "Male");
        Person person_2 = new Person("Person", "Two", 33, "Female");
        Person person_3 = new Person("Person", "Three", 34, "Male");

        Student student_1 = new Student("Student", "One", 35, "Female", 12.0);
        Student student_2 = new Student("Student", "Two", 36, "Male", 8.16);
        Student student_3 = new Student("Student", "Three", 37, "Female", 10.23);

        Lector lector_1 = new Lector("Lector", "One", 38, "Male", 100);
        Lector lector_2 = new Lector("Lector", "Two", 26, "Female", 80.0);
        Lector lector_3 = new Lector("Lector", "Three", 64, "Male", 320.42);

        people[0] = person_1;
        people[1] = student_1;
        people[2] = lector_1;
        people[3] = lector_3;
        people[4] = person_2;
        people[6] = lector_2;
        people[7] = student_2;
        people[8] = person_3;
        people[9] = student_3;

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Student) {
                System.out.println(((Student) people[i]).showStudentInfo());
                System.out.println();
            } else if (people[i] instanceof  Lector) {
                System.out.println(((Lector) people[i]).showLectorInfo());
                System.out.println();
            } else if (people[i] instanceof Person) {
                System.out.println(people[i].showPersonInfo());
                System.out.println();
            } else {
                continue;
            }
        }

        for (int i = 0; i < people.length; i++) {
            if (people[i] instanceof Lector) {
                double overtimeAmount = ((Lector) people[i]).calculateOvertime(4);
                System.out.println(people[i].getFirstName() + " " + people[i].getLastName() + " overtime amount is " + overtimeAmount);
            }
        }
    }
}
