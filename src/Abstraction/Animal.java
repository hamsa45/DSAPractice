package Abstraction;

public abstract class Animal
{
    public void name()
    {
        System.out.println("we are in animal.");
    }

    public void MakeSound()
    {
        System.out.println("Making sound from animal class.");
    }

    public void makeSound(){
        System.out.println("In animal class.");
    }
    public static void myStaticMethod()
    {
        System.out.println("we are in static method.");
    }

    //public abstract void myStaticMethod();
}
