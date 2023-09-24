package Lecture_2.Lecture_2;

public class NestedLoops {

    public static void main(String[] args) {
        int a = 1;
        //int b = 1;
        // What is wrong. Find the bug!
        while (a < 10 ) {
            int b = 1; // b should be initialized inside this loop
            while (b < 10) {
                System.out.println(a + " " + b);
                b++;
            }
            a++;
        }

        // 11
        // 99
        System.out.println("------------------------");

        for (int aa = 1; aa < 10; aa++) {
            for (int bb = 1; bb < 10; bb++) {
                System.out.println(aa + " " + bb);
                // break stops the inner loop only
//                if (bb == 3){
//                    break;
//                }
            }
        }

        System.out.println("------------------------");
        //int aa = 1;  // allowed because previous aa is only for the loop scope
        for (int aa = 0, bb = 10; aa <= bb; aa++, bb--){
            if (aa == 2 || aa == 4){
                continue;
            }
            System.out.println(aa + " " + bb);

//            if (aa == 3){
//                break;
//            }
        }
    }
}
