import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

//import java.lang.String;
public class stringPractice {
    public static void main(String[] args) {
        //String s = "A man, a plan, a canal: Panama";
        //int i = Integer.MAX_VALUE;
        //validPalindrome(s);
        //int[] prices = new int[]{7,1,5,3,6,4};
        //regExPrac();
        //String s = "abc", t = "ahbgdc";
        //String s = "axc", t = "ahbgdc";
        //isSubsequence(s,t);
        //buyAndSellStock(prices);
       String s = "barfoothefoobarman"; String[] words = {"foo","bar"};
       //findSubstring(s,words);

        isValid(s,words,3);
    }
    public static void lengthOfLongestSubstring(String s) {
        if(s.length() == 1) System.out.println("max length is 1.");;

        HashSet<Character> characters = new HashSet<>();
        int start = 0, maxLength = 1; // end = 1,

        String str = ""+s.charAt(start);
        for(int i = 0; i < s.length(); i++)
        {
            if(!str.contains(""+s.charAt(i)))
            {
                str = str + s.charAt(i); //String.concat(str,s.charAt(i));d
                //end = i;
                char c = 'j';
            }
            else
            {
                start = s.indexOf(s.charAt(i));
                str = s.substring(start+1,i);
                //sou
            }
            maxLength = Math.max((i-start) + 1,maxLength);
        }
    }
    static void pairWithMaxSum(List<Integer> arr) {
        // Your code goes here
        int max = Integer.MIN_VALUE;
        for(int i = 1; i < arr.size(); i++)
        {
            max = Math.max(max,(arr.get(i)+arr.get(i-1)));
        }
       // retunr max;
    }
    static void findSubstring(String s, String[] words) {
        int interval = words[0].length();
        int checkLength = words.length * interval;
        int r = checkLength;
        List<Integer> ans = new ArrayList<>();

        //ans.addFirst();
        while(r <= s.length())
        {
            String current = s.substring(r-checkLength,r);
            //if(isValid(current, words,interval)) ans.add(r-checkLength);
            r+= interval;
        }
        System.out.println(checkLength);
    }

    //private static boolean isValid(String current, String[] words, int inteval) {
     static Void isValid(String current, String[] words, int inteval) {
        // List to store all substrings of length 3
        List<String> substrings = new ArrayList<>();

        // Loop through the string and get substrings of length 3
        for (int i = 0; i <= current.length() - inteval; i++) {
            substrings.add(current.substring(i, i + inteval));
        }

        // Convert list to an array of strings
        String[] result = substrings.toArray(new String[0]);

        // Print the result
        for (String substring : result) {
            System.out.println(substring);
        }
         return null;
     }

    public static void isSubsequence(String s, String t) {
        int l = 0;
        for(int i = 0; i < t.length(); i++)
        {
            if(l==s.length()) return;
            if(s.charAt(l)==t.charAt(i))
            {
                l++;
            }
        }
        if(l==s.length()) System.out.println("Is SubSequence.");
        else System.out.println("Is Not Subsequence.");
    }

    public static void regExPrac() {
        String s = "abc"; // Characters to keep
        String t = "ahbgdc"; // Target string

        // Replace all characters in t that are NOT in s
        t = t.replaceAll("[^" + s + "]", "");  // Keeps only a, b, c

        System.out.println(t);  // Output will be "abc"
    }
    private static void buyAndSellStock(int[] arr)
    {
        int minBuy = arr[0],maxProfit = 0,cost=0;
        for(int i = 1; i< arr.length; i++)
        {
            cost = arr[i]-minBuy;
            maxProfit = Math.max(maxProfit,cost);

            minBuy = Math.min(minBuy, arr[i]);
        }
        System.out.println(maxProfit);
    }

    private static void validPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        System.out.println(s+ "---" + s.length());
        int l = 0, r = s.length()-1;
        while(l<=r)
        {
            System.out.println(s.charAt(l)+"-"+s.charAt(r));
            if(s.charAt(l)==s.charAt(r))
            {
                l++;
                r--;
            }
            else
            {
                System.out.println("Not a palindrome.");
                break;
            }
        }
        System.out.println("It's a palindrome.");
    }


}
