package Animal;

import java.util.ArrayList;
import java.util.Scanner;

public class AnimalList {
    public static void listOfAnimals() {
        System.out.println("Животные:\n" +
                "1. Кот\n" +
                "2. Хомяк\n" +
                "3. Собака\n" +
                "4. Осел\n" +
                "5. Лошадь\n" +
                "6. Верблюд\n");
    }

    public static void addElementsInArray(ArrayList<Animal> animals) {

        System.out.println("Выберите из списка животное, которые хотите добавить и введите его номер");
        AnimalList.listOfAnimals();
        Scanner sc = new Scanner(System.in);
        int addNumber = sc.nextInt();

        if (addNumber > 0 & addNumber < 7) {
            if (addNumber == 1) {
                System.out.print("Имя: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Команды: ");
                Scanner commandsScanner = new Scanner(System.in);
                String commands = commandsScanner.next();
                Animal newCat = new Cat(name, birthDate, commands);
                System.out.printf("\nВы добавили кота со следующими характеристиками: %s", newCat);
                animals.add(newCat);
            }
            if (addNumber == 2) {
                System.out.print("Имя: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Команды: ");
                Scanner commandsScanner = new Scanner(System.in);
                String commands = commandsScanner.next();
                Animal newHamster = new Hamster(name, birthDate, commands);
                System.out.printf("\nВы добавили хомяка со следующими характеристиками: %s", newHamster);
                animals.add(newHamster);
            }
            if (addNumber == 3) {
                System.out.print("Имя: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Команды: ");
                Scanner commandsScanner = new Scanner(System.in);
                String commands = commandsScanner.next();
                Animal newDog = new Dog(name, birthDate, commands);
                System.out.printf("\nВы добавили собаку со следующими характеристиками: %s", newDog);
                animals.add(newDog);
            }
            if (addNumber == 4) {
                System.out.print("Имя: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Команды: ");
                Scanner commandsScanner = new Scanner(System.in);
                String commands = commandsScanner.next();
                Animal newDonkey = new Donkey(name, birthDate, commands);
                System.out.printf("\nВы добавили волка со следующими характеристиками: %s", newDonkey);
                animals.add(newDonkey);
            }
            if (addNumber == 5) {
                System.out.print("Имя: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Команды: ");
                Scanner commandsScanner = new Scanner(System.in);
                String commands = commandsScanner.next();
                Animal newHorse = new Horse(name, birthDate, commands);
                System.out.printf("\nВы добавили курицу со следующими характеристиками: %s", newHorse);
                animals.add(newHorse);
            }
            if (addNumber == 6) {
                System.out.print("Имя: ");
                Scanner nameScanner = new Scanner(System.in);
                String name = nameScanner.next();
                System.out.print("Дата рождения: ");
                Scanner birthScanner = new Scanner(System.in);
                String birthDate = birthScanner.next();
                System.out.print("Команды: ");
                Scanner commandsScanner = new Scanner(System.in);
                String commands = commandsScanner.next();
                Animal newCamel = new Camel(name, birthDate, commands);
                System.out.printf("\nВы добавили аиста со следующими характеристиками: %s", newCamel);
                animals.add(newCamel);
            } else System.out.println("Такого номера нет в списке.");
        }
    }

    public static void getArray(ArrayList<Animal> animals) {

        for (int i = 0; i < animals.size(); i++) {
            System.out.printf("\n№ %s", i + 1 + " = " + animals.get(i).getClass().getSimpleName());
        }
    }

    public static void deleteElementsInArray(ArrayList<Animal> animals) {
        System.out.println("\nУкажите номер животного, которого хотите удалить: ");
        getArray(animals);
        Scanner bScanner = new Scanner(System.in);
        int delIndex = bScanner.nextInt();
        if (delIndex - 1 < animals.size()) {
            animals.remove(delIndex - 1);
            System.out.println("\nОстались следующие животные: ");
            getArray(animals);
        }
        else System.out.println("Такого номера нет в списке.");
    }

    public static StringBuilder setCommands(Scanner scanner) {
        StringBuilder commands = new StringBuilder();

        while (true) {
            System.out.print("Введите комманду -> ");
            String command = scanner.next().strip().trim();
            commands.append(command);

            System.out.print("Добавить еще команды Y/N ->");
            String choice = scanner.next().toLowerCase().trim().strip();
            if (!choice.equals("y")) {
                break;
            }
            commands.append(", ");
        }
        return commands;
    }
}
