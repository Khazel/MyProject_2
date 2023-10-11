package Lecture_11.Lecture_11.exceptions;

public class FinallyDemo {
    public static void main(String[] args) {
        int[] arrA = new int[2];

        try {
            System.out.println("Access element three: " + arrA[3]);
            // throw new ArithmeticException("ArithmeticException thrown");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception throw: " + e);
            // throw new NullPointerException("NullPointer thrown");

            // System.exit(-1);
        } catch (NullPointerException e){
            System.out.println("NPE...");
        } finally {
            arrA[0] = 6;
            System.out.println("First element: " + arrA[0]);
            System.out.println("Finally statement has been executed!");
        }
        System.out.println("END of the program!");
    }
}
