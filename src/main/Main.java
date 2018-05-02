package main;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    private static ArrayList<Human> shooters = new ArrayList();
    private static  int round = 0;
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

        playGame();
    }

    private static void playGame() {
        int choice = 0;
        Scanner in = new Scanner(System.in);
        boolean rightInput = true;

        while (choice!=3) {
            System.out.println("Выберите действие:\n");
            System.out.println("1 - Сыграть раунд");
            //  System.out.println("2 - Начать новый раунд досрочно");
            System.out.println("2 - Сбросить очки");
            System.out.println("3 - Выйти");


            do {
                rightInput = true;
                try {
                    choice = (in.nextInt());
                } catch (InputMismatchException e) {
                    rightInput = false;
                    System.out.println("Некорректный ввод");
                }

                if (rightInput)
                    if (choice != 1 && choice != 2 && choice != 3) {
                        System.out.println("Неверная цифра");
                        rightInput = false;
                    }
                in.nextLine();
            } while (!rightInput);
            if (choice == 1) {
                round = round + 1;

               // System.out.println("Раунд " + round);
                for (Human person : shooters) {

                    System.out.println("Стреляет " + person.name);
                    System.out.println("Возраст " + person.age + " лет");
                    System.out.println("Опыт " + person.experience + " лет");
                    if (person.makeShot())
                    {
                        System.out.println("Попал");
                        person.points++;
                        break;
                    } else
                    System.out.println("Не попал");
                    System.out.println();
                }
                outputPoints();

            }
            if (choice == 2) {
                nullifyPoints();
            }
        }

    }
    private static void nullifyPoints()
    {
        for (Human person : shooters) {
          person.points=0;
        }
        round=0;
        System.out.println("Очки обнулены!");

    }
    private static void outputPoints()
    {
        System.out.println("\nРезультаты "+round+" раунда:");
        int number=1;
        for (Human person : shooters) {
            System.out.println("Игрок "+number+" " +person.name+": "+person.points);
        }
    }
}
