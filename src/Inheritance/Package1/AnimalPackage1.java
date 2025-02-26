package Inheritance.Package1;
import Inheritance.Main.Animal;
import java.security.MessageDigest;

public class AnimalPackage1 extends Animal {
    boolean isAnimal = false;
    public AnimalPackage1()
    {

    }

    public AnimalPackage1(boolean b)
    {
        this();
    }

    public void name()
    {
        //this();
        //super("asdf");
        System.out.println("adfsdf");
        this.isAnimal = false;
    }
}
