package Lecture_13.Lecture_13.generics;

public class PrintDouble {
    private Double thingToPrint;

    public PrintDouble(Double thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
