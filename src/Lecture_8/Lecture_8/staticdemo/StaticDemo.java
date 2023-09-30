package Lecture_8.Lecture_8.staticdemo;

public class StaticDemo {
    public static void main(String[] args) {
        Penguin boris = new Penguin("Boris", 3);
        Penguin kaloyan = new Penguin("Kaloyan", 10);
//        Penguin kaloyan2 = new Penguin();

        boris.displayDetails();
        kaloyan.displayDetails();

        System.out.println(boris.color);
        System.out.println(kaloyan.color);

        kaloyan.color = "Pink with green hair";

        System.out.println(boris.color);
        System.out.println(kaloyan.color);

        System.out.println(Penguin.color);

        Penguin.makeASound();


        int[] arr = {1,2,3,4,5,6,76,8990};
        System.out.println(Utils.sumArr(arr));
    }

}
