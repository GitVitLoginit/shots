package main;

import java.util.Random;

public class Beginner extends Human{

    public Beginner(String _name,int _age,int _experience)
    {
        name=_name;
        age=_age;
        experience=_experience;
        points=0;
    }

    public boolean makeShot()
    {
        int chance;
        chance=experience;
        Random randomNumber= new Random();
        return  randomNumber.nextInt(100)<chance?true:false;

    }
}
