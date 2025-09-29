package Crio.dsa.Recursion;

import java.util.ArrayList;
import java.util.Arrays;

public class RecursionPractice {
    static ArrayList<Integer> list = new ArrayList<>();
    public static int[] nums = new int[]{1,2,3,4,5};
    public static void main(String[] args) {
        int[] arr = {4,6,9,12,20,45,45,68,82};
        int[] arr1 = {8,9,1,2,3,4,5,6,7};
        int target = 90;
        String ans = "";
        replaceChar(ans,"abhilash");
        stringSeq("","abc");
        //System.out.println(ans);
//        System.out.println(reverseInteger(1234));
//        System.out.println(reverseInteger(0,1234));
//        System.out.println(isSortedArrray(arr,0));
//        System.out.println(linearSearchArr(arr,45,0));
//        findAllIndices(arr,45,0);
//        System.out.println(list.toString());
//        System.out.println(findAllIndices(arr,95,0,new ArrayList<>()));
//        System.out.println(FindAllIndices(arr,45,0));
//        System.out.println(binarySearch(arr1,1,0,arr.length-1));
//        printTriangle(4);
//        lftTop(4,0);
//        System.out.println(Arrays.toString(arr1));
//        RotateArrRecur(arr1,0);
//        System.out.println(Arrays.toString(arr1));
//        mergeSort(arr,0, arr.length-1);
//        System.out.println(Arrays.toString(arr));
        //System.out.println(searchBinarily(arr,target,0,arr.length-1));
        //System.out.println(findFibo(5));
        //System.out.println("hamsa");
//        int value = 56;
//        Integer integer = value;
//        //System.out.println(integer);// + new ArrayList<>());
//        String name = "Hamsa Abhilash ";
//        System.out.println(Arrays.toString(name.split(" ")));
//        System.out.println(name.strip() + name.trim());
//        System.out.println(Arrays.toString(name.toCharArray()));
//        System.out.println(name.toLowerCase()+ " "+ name.toUpperCase());
//        System.out.println(name.toLowerCase().contains("hamsa"));
    }
    
    public static void stringSeq(String p, String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return;
        }
        char c = up.charAt(0);
        stringSeq(p+c, up.substring(1));
        stringSeq(p,up.substring(1));

    }
    public static void subSeq(String p, String up)
    {
        if(up.isEmpty()) return;

        char c = up.charAt(0);
        System.out.println(p);
        subSeq(p, up.substring(1));
        subSeq(p+c, up.substring(1));
    }
    public static void replaceChar(String str, int index, String ans)
    {
        if(index == str.length()) return;

        if(str.charAt(index)!='a')
            ans += str.charAt(index);
        replaceChar(str,index+1,ans);
    }

    public static void replaceChar(String ans, String given)
    {
//basecase
        if(given.length()==0){
            System.out.println(ans);
            return;
        }

        char c = given.charAt(0);
        if(c=='a')
        {
            replaceChar(ans,given.substring(1));
        }
        else
        {
            replaceChar(ans+c, given.substring(1));
        }
    }
    private static void bubbleSort(int[] arr, int l, int r)
    {
        
    }
    private static void mergeSort(int[] arr, int l, int r)
    {
        if(r==l) return;
        System.out.println(l + "----"+ r);
        int mid = l + (r-l)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }

    private static void merge(int[] arr, int l, int m, int r) {
        int left = l;
        int right = m+1;
        int index = 0;
        int[] temp = new int[r-l+1];
        while(left <= m && right <= r)
        {
            if(arr[left] <= arr[right])
            {
                 temp[index] = arr[left];
                 left++;
            }
            else
            {
                temp[index] = arr[right];
                right++;
            }
            index++;
        }
        while(left <= m)
        {
            temp[index] = arr[left];
            left++;
            index++;
        }
        while(right <= r)
        {
            temp[index] = arr[right];
            right++;
            index++;
        }
        for(int i = l; i<=r; i++)
        {
            arr[i] = temp[i-l];
        }
        System.out.println(Arrays.toString(temp));
        return;
    }
    private static void SwapingTwoDigits(int arr, int index)
    {
        //base case-----

    }
    private static void printLeftTopTriangle()
    {

    }

    private  static void printTriangle(int r)
    {
        myHelper(r,0);
    }

    private static void RotateArrRecuAC(int[] arr, int index)
    {

    }
    private static void RotateArrRecur(int[] arr, int index)
    {
        //base case
        if(index == arr.length-1) return;
        int temp = arr[index];
        arr[index] = arr[index+1];
        arr[index+1] = temp;
        RotateArrRecur(arr,index+1);
    }
    private static void myHelper(int r, int c)
    {
        if(r ==0) return;
        if(c<r)
        {
            System.out.print("*-");
            myHelper(r,c+1);
        }
        else
        {
            System.out.println();
            myHelper(r-1,0);
        }
    }

    private static void myhelper(int r, int c)
    {
        //base case----
        if(c==0)
        {
            r-=1;
            c= r;
            System.out.println();
        }
        if(r == 0)
        {
            return;
        }
        System.out.print("*-");
        myhelper(r,c-1);
    }

    private static void lftTop(int r, int c)
    {
        if(r==4) return;

        if(c<r)
        {
            System.out.print("*-");
            lftTop(r,c+1);
        }
        else
        {
            System.out.println();
            lftTop(r+1,0);
        }
    }
    private static boolean binarySearch(int[] arr, int target, int l, int r)
    {
        //base case -------
        if(l>r) return false;
        int mid = l + (r-l)/2;
        if(arr[mid]==target) return true;
        else if( arr[l] <= arr[mid])
        {
            if(arr[mid] >= target && target >= arr[l])
            {
                return binarySearch(arr,target,l,mid-1);
            }
            else {
                return binarySearch(arr,target,mid+1,r);
            }
        }
        else
        {
            if(arr[mid] <= target && arr[r] >= target){
                return binarySearch(arr,target,mid+1,r);
            }
            else
            {
                return binarySearch(arr,target,l,mid-1);
            }
        }
    }

    private static ArrayList<Integer> FindAllIndices(int[] arr, int target,int index)
    {
        //base case -----
        if(index == arr.length)
        {
            return new ArrayList<>();
        }
        ArrayList<Integer> list = FindAllIndices(arr,target,index+1);
        if(arr[index] == target)
        {
            list.addFirst(index);
        }
        return list;
    }


    private static ArrayList<Integer> findAllIndices(int[] arr, int target, int index, ArrayList<Integer> list)
    {
        //base case for func termination------
        if(index == arr.length) return list;

        if(arr[index]==target) list.add(index);
        return findAllIndices(arr,target,index+1,list);
    }
    private static void findAllIndices(int[] arr, int target,int index)
    {
        //base case---
        if(index == arr.length) return;

        if(arr[index] == target)
        {
            list.add(index);
        }
        findAllIndices(arr,target, index+1);
    }

    private static int linearSearchArr(int[] arr, int target, int index)
    {
        //base case----
        if(index == arr.length) return -1;

        if(arr[index]==target) return index;
        return linearSearchArr(arr,target,index+1);
    }

    private static boolean isSortedArrray(int[] arr, int i)
    {
        //base case-----
        if(i == arr.length-1) return true;
        return arr[i]<arr[i+1] && isSortedArrray(arr, i+1);
    }
    private static int reverseInteger(int rev,int n)
    {
        //base case -----
        if(n==0) return rev;
        return reverseInteger(rev * 10 + n%10,n/10);
    }
    private static int reverseInteger(int i) {
        System.out.println("calculating for :"+ i);
        //base case----
        if(i==0) return 0;
        int digit = i%10;
        System.out.println(digit + " is the digit.");
        return (digit*10) + reverseInteger(i/10);
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
