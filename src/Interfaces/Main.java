package Interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Car car = new Car();
        //IEngine car = new Car();
        //IMedia mediaCar = new Car(); // we call/access all the mediaCar methods that present in the Car() class.

        //car.accelerate();
        //car.applyBrake();
        //mediaCar.stop();
        //mediaCar.start();
        //System.out.println(findSmallest(1, 9, 78));
        // testArray();

//        int[][]mat = {{1,2,3},{4,5,6},{7,8,9}};
//
//        assert (diagonalSumII(mat) == 25) : "Expect 25 for mat = {{1,2,3},{4,5,6},{7,8,9}}";
//        System.out.println("All test cases in main function passed"+ diagonalSumII(mat));

//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int m = sc.nextInt();
        ArrayList<ArrayList<Integer>> M = new ArrayList<>();
        M.add(new ArrayList<>(Arrays.asList(2, 9, 3)));
        M.add(new ArrayList<>(Arrays.asList(2, 5, 4)));
        M.add(new ArrayList<>(Arrays.asList(5, 2, 8)));

//        for (int i = 0; i < n; i++) {
//            ArrayList<Integer>temp = new ArrayList<>();
//            for (int j = 0; j < m; j++) {
//                temp.add(sc.nextInt());
//            }
//            M.add(temp);
//        }


//        int result = largestForwardDiagonal(M);
//        System.out.println(result);
        printTransposeOfMatrix(M);
//        sc.close();
    }

    static void printTransposeOfMatrix(ArrayList<ArrayList<Integer>> M)
    {
        for(int i = 0 ; i < M.size() ; i++)
        {
            for(int j = 0; j < M.get(i).size(); j++)
            {
                if(i>j)
                {
                    Integer temp = M.get(i).get(j);
                    M.get(i).set(j,M.get(j).get(i));
                    M.get(j).set(i, temp);
                }
                else if( i == j) break;
            }
        }

        for(int i = 0 ; i < M.size() ; i++)
        {
            for(int j = 0; j < M.get(i).size(); j++)
            {
                System.out.print(M.get(i).get(j)+" ");
            }
            System.out.println();
        }
    }



    static int largestForwardDiagonal(ArrayList<ArrayList<Integer>>M){
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        int val = 0, key = 0;
        for(int i = 0; i< M.size(); i++)
        {
            for(int j = 0; j < M.get(i).size(); j++)
            {
                key = i-j;
                if(map.containsKey(key))
                {
                    val = map.get(key);
                    val += M.get(i).get(j);
                    System.out.println("the value of the key "+key +"- is"+ val);
                    map.replace(key,val);
                }
                else
                {
                    val = M.get(i).get(j);
                    System.out.println("the value of the key "+key +"- is"+ val);
                    map.put(key,val);
                }
            }
        }
        int ans = 0;
        for(Integer i : map.values())
        {
            System.out.println("the max value untill now is "+key +"- is"+ val);
            ans = Math.max(i,ans);
        }
        return ans;
    }

    static int diagonalSumII(int [][] mat) {
        int n = mat.length, sum = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == j) || (i + j == (n - 1))) sum += mat[i][j];
            }
        }
//        System.out.println(sum+ "-is the sum");
//        int mid = n / 2;
//        sum -= mat[mid][mid];
        return sum;
    }

    static int diagonalSum2(int [][] mat){
        int n = mat.length;
        int sum = 0;
        int temp = 0;
        while(temp < n)
        {
            sum += mat[temp][temp];
            System.out.println(sum+ "<<<<<");
            temp++;
        }
        int first = 0;
        int second = (mat.length)-1;
        while(first < n  && second>=0)
        {
            System.out.println(sum+ ">>>>"+ first+","+ second);
            sum += mat[first][second];
            first++;
            second--;
        }
        int mid =n/2 ;
        int val = mat[mid][mid];
        sum -= val;

        return sum;
    }

    static void testArray()
    {
        int[] numbers = new int[5];
        System.out.println(numbers.getClass().getName()); // Output: [I (for int array)
    }
    public static void test()
    {
        // Creating an array
        int[] arr = new int[5];
        //printArr(arr);

        // Length of an array
        System.out.println(arr.length);

        // Inserting into an array
        int[] arr1 = new int[]{4,5};
        for(int i = 0; i< arr1.length; i++)
        {
            if(i<arr.length)
            {
                arr[i] = arr1[i];
            }
            else break;
        }
    }
    public static int findSmallest(int a, int b, int c) {
        if(a == b && b==c) return a;
        if(a==b && b != c) return b > c ? c : b;
        else if(b == c && a != b) return a > b ? b : a;
        else if(a==c && a != b) return a > b ? b : a;

        if(a>b) return b>c ? c : b;
        else return a>c ? c : b;
    }
}
