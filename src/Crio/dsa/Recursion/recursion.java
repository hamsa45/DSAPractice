package Crio.dsa.Recursion;



//Check for base case.
//Do some work
//assign tiny task forward

import java.util.List;

public class recursion {
    private static int nthFibonacciNumber(int n){
        int times = 0;
        int a= 0,b= 1;

        do {
            a = a + b;
            int temp = a;
            a = b;
            b= temp;
            //System.out.println(b);
            times++;
        }while(times < n);
        return b;
    }
    public static void printNumb(int n)
    {
        //base case
        if(n == 0)
        {
            System.out.println("Reached the dead end and returning back.");
            return;
        }

        //assign tiny work forward
        printNumb(n-1);

        //do your work
        System.out.println(n);
    }

    public static int sumOfNNaturalNumbers(int n)
    {
        if(n == 0)
        {
            System.out.println("Reached the dead end and returning back.");
            return 0;
        }
        System.out.println("working on "+ n);
        return n + sumOfNNaturalNumbers(n-1);
    }

    public static int getFactorial(int n)
    {
        if(n == 1)
        {
            System.out.println("reached end.");
            return 1;
        }
        return  n * getFactorial(n-1);
    }

    public static int fibonacci(int n)
    {
        if(n == 0 || n == 1)
        {
            return n;
        }

        int val = fibonacci(n-1) + fibonacci(n-2);
        System.out.println("Fibonacci of "+n +" is :"+val);
        return val;
    }

    public static int powerOf(int val, int pow)
    {
        if(pow == 1)
        {
            return val;
        }

        return val * powerOf(val,pow-1);
    }

    public static int powerOfOpti(int val, int pow)
    {
        if(pow == 1)
        {
            return val;
        }
        else if(pow == 0)
        {
            return 1;
        }
        if(pow % 2 == 0) return  powerOfOpti(val,pow/2) * powerOfOpti(val,pow/2);
        else return powerOfOpti(val,pow/2)*powerOfOpti(val,pow/2)* val;
    }

    public static void printSequences(int index, List<Integer> list, int[] arr)
    {
        if(index == arr.length)
        {
            System.out.println("We are reached end.");
            System.out.println(list);
            return;
        }
        list.add(arr[index]);
        printSequences(index+1,list,arr);
        list.remove(list.remove(list.size()-1));
        printSequences(index+1,list,arr);
    }
}
