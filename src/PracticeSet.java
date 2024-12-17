import java.util.HashSet;
import java.util.Set;
public class PracticeSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();

        names.add("abhilash");
        String s = new String("orginal");
        names.add(s);
        names.add("hamsa");
        names.add("hamsa");
        print(names);
    }

    static void insertElements()
    {

    }

    static void print(Set<String> stringSet)
    {
        System.out.println(stringSet.toString());
    }
}
