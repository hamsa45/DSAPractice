package Crio.dsa.LinkedList;

public class LL {

    private Node head;
    private Node tail;

    private int size = 0;

    public LL()
    {
        this.size = 0;
    }

    public void display()
    {
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void insetLast(int val)
    {
        if(tail == null) {
            insertFirst(val);
            return;
        }
        Node newNode = new Node(val);
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void delete(int index)
    {
        if(index == 0){
            head = head.next;
        }
        Node newNode = head;

        for(int i = 1; i < index; i++)
        {
            newNode = newNode.next;
        }

        newNode.next = newNode.next.next;


    }

    public void insertFirst(int val)
    {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;

        if(tail == null)
        {
            tail = newNode;
        }
        size++;
    }
    private class Node
    {
        int value;
        Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }
}
