package Crio.dsa;
import java.lang.String;

public class stringsClass {
    public static void main(String[] args) {
        ways_to_create_string();
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
