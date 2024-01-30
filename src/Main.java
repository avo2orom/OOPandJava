package Animal;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Animal> animals = new ArrayList<>();
        Animal animal1 = new Cat("Barsik","2023-05-25","Sit");
        Animal animal2 = new Dog("Oskar","2022-01-02","Roll");
        animals.add(animal1);
        animals.add(animal2);

    }
    }
