package Lecture_13.Lecture_13.generics;

public class PrintInteger {
    private Integer thingToPrint;

    public PrintInteger(Integer thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
