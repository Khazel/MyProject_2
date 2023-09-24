package Lecture_2.Lecture_2;

public class WhileLoop {
    public static void main(String[] args) {
        boolean shouldContinue = true;

        while (shouldContinue) {
            System.out.println("Running");
            double random = Math.random() * 10; // 0.0 to 0.99

            if (random > 7) {
                shouldContinue = false;
            }

            System.out.println(random);
        }

        System.out.println("Out!");

        int count = 0;
        while (count < 11) {
            System.out.println(count);
            count++;
        }
    }
}
