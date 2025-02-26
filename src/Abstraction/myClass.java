package Abstraction;

public class myClass implements InfA
{
    int x = 5;
    public static void main(String[] args) {
        InfA infA = new myClass();
        InfB infB = new myClass();
        myClass Myclass = new myClass();
        System.out.println(Myclass.x);
        System.out.println(infB.x);
        System.out.println(infA.x);
        System.out.println(infB.myMethod());
        System.out.println(infA.myMethod());
        System.out.println(Myclass.myMethod());
    }

    @Override
    public int myMethod() {
        return x;
    }
}
