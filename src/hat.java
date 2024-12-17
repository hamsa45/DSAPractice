import java.util.Scanner;

public class hat
{
    public static void main(String[] args) {
        human h = new human(35);
        System.out.println(h.age);
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println("hello "+ s);

    }
}
