package Lecture_13.Lecture_13.enums;

public class IceCream {

    private String flavour;
    private IceCreamCones cone;

    public IceCream(final String flavour, final IceCreamCones cone) {
        this.flavour = flavour;
        this.cone = cone;
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "flavour = '" + flavour + '\'' +
                ", cone = " + cone +
                '}';
    }
}
