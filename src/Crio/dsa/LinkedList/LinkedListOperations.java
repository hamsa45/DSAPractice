package Crio.dsa.LinkedList;

import java.util.LinkedList;

public final class LinkedListOperations {

    LinkedList<String> stringLinkedList;
    public LinkedListOperations()
    {
        stringLinkedList = new LinkedList<String>();
    }
    public static void ll_AddMethod()
    {
        LinkedList<String> stringLinkedList = new LinkedList<>();

        stringLinkedList.add("I ");
        stringLinkedList.add(2,"am ");
        stringLinkedList.add("abhilash ");
        stringLinkedList.add("Creator ");
        stringLinkedList.add("of ");
        stringLinkedList.add("this ");
        stringLinkedList.add("LL reference ");
        stringLinkedList.add("Variable.");

        System.out.println(stringLinkedList);
    }

    public void addAtIndex(int index, String s)
    {
        stringLinkedList.add(index, s);
    }

    public void addAtFirst(String s)
    {
        stringLinkedList.addFirst(s);
    }

    public void addLast(String s)
    {
        stringLinkedList.addLast(s);
    }

    public LinkedList<String> getStringLinkedList() {
        return stringLinkedList;
    }
}
