package Lecture_13.Lecture_13.enums;

public enum Seasons {

    WINTER(-10), SPRING(10), SUMMER(35), FALL(20);

    private Integer temp;
    private Seasons(int temp){
        this.temp = temp;
    }

    public Integer getTemp(){
        return this.temp;
    }

}
