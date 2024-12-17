public class recursion {
    public static void main(String[] args) {
       int value = nthFibonacciNumber(4);
        System.out.println(value);
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
}
