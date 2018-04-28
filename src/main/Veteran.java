package main;

import java.util.Random;

public class Veteran extends Human
{
    public Veteran(String _name,int _age,int _experience)
    {
        name=_name;
        age=_age;
        experience=_experience;
    }

    public boolean makeShot()
    {
        int chance;
        chance=90-age;
        Random randomNumber= new Random();
        return  randomNumber.nextInt(100)<chance?true:false;

    }
}
