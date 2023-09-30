package Lecture_8.Lecture_8.staticdemo;

public class Utils {
    static int sumArr(int[] arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum+= arr[i];
        }
        return sum;
    }
}
