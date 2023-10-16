package Lecture_12.Lecture_12.sets;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {
        Animal cat = new Animal();
        cat.setName("Jinks");

        Animal dog = new Animal();
        dog.setName("Axel");

        Animal cat2 = new Animal();
        cat2.setName("Jinks");

        Set<Animal> animals = new HashSet<>();
        animals.add(cat);
        animals.add(dog);
        animals.add(cat2);

        System.out.println(animals);


        Set<Integer> numbers = new LinkedHashSet<>();
        numbers.add(4);
        numbers.add(1);
        numbers.add(6);
        numbers.add(11);
        numbers.add(2);
        numbers.add(7);
        numbers.add(0);
        numbers.add(11);

        numbers.remove(2); // Element = 2

        System.out.println(numbers.toString());
        System.out.println(numbers.size());
    }
}
