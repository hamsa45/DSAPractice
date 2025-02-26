package Crio.dsa.LinkedList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        LinkedList<String> names = new LinkedList<>();

        list.insertFirst(12);
        list.insertFirst(12);
        list.insertFirst(42);
        list.insertFirst(72);
        list.insertFirst(2);
        list.insertFirst(1);

        list.display();
    }
}