package Abstraction;

public class Cow extends Animal{
    public void Bark()
    {
        System.out.println("sorry i cannot bark i am cow.");
    }
   // @Override
    public void MakeSound()
    {
        System.out.println("overridden method cow class.");
    }

    //@Override
    public void makeSound() {
        System.out.println("in cow class");
    }


//    @Override
//    public void myStaticMethod()
//    {
//        System.out.println(" in cow, trying to override static method.");
//    }
}
