package main;

public abstract class Human
{
    protected String name;
    protected int age;
    protected int experience;

    public void displayInfo()
    {
        System.out.println("Name: "+name+"age: "+age+"experience: "+experience);
    }

    public abstract boolean makeShot();


}
