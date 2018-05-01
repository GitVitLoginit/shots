package main;
import java.util.ArrayList;
public class Main {
    private static  ArrayList<Human> shooters = new ArrayList();
    public static void main(String[] args)
    {
        Beginner person1= new Beginner("Vasya",40,1);
        Skilled person2= new Skilled("Vasya",30,6);
        Veteran person3= new Veteran("Vasya",20,10);
        Skilled person4= new Skilled("Vasya",45,12);
        Beginner person5= new Beginner("Vasya",34,5);
        Skilled person6= new Skilled("Vasya",20,10);
        Veteran person7= new Veteran("Vasya",27,20);

        shooters.add(person1);
        shooters.add(person2);
        shooters.add(person3);
        shooters.add(person4);
        shooters.add(person5);
        shooters.add(person6);
        shooters.add(person7);
    }
    private static void gameMenu()
    {

    }
}
