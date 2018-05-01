package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static ArrayList<Human> shooters = new ArrayList();

    public static void main(String[] args) {
        Beginner person1 = new Beginner("Vasya", 40, 1);
        Skilled person2 = new Skilled("Igor", 30, 6);
        Veteran person3 = new Veteran("Vlad", 20, 10);
        Skilled person4 = new Skilled("Petya", 45, 12);
        Beginner person5 = new Beginner("Egor", 34, 5);
        Skilled person6 = new Skilled("Lesha", 20, 10);
        Veteran person7 = new Veteran("Vitalya", 27, 20);

        shooters.add(person1);
        shooters.add(person2);
        shooters.add(person3);
        shooters.add(person4);
        shooters.add(person5);
        shooters.add(person6);
        shooters.add(person7);

        gameMenu();
    }

    private static void gameMenu() {
        int choice = 0;
        boolean rightInput = true;
        System.out.println("Выберите действие:\n");
        System.out.println("1 - Продолжить раунд");
        //  System.out.println("2 - Начать новый раунд досрочно");
        System.out.println("0 - Выход в меню");
        Scanner in = new Scanner(System.in);

        do {
            rightInput = true;
            try {
                choice = (in.nextInt());
            } catch (InputMismatchException e) {
                rightInput = false;
                System.out.println("Некорректный ввод");
            }

            if (rightInput)
                if (choice != 1 && choice != 0) {
                    System.out.println("Неверная цифра");
                    rightInput = false;
                }
            in.nextLine();
        } while (!rightInput);


    }
}
