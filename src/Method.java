

import java.util.ArrayList;

public class Method {

    public static void listOfActions() {
        System.out.println("Пожалуйста, выберите действие и введите цифру:\n" +
                "1. Добавить животное\n" +
                "2. Удалить животное\n" +
                "3. Вывести список команд\n" +
                "4. Обучение новым командам");
    }

    public static void methods(ArrayList<Animal> animals) {
        Methods.listOfActions();
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        if (choice > 0 & choice < 7){
            if (choice == 1){
                AnimalList.addElementsInArray(animals);
            }
            if (choice == 2) {
                AnimalList.deleteElementsInArray(animals);
            }
            if (choice == 3){
                AnimalList.getArray(animals);
            }
            if (choice == 4){
                AnimalList.setCommands(animals);
            }
        }
        else System.out.println("Неверный ввод");
    }






}
