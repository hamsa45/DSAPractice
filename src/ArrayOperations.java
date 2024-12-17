import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class ArrayOperations {
    public static void main(String[] args) {
        //int[] arrI =  {3,3,844,98,98,96};
        //reverseArr(arrI);
        //minValueOfArray(arrI);
        //maxValue(arrI);
        //avgOfMin_Max(arrI);
        //int[][] twoDArray = {{2,4,6,9},{54,6,234,77,99}, {64,432,123,6,439}};
        //searcingIn2DArray(twoDArray);
        //highestAccoutBalance(twoDArray);
        //NoofEvenNumbers(arrI);
        //removeDuplicates(arrI);
        //printAllSubArrays(arrI);
        //rightRotateArr(arrI);
        //rightRotateArrByN(arrI, 3);
        //rotateBySplitting(arrI, 3);
//       int [] nums1 = {1,2,3,0,0,0};
//       int[] nums2 = {2,5,6};
//       int m = 3;
//       int n = 3;
       //merge(nums1,m,nums2,n);
//        int[] prices = {7,1,5,3,6,4};
//        maxProfit(prices);

        int[] nums = {0,1,2,3,4};
        int[] index = {0,1,2,2,1};
        //searchInRotatedSortedArray(arr,0);
        //createTargetArray(nums,index);
        //numIdenticalPairs(arr1);
//        int[] arr1 = {1, 2, 3, 4, 5};
//        int[] arr2 = {1, 2, 3, 6, 7};
//        int n = 5, m = 5;
//        findUnion(arr1,arr2,n,m);
        //searchInRotatedSortedArray(arr,0);
    }


    static void createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> target = new ArrayList<>();
        for(int i = 0; i< nums.length; i++)
        {
            target.add(index[i],nums[i]);
            //target.si
            //target.set(index[i],nums[i]);
            //System.out.println(Arrays.toString(target));
        }

        //return  target;
    }
    static void numIdenticalPairs(int[] nums) {

        //time complexity less than <O(n*n)
        HashMap<Integer,Integer> map = new HashMap<>();
        for (int num : nums) {
            if (map.containsKey(num)) {
                System.out.println(num + "already contains in map.");
                int val = map.get(num);
                map.replace(num, ++val);
            } else {
                System.out.println(num + "does not exist in map.");
                map.put(num, 1);
            }
        }
        int count = 0;
        for(int value : map.values())
        {
            if(value > 1)
            {
                count += (value * (value-1)/2);
            }
        }
        System.out.println(count);
    }
    static void twoSum(int[] arr)
    {
        HashMap<Integer,Integer> indexMap = new HashMap<>();
        //approach is to find out all the possible sets
        for(int i = 0; i < arr.length; i++)
        {
            indexMap.put(arr[i],i);
            //indexMap.replace();
        }
    }
     static void findUnion(int[] arr1, int[] arr2, int n, int m)
    {
        ArrayList<Integer> ans = new ArrayList<>(5);
        int i = 0, j = 0;//,index = 0;
        if(arr1[0] <= arr2[0]) ans.add(arr1[0]);
        else ans.add(arr2[0]);
        while(i < n && j < m)
        {
            if(arr1[i] == arr2[j])
            {
                //ans.add(arr1[i++]);
                if(arr1[i] >ans.get(ans.size()-1)) ans.add(arr1[i++]);
                else i++;
                j++;
            } else if(arr1[i] < arr2[j]) {
                //ans.add(arr1[i++]);
                if(arr1[i] >ans.get(ans.size()-1)) ans.add(arr1[i++]);
                else i++;
            }
            else{
                //ans.add(arr1[j++]);
                if(arr2[j] >ans.get(ans.size()-1)) ans.add(arr2[j++]);
                else j++;
            }
        }
        while (i<n)
        {
            if(arr1[i] > ans.get(ans.size()-1))
            {
                //ans.add(arr1[i++]);
                if(arr1[i] >ans.get(ans.size()-1)) ans.add(arr1[i++]);
                else i++;
            }
            else i++;
        }
        while (j<m)
        {
            if(arr2[j] > ans.get(ans.size()-1))
            {
                //ans.add(arr2[j++]);
                if(arr2[j] >ans.get(ans.size()-1)) ans.add(arr2[j++]);
                else j++;
            }
            else j++;
        }
        List<Boolean> result = new ArrayList<Boolean>(10);
        //result.add()
        System.out.println(ans.toString());
    }
    static void maxProfit(int[] prices) {
        int ans = 0;
        for(int i = 0; i< prices.length; i++){
            for(int j = i+1; j < prices.length; j++)
            {
                int diff = prices[i]- prices[j];
                System.out.println(diff);
                ans = Math.max(ans, diff);
            }
        }
        System.out.println(ans);
    }
    static void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] ans = new int[m+n];
        int count = 0;
        int i = 0, j = 0;
        while(count < (m+n) )
        {
            System.out.println(count+ "-"+ i + j);
            if(i<m && j <n)
            {
                if(nums1[i] == nums2[j]){
                    ans[count] = nums1[i];
                    count++;
                    ans[count]= nums2[j];
                    i++;
                    j++;
                } else if(nums1[i] < nums2[j]) {
                    ans[count] = nums1[i];
                    i++;
                }
                else{
                    ans[count] = nums2[j];
                    j++;
                }
            }
            else
            {
                if(i==m)
                {
                    for(int k = j; k< n; k++)
                    {
                        ans[count] = nums2[k];
                        count++;
                    }
                }
                else if(j == n)
                {
                    for(int l = i; l< m; l++)
                    {
                        ans[count] = nums1[l];
                        count++;
                    }
                }
            }
            count++;
        }
        System.out.println(Arrays.toString(ans));
        for(int k = 0; k < m+n; k++)
        {
            nums1[k] = ans[k];
        }
        System.out.println(Arrays.toString(nums1));
    }
    private static void rotateBySplitting(int[] arr, int k)
    {
        int[] firstKEle = new int[k];
        for(int i = 0; i<k; i++)
        {
            firstKEle[i] = arr[i];
        }
        System.out.println(Arrays.toString(firstKEle));
        for(int j = k; j < arr.length; j++)
        {
            arr[j-k] = arr[j];
        }
        System.out.println(Arrays.toString(arr));
//        int l = 0, r = firstKEle.length-1;
//        while(l<r)
//        {
//            int temp = firstKEle[l];
//            firstKEle[l] = firstKEle[r];
//            firstKEle[r] = temp;
//            l++;
//            r--;
//        }
//        System.out.println(Arrays.toString(firstKEle));
        int index = k-1;
        for(int x = arr.length-1; x >= (arr.length - k); x--)
        {
            arr[x] = firstKEle[index];
            index--;
        }
        System.out.println(Arrays.toString(arr));
    }

    public void firstMissingPositive(int[] nums) {
        int n = 0, sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                n = (nums[i] > n) ? nums[i] : n;
                //n = Math.max(nums[i] , n);
                sum += nums[i];
                System.out.println("Largest num is" + n + " sum is : " + sum);
            }
        }
        int total = (n * (n + 1)/2);
        total-=sum;
        System.out.println(" result is :"+ total);
    }

    private static void rightRotateArrByN(int[] arr, int n)
    {
        for( int i = 0; i< n; i++)
        {
            rightRotateArr(arr);
        }
    }
    private static  void rightRotateArr(int[] arr)
    {
        int first = arr[arr.length-1];
        for(int i = arr.length-1; i >0; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[0] = first;
        System.out.println(Arrays.toString(arr));
    }
    private static void printAllSubArrays(int[] arr)
    {
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = i; j < arr.length; j++)
            {
                if(j==i) System.out.print("(");
                System.out.print(arr[j]+ ",");
                if(j == arr.length-1) System.out.print(")");
            }
            System.out.println();
        }
    }
    private static void highestAccoutBalance(int[][] twoDArray) {
        int ans = Integer.MAX_VALUE;
        for(int[] arr : twoDArray)
        {
            int sum = 0;
            for(int i : arr)
            {
                sum += i;
            }
            if(ans > sum) ans = sum;
        }
        System.out.println(ans + " is the highest account balance.");
    }

    static void reverseArr(int[] arr)
    {
        int r = arr.length-1, l = 0;
        while(r>l)
        {
            int temp = arr[l];
            arr[l] = arr[r];
            arr[r] = temp;
            l++;
            r--;
        }
        System.out.println(Arrays.toString(arr));
    }
    static void minValueOfArray(int[] arr)
    {
        //let's assume that it is  not an empty array
        int min = Integer.MAX_VALUE;
        for(int i : arr)
        {
            //System.out.println(i);
            if(i<= min)
                min = i;
        }
        System.out.println(min);
    }

    static void maxValue(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int i : arr)
        {
            if(i>= max)
                max = i;
        }
        System.out.println(max + " is the maximum value of the given array.");
    }

    static void avgOfMin_Max(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i : arr)
        {
            if(i<= min) min = i;
            if(i>= max) max = i;
        }
        System.out.println("Average of the two numbers"+ min +"and "+ max+" is : "+ (min+max)*(0.5));
    }

    static void searcingIn2DArray(int[][] arr)
    {
        int max = Integer.MIN_VALUE;
        for(int[] arrO : arr)
        {
            for(int element : arrO)
            {
                if(element >= max) max = element;
            }
        }
        System.out.println(max + " is the max value of the given 2D array.");
    }

    static void NoofEvenNumbers(int[] arr)
    {
        int count = 0;
        for(int num : arr)
        {
            if(even(num))
            {
                count++;
                System.out.println(num);
            }
        }
        System.out.println(count + " is the number of even digit numbers present in the given integer array.");
    }

    static boolean even(int number)
    {
        int count = 0;
        while(number>0)
        {
            number /= 10;
            count++;
        }
        return (count%2) == 0;
    }
    static int removeDuplicates(int[] nums) {
        int count = 0, current = 101,lastIndex = 0;
        boolean isFirstInt = true;
        for(int i = 0; i< nums.length; i++)
        {
            if(nums[i] != current)
            {
                //update the current
                //increase the count
                //store the value in the lastIndex+1 and update the last index;
                count++;
                nums[lastIndex] = nums[i];
                lastIndex++;
                current = nums[i];
            }
        }
        System.out.println(count + "--"+ Arrays.toString(nums));
        return count;
    }

}
