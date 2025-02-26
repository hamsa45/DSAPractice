package Crio.dsa.Recursion;

public class Main {
    public static void main(String[] args) {
        System.out.println("Attempting to print 5 numbers.");
        recursion.printNumb(5);
        int n = 10;
        System.out.println("Sum of "+ n + "is :"+ recursion.sumOfNNaturalNumbers(n));
        System.out.println("factorial of of "+ n + "is :"+ recursion.getFactorial(3));
        System.out.println("fibonaci of of "+ 5 + "is :"+ recursion.fibonacci(5));
        System.out.println("Power of of "+ 10+" 5 times " + "is :"+ recursion.powerOfOpti(10,8));
    }
}
