import java.security.spec.RSAOtherPrimeInfo;
import java.util.Arrays;

public class BinarySearchPractice {
    public static void main(String[] args) {

        //int[] arr = {-5,-1,3,6,7,9,11,14,23,31,42,52};
        //int[] arr = {345,223,219,189,147,122,84,42,21,9,3,-1,-6,-8};
        int target = -56;
       //int index =  getTheIndexOf(target, arr);
       //int index =  checkforAscOrDscOrderNGetIndex(target, arr);
        //System.out.println(index);
        //int[] arrtest = {9,8,7,6,5,4,3,2,1,0};
        //int[] arrtest = {12, 35, 1, 10, 34, 1};
        //int[] arrtest = {1,2,3,4,5,6,7};
        int[] arrtest = {1,1,2,2,2,2,3};//{8,9,10,12,12,12};//{0,1,0,3,12};
        //getSecondLargest(arrtest);
        //rotate(arrtest,3);
        //moveZeroes(arrtest);
        //searchInSorted(arrtest,5,6);
//        int[] ans = plusOneToArraydigit(arrtest);
//        for(int digit: ans)
//        {
//            System.out.println(digit);
//        }
       //int num =  missingNumber(5,arrtest );
        //System.out.println(num);
        //System.out.println(count(arrtest,2));
        int[] arr = {1,1,2,3,3,4,4,8,8};//{5,1,2,3,4};//{3,4,5,1,2};//
        //searchInRotatedSortedArray(arr,0);
        //System.out.println("ans is = "+ findMin(arr));
        //System.out.println("did we submitted"+ search(arr,0));
        System.out.println(singleNonDuplicate(arr));
    }
    static public int singleNonDuplicate(int[] nums) {
        int start = 0, end = nums.length-1;
        if(nums[0] != nums[1]) return nums[0];
        else if(nums[nums.length-1] != nums[nums.length-2]) return nums[nums.length-1];
        start++; end--;
        while(start <= end)
        {
            int mid = start + (end-start)/2;
            System.out.println(start+ " is start index --"+ nums[mid]+"-mid index is "+ mid+"-"+end);
            if(nums[mid-1] != nums[mid] && nums[mid+1] != nums[mid]) return nums[mid];
            if(nums[mid] == nums[mid-1])
            {
                System.out.println(nums[mid]+ "is equals"+ nums[mid-1]+ "checking the diff mid-start"+ (mid-start));
                if((mid-start)%2 != 0) end = mid-1;
                else start = mid +1;
            }
            else
            {
                System.out.println(nums[mid]+ "is equals"+ nums[mid+1]);
                if((end-mid)%2 != 0) start = mid+1;
                else end = mid-1;
            }
        }
        return -1;
    }

    static public boolean search(int[] nums, int target) {
        int start = 0, end = nums.length -1;
        while(start <= end)
        {
            System.out.println(start + "--"+end+"start and end are "+ nums[start]+"-"+ nums[end]);
            int mid = start +(end-start)/2;
            if(nums[mid] == target) return true;
            if(nums[start]== nums[mid] && nums[end]==nums[mid])
            {
                start += 1;
                end -= 1;
            }
            else
            {
                if(nums[start] <= nums[mid])
                {
                    //left sorted
                        if(nums[start]<=target && target <= nums[mid]) end = mid-1;
                        else start = mid+1;
                }
                else
                {
                    //right sorted
                    if(nums[mid] <= target && target <= nums[end]) start = mid +1;
                    else end = mid-1;
                }
            }

        }
        return false;
    }
    static int findMin(int[] nums) {
        int start = 0, end = nums.length -1,ans = Integer.MAX_VALUE;
        while(start <= end)
        {
            System.out.println("checking for mid between "+ nums[start]+"--"+ nums[end]);
            int mid = start + (end - start)/2;
            System.out.println("value at mid is " + nums[mid]);
            ans = Math.min(nums[mid], ans);
            System.out.println("Min untill now is :"+ ans);
            if(nums[start] <= nums[mid])
            {
                if((nums[mid] - nums[start]) > nums[mid] - nums[end]) end = mid -1;
                else start = mid + 1;
//                System.out.println("we are checking for the smallest in"+nums[start] +"--"+ nums[mid]);
//                if(nums[start] < nums[mid])//(nums[start] <= ans && ans <= nums[mid])
//                {
//
//                }
//                else
//                {
//                    start = mid+1;
//                }
            }
            else
            {
                if((nums[start] - nums[mid]) > (nums[end]- nums[mid])) end = mid-1;
                else start = mid + 1;
//                if(nums[mid] <= ans && ans <= nums[end])
//                {
//                    start = mid + 1;
//                }
//                else
//                {
//                    end = mid -1;
//                }
            }
        }
        return ans;
    }
    static void searchInRotatedSortedArray(int[] arr, int target)
    {
        System.out.println("we are in rotation sorted array.");
        int s = 0, e = arr.length -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            System.out.println("Index mid is "+ mid +" --" + arr[mid]);
            if(arr[mid]==target)
            {
                System.out.println(mid + "Found the target at this index.");
            }
            //select the sorted array
            if(arr[s] <= arr[mid])
            {
                System.out.println("Array is left sorted at "+ arr[mid]);
                if(arr[s]<= target && target <= arr[mid])
                {
                    System.out.println("target lies towards left, between "+ arr[s]+ "--"+arr[mid]);
                    e = mid-1;
                }
                else //if(arr[mid] >= target && target <= arr[e])
                {
                    System.out.println("target lies towards right, between "+ arr[mid]+ "--"+arr[e]);
                    s = mid+1;
                }
            }
            else
            {
                System.out.println("Array is right sortet at"+ arr[mid]);
                if(arr[mid] <= target && target <= arr[e])
                {
                    System.out.println("target lies towards right, between "+ arr[mid]+ "--"+arr[e]);
                    s = mid+1;
                }
                else
                {
                    System.out.println("target lies towards left, between "+ arr[s]+ "--"+arr[mid]);
                    e = mid-1;
                }
            }
        }
    }
    static int count(int[] arr, int k) {
        // code here
        int s = 0, e = arr.length -1;
        while(s<=e)
        {
            int mid = s + (e-s)/2;
            System.out.println(mid + "checking for value "+ arr[mid]);
            if(arr[mid] == k)
            {
                s = e = mid;
                System.out.println(s + " is s value and e value is "+ e);
                System.out.println( mid + "found as mid and its value is "+ arr[mid]);
                while(s >= 0 && arr[s] == k)
                {
                    s--;
                }
                if(s == -1) s = 0;
                else if (arr[s] != k) s++;
                System.out.println("final s value is " + s);
                while(e < arr.length && arr[e] == k)
                {
                    e++;
                }
                if(e == arr.length) e = arr.length-1;
                else if(arr[e] != k) e--;
                System.out.println(s + " is final s value and final e value is "+ e);
                return (e-s+1);

            }
            if( arr[mid] > k) e = mid-1;
            else s = mid + 1;
        }
        return 0;
    }
    static void searchInSorted(int arr[], int N, int K) {
        System.out.println( arr.length);
        // Your code here
        int s = 0, e = arr.length-1,mid;
        while(s <= e)
        {
            mid = s + (e-s)/2;
            System.out.println(mid + "is mid.");
            if(arr[mid] == K) System.out.println("found.");;

            if(K > arr[mid]) s = mid + 1;
            else e = mid -1;
        }
        System.out.println("Not found.");
    }
    static int checkforAscOrDscOrderNGetIndex(int target, int[] arr)
    {
        int start = 0, end = arr.length-1, mid;
        boolean isAsc = arr[start] < arr[end];

        if(isAsc) System.out.println("Ascending order array.");
        else System.out.println("Isn't an ascending order array.");

        while (start <= end)
        {
            mid = start + (end-start)/2;
            if(arr[mid] == target) return mid;
            if(isAsc)
            {
                if(target > arr[mid]) start = mid + 1;
                else end = mid-1;
            }
            else
            {
                if(target > arr[mid]) end = mid-1;
                else start = mid + 1;
            }
        }
        return -1;
    }
    static int getTheIndexOf(int target, int[] arr)
    {
        int start = 0, end = arr.length-1, mid;

        while(start <= end)
        {
            mid = (start+end)/2;

            if(arr[mid] == target)
            {
                return mid;
            }
            else if(target > arr[mid])
            {
                start = (mid+1);
            }
            else
            {
                end = mid-1;
            }
        }
        return -1;
    }


    // Note that the size of the array is n-1
   static int missingNumber(int n, int arr[]) {

        int[] arr1 = new int[n+1];
       System.out.println(arr1.length);
        for(int i = 0; i < n-1; i++)
        {

            arr1[arr[i]] = arr[i];
        }

        // Your Code Here
        for(int i= 1; i < arr1.length; i++)
        {
            System.out.println("the value of array element of index  "+i+" is :-"+ arr1[i]);
            if(arr1[i] != i) return i;
        }
        return -1;
    }
    static int[] plusOneToArraydigit(int[] digits)
    {
        for(int digit = digits.length-1; digit >= 0; digit--)
        {
            if(digits[digit] != 9)
            {
                digits[digit]++;
                return digits;
            }
            digits[digit] = 0;
        }

        int[] newNumber = new int[digits.length + 1];
        newNumber[0] = 1;
        return  newNumber;
    }

    static void plusOne(int[] digits) {
        int ans = 0;

        for(int digit : digits)
        {

            ans = (ans * 10) + digit;
            System.out.println(digit + "--"+ ans);
        }
        System.out.println(ans);
        ans += 1;
        int n = (int)Math.log10((double) ans)+1;
        System.out.println(n + " is the no of digits." + ans);
        int[] nums = new int[n];
        //int i = 0;
        for(int i = n-1; i>= 0; i--)
        {
            nums[i] = ans % 10;
            System.out.println(i + "th element is "+ nums[i]);
            ans /= 10;
        }
    }

    static void getSecondLargest(int[] arr) {
        // Code Here
        int largest = 0, secondlargest = 0;
        //System.out.println("before loop.");
        for(int element : arr)
        {
            //System.out.println("Inside loop. for "+ element+ (element > largest));
            if(element > largest)
            {
                secondlargest = largest;
                largest = element;
                //System.out.println(largest + "-"+ secondlargest+ " are L and SL");
            }
            else if(element > secondlargest) secondlargest = element;
        }
        System.out.println(secondlargest == 0 ? -1: secondlargest + " is the second largest.");
        // for(int element : arr)
        // {
        //     if(element < largest && element > secondlargest) secondlargest = element;
        // }
        // return secondlargest == 0 ? -1: secondlargest;
    }

    static void moveZeroes(int[] nums)
    {
        int l = 0, r = 0;
        for(int i = 0; i < nums.length; i++)
        {
            //if nums.l is zero, move r unitill nums.r is nonZero
            if(nums[l] != 0)
            {
                l++;
                //r++;
            }
            else
            {
                if(nums[i]  != 0)
                {
                    //if nums.l is zero and nums.r is non zero, swap the elements
                    nums[l] = nums[i];
                    nums[i] = 0;
                    l++;
                }
            }


            //if l and r is non zero
        }
        System.out.println(Arrays.toString(nums));
    }
    static void rotate(int[] arr, int n) {
        // int temp;
        // for(int i = k; i > 0; i--)
        // {
        //     temp = nums[nums.length-1];
        //     for(int j = nums.length -2; j >= 0; j--)
        //     {
        //         nums[j+1] = nums[j];
        //     }
        //     nums[0] = temp;
        // }

//        int[] arr = new int[nums.length];
//        System.out.println( arr.length + " arrray size of nums is" + nums.length);
//        for(int i = 0; i < nums.length; i++)
//        {
//            int index = (i+nums.length-k);
//            if(index >= nums.length) index -= nums.length;
//            System.out.println(index + "--i value is "+ i);
//            //arr[i] = nums[index];
//        }
//        for(int j = 0; j< nums.length; j++)
//        {
//            nums[j] = arr[j];
//        }

        int temp[]=new int[n];
        for (int i = 1; i < n; i++) {
            temp[i - 1] = arr[i];
        }
        temp[n - 1] = arr[0];
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+" ");
        }
    }
}

