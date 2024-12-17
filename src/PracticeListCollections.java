import java.util.*;
public class PracticeListCollections {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        boolean b = numbers.add(12);
        System.out.println(b);
        String s = "he is Woking ram,  ";
        System.out.println(lastWordLength(s)+" is the length of the last word.");;
    }
    static int lastWordLength(String s)
    {
        String[] parts = s.trim().split(" ");
        return parts[parts.length - 1].length();
    }
    static void ListImplementation()
    {
        List<String> strings = new ArrayList<>();
        //strings.add();
    }
}


