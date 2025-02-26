package Crio.dsa.Recursion;

import java.util.Arrays;

public class RecursionPractice {
    public static void main(String[] args) {
        int[] arr = {4,6,9,12,20,45,68,82};
        int target = 90;
        //System.out.println(searchBinarily(arr,target,0,arr.length-1));
        //System.out.println(findFibo(5));
        //System.out.println("hamsa");
        int value = 56;
        Integer integer = value;
        //System.out.println(integer);// + new ArrayList<>());
        String name = "Hamsa Abhilash ";
        System.out.println(Arrays.toString(name.split(" ")));
        System.out.println(name.strip() + name.trim());
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase()+ " "+ name.toUpperCase());
        System.out.println(name.toLowerCase().contains("hamsa"));
    }
    
    static int searchBinarily(int[] arr, int target, int s, int e)
    {
        //-------
        //base case
        if(s>e) return -1;
        //------

        int mid = s + (e-s)/2;
        if(arr[mid] == target) return mid;
        if(arr[mid] > target) return searchBinarily(arr,target,s,mid-1);
        return searchBinarily(arr,target,mid+1,e);
    }
    static int findFibo(int n){
        System.out.println("finding fibo of"+n);
        if(n<2) return n;
        return findFibo(n-1)+findFibo(n-2);
    }
}
