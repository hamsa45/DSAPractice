import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");
//        int a = 4;
//        int b = 6;
//        int sum = a + b;
//        int diff = a - b;
//        System.out.print(sum +" is the add"+ diff +" is the diff.");

//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//        Scanner _reader = new Scanner(System.in);
//        System.out.print("Please enter a number : "+ _reader.nextInt());
        datePlay();
    }

    public static void datePlay()
    {
        System.out.println("Trying to get today time");
        LocalTime time = LocalTime.now();
        System.out.println("Time :" + time);
        LocalDate date = LocalDate.now();
        System.out.println("Today date :"+ date);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Today date :"+ date.format(formatter));
        System.out.println("Today time :"+ time.format(timeFormatter));

    }
}