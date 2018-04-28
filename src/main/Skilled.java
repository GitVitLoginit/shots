package main;

import java.util.Random;

public class Skilled extends Human
{
    public Skilled(String _name,int _age,int _experience)
    {
        name=_name;
        age=_age;
        experience=_experience;
    }

    public boolean makeShot()
    {
        int chance;
        chance=(5*experience);
        Random randomNumber= new Random();
        return  randomNumber.nextInt(100)<chance?true:false;

    }
}
