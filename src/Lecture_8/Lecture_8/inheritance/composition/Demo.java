package Lecture_8.Lecture_8.inheritance.composition;

public class Demo {
    public static void main(String[] args) {
        Engine engine = new Engine();
        engine.setDriveChain("Veriga");
        engine.setFuel("Benzin");
        engine.setPistons(8);

        MarutiSwift marutiSwift = new MarutiSwift();
        marutiSwift.setEngine(engine);
        System.out.println(marutiSwift);
    }
}
