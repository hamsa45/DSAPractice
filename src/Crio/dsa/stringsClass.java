package Crio.dsa;
import java.lang.String;
import java.util.HashMap;

public class stringsClass {
    public static void main(String[] args) {
        //Different ways to initialize strings
        //ways_to_create_string();

        //practice charAt() method
//        char[] cArr = {'a','b', 'c','d','e','f','h'};
//        String str = new String(cArr);
//
//        String[] strings = {"hello", "words"};
        //System.out.println(addSpaces(strings));

//        int[] ind = new int[] { 0, 6, 9 };
//        String s = "learn by doing";
        //indexCapitalisation(s, ind);
//        CharArrayToString();
//        ReplaceCharacter();
//        String[] strs = {"flower","flow","flight"};
//        String[] strs_ = {"aaa","aa","aaa"};
//        String[] strs__ = {"flower","flower","flower","flower"};
//        System.out.println(longestCommonPrefix(strs )+ "* is the result.");

        //practice split() method.
//        splitTesting("my name is, khan");
//        reverseEachWordOfString("my name is, khan");

        //practice substring() method.
//        String str_ = "cbbd";
        //getCharacters();
        //test();
        //intToRoman(47856);
        //giveAllSubStrings(str_);
        int val = 3;
        //System.out.println(String.valueOf(val));
        //reverseWordsOfString();
        //System.out.println(lengthOfLongestSubstring("abcabcbb"));//"tmmzuxt"));
        //System.out.println(lengthOfLongestSubstring("tmmzuxt"));//"tmmzuxt"));
        System.out.println(areOccurrencesEqual("mmmccmcccccmcccccmmmcmccmmccccmmmcmmcmcmcmcmmmmmmmmmcccmmcmmmcmmcmcmcmmmcmmmcmmccccmcmccmmcmccmmmcmmccccmcmmccmcmmcccmmcmmcmmcmccmmccmcmmcmmccmmccmcccmmcccmmcccccmcmmmmcmccmmmmmmcmmccmccmmcccccccccmcccmmmccmmccccmmcmcmcmcmmcmmcmcmcmccccmmcccmmmccmmcmmmcmmmcmccccmcmcccmmccmm"));
    }

    public static boolean areOccurrencesEqual(String s) {
        if(s.length() == 1) return true;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(Character ch : s.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        Integer freq = map.get(s.charAt(0));
        boolean result = true;
        for(Character each : map.keySet())
        {
            System.out.println(each + " :- " + map.get(each) + " Map size:- " + map.size()+ "freq: "+ freq);
            if(!map.get(each).toString().equals(freq.toString())) result = false;
            //System.out.println(each + " : " + map.get(each) + " Map size: " + map.size());
        }
        return result;
    }
    public static int lengthOfLongestSubstring(String s) {
        if(s.length() <= 1) return s.length();
        int l = 0, r = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        int ans = 0;
        while(r<s.length())
        {
            if(map.containsKey(s.charAt(r)))
            {
                if((map.get(s.charAt(r)) >=l)) l = map.get(s.charAt(r))+1;
                System.out.println(s.charAt(r) + "* is present in the map at "+map.get(s.charAt(r)));
                map.replace(s.charAt(r),r);
                System.out.println(r+"is r and moved left pointer to : "+l);
            }
            else
            {
                System.out.println(s.charAt(r) + "* is not present in the map.");
                map.put(s.charAt(r),r);

                System.out.println("The longest length is :"+ ans);// is present in the map at "+map.get(s.charAt(r)));
            }
            ans = Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
    class Solution {
        public int lengthOfLongestSubstring(String s) {
            //find the substrings from largest to smallest
            // on each substring check if there are any repeating characters.
            int len = s.length(), cLen = len;
            if(len == 1) return 1;
            while(cLen > 1)
            {
                if(getLongestSubString(cLen,s) != -1)
                {
                    return cLen;
                }
                cLen--;
                if(cLen == 1) return 1;
            }
            return 0;
        }

        private static int getLongestSubString(int cLength, String s)
        {
            //aim is to find all possible substring of cLength.
            HashMap<Character,Integer> map = new HashMap<Character,Integer>();
            int l = 0, r = cLength-1;
            while(r < s.length())
            {
                String subStr = s.substring(l,r);
                boolean hasRepChars = false;
                for(int i = 0; i < cLength; i++)
                {
                    if(map.containsKey(s.charAt(i)))
                    {
                        hasRepChars = true;
                        map.clear();
                        break;
                    }
                    else
                    {
                        map.put(s.charAt(i),i);
                    }
                }
                if(!hasRepChars)
                {
                    return subStr.length();
                }
            }
            return -1;
        }
    }
    private static void reverseWordsOfString()
    {
        String s = "  hello   world example ";
        String[] strs = s.split("\\s");
        for(String each:strs)
        {
            System.out.println(each);
        }
    }

    private static void findLongestSubstringWithoutRepeatingChars(String s){
        //moving two pointer over the string and finding the max substring without repeating chars length.
        //if(s.length() <= 1) return s.length();
        int l = 0;
        HashMap<Character,Integer> map = new HashMap<Character,Integer>();
        for(int i = 0; i< s.length(); i++)
        {

        }
    }
    private static boolean giveAllSubStrings(String s)
    {
        int len = s.length();
        if(len == 0 || len == 1) return false;

        int subLen = len;
        while(subLen>1)
        {
            if(subStrings(subLen,s))
            {
                return true;
            }
            subLen--;
        }
        return false;
    }

    private static boolean subStrings(int subLen, String s) {
        int l = 0, r = subLen;
        while(r <= s.length())
        {
            String checkString = s.substring(l,r);
            //System.out.println("checking palindrome for string"+ checkString);

            int start = 0, end = subLen-1;
            while(start < end)
            {
                if(checkString.charAt(start) != checkString.charAt(end))
                {
                    //System.out.println(checkString+ "* is not palindrome string");
                    break;
                }
                else
                {
                    start++;
                    end--;
                    if(start >= end)
                    {
                        System.out.println(checkString + "*is the palindrome max length palindrome string.");
                        return true;
                    }
                }
            }

            l++;
            r++;
        }
        return false;

    }

    private static void test()
    {

        String st = "hello";
        //st.replace("\\s",st);
        String str = "hello";
        String obj = new String("hello");
        System.out.println(st.compareTo(str));
        System.out.println(st.compareTo(obj));
    }


    private static void intToRoman(int num) {
        //int multiplier = 1;
        StringBuilder result = new StringBuilder();
        StringBuilder digits = new StringBuilder();

        Integer number = num;
        String numString = number.toString();
        int digitsCount = numString.length();
        String[] values = new String[digitsCount];
        int index= 0;
        while(num > 0)
        {
            //digitsCount--;
            //System.out.println(String.valueOf((num%10) *( Math.pow(10,index))));
            values[index] = String.valueOf((num%10) *( Math.pow(10,index)));
            num/=10;
            index++;
        }

        for(int i = values.length-1; i >=0; i--)
        {
            //method(values[i]);
        }
    }

    private String getString(int digit)
    {
        switch(digit)
        {
            case 1 : return "I";
            case 4 : return "IV";
            case 5 : return "V";
            case 9 : return "IX";
            case 10 : return "X";
            case 40 : return "XL";
            case 50 : return "L";
            case 90 : return "XC";
            case 100 : return "C";
            case 400 : return "CD";
            case 500 : return "D";
            case 900 : return "CM";
            case 1000 : return "M";
            default: return "none";
        }
    }
    private static void splitTesting(String string)
    {
        String[] words = string.split("\\s");
        for(String each : words)
        {
            System.out.println(each);
        }
    }

    private static void reverseEachWordOfString(String str)
    {
        String[] words = str.split("\\s");
        StringBuilder sb = new StringBuilder("");
        for(String word : words)
        {
            sb.append(reverseString(word));
        }
        System.out.println(sb + "Reversed string is : " + reverseString(str));
        //System.out.println(sb);
    }


    private static String reverseString(String word)
    {
        int l = 0, r = word.length()-1;
        char[] chars = word.toCharArray();
        while(l<r)
        {
            char temp = chars[l];
            chars[l] = chars[r];
            chars[r] = temp;
            l++;
            r--;
        }
        String reversedString = new String(chars).concat(" ");
        return reversedString;
    }


    static String longestCommonPrefix(String[] strs) {
        if(strs.length == 0) return "";

        int minLength = 0;
        for(String s: strs)
        {
            if(s.length() == 0) return "";
            if(minLength == 0) minLength = s.length();
            else
                minLength = Math.min(s.length(),minLength);
        }
        if(minLength == 0) return "";
        int index = 0;
        for(int i = 0; i<minLength; i++)
        {
            char c = strs[0].charAt(i);
            for(String str : strs)
            {
                if(str.charAt(i) != c)
                {
                    if(i == 0) return "";
                    return str.substring(0,i);
                }
            }
        }
        return strs[0].substring(0,minLength);
    }
    public static void CharArrayToString() {
        //public static void main(String[] args) {
            // Define a char array
            char[] charArray = {'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd'};
            // Construct a string from a subset of the char array
            // Here, we start at index 6 (the space character) and use the next 5 characters
            String resultString = new String(charArray, 0, 5);
            // Output the result
            System.out.println(resultString);
        //}
    }

    public static void ReplaceCharacter() {
        //public static void main(String[] args) {
            String original = "hello";
            int index = 2; // index to replace
            char newChar = 'X'; // new character

            // Replace the character using replace()
            String modified = original.replace(original.charAt(index), newChar);

            System.out.println("Modified String: " + modified);
       // }
    }

    public static String addSpaces(String words[]) {
        if(words.length == 0) return "";
        else if(words == null) return null;

        StringBuilder sb = new StringBuilder(words[0]);
        if(words.length >= 2)
        {
            for(int i = 1; i< words.length; i++)
            {
                sb.append(" "+words[i]);
            }
        }
        return sb.toString();
        //indexCapitalisation();
    }

    static void indexCapitalisation() {
        String s = "index capitalization";
        int[] ind = {0, 6, 85};
        String sU = s.toUpperCase();
        for(int i = 0; i<ind.length; i++)
        {
            s = s.substring(0,ind[i]) + sU.charAt(ind[i]) + s.substring(ind[i]+1);
            //s.indexOf(ind[i],s) = sU.charAt(ind[i]);
        }
        System.out.println(s);
    }
    private static void printAllCharsOfString(String s) {

    }

    private static void ways_to_create_string() {

        //as String is a sequence of Characters (MOst ImpOrtant MeTHOd)
        char arr[] = {'a','b','h', 'i', 'l', 'a', 's', 'h'};
        String myName = new String(arr);
        System.out.println(myName+ "Created out of the charSequence.");

        //Now we are going to create the String using the new key word, this is important to remember.
        myName = new String("Abhilashh is his name.");
        System.out.println(myName+ "* is the complete name string.");

        //Nowwww we are going to create the dataStructure String using the literal method third most important method
        myName = "abhilash Using Literal.";
        System.out.println(myName+ "* is the complete name string.");

    }
}
