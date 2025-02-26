package Inheritance.Package2;
import Inheritance.Main.Animal;
import Inheritance.Main.Test;
import Inheritance.Package1.AnimalPackage1;

public class Main2 {
    public static void main(String[] args) {
        AnimalPackage2 a1 = new AnimalPackage2();
        AnimalPackage2 a2 = a1;
        System.out.println(a1.hashCode());
        System.out.println(a2.hashCode());

        AnimalPackage2 anm2 = new AnimalPackage2();
        Animal animal = new AnimalPackage2();
//        System.out.println("We are in PACKAGE 2.");
//        AnimalPackage1 animal1 = new AnimalPackage1();
//        AnimalPackage2 animal2 = new AnimalPackage2();
//        animal2.name2 = "Could access the animal name ";
//        animal2.display();
//        animal2.Name();
        //animal1.Name();
        Test t = new Test();
        t.go(4);
    }
}
