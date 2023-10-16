package Lecture_13.Lecture_13.generics;

public class PrinterGenerics <T> {
    T thingToPrint;

    public PrinterGenerics(T thingToPrint){
        this.thingToPrint = thingToPrint;
    }

    public void print(){
        System.out.println(thingToPrint);
    }
}
