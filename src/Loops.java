public class Loops {
    public static void main(String[] args) {
//        int value = nthFibonacciNumber(4);
//        System.out.println(value);
//        RepeatedNumber(7, 76478772);
//        reverseNumber(45434577);
        printArray();
    }
    
    private static void printArray(){
        int[] nums = {3,4,5,9};
        for(int i = 0; i < nums.length; i++)
        {
            System.out.print(nums[i]);
            System.out.print(" ");
        }
        for(int a:nums){
            System.out.println(a);
        }
    }
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
    private static void RepeatedNumber(int n, int number){
        int digit, occrances = 0;
        int value = number;

        while(value > 0)
        {
            digit = value%10;
            value = value/10;
            System.out.println(value + "digit is "+ digit);
            if(digit == n) occrances++;
        }
        System.out.println(occrances);
    }
    private static void reverseNumber(int number)
    {
        int value = number;
        int reversedNumber = 0;

        int digit = 0;
        while(value > 0)
        {
            digit = value%10;
            reversedNumber = reversedNumber * 10 + digit;
            value /= 10;
        }
        System.out.println(reversedNumber);
    }
    private static void reverseString()
    {}
}
