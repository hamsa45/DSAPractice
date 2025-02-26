package Crio.dsa.LinkedList;

public class DLL {

    private Node head;
    //private Node last;
    public void insertLast(int val)
    {
        if(head == null){
            insertFirst(val);
            //last = head;
            return;
        }
        Node node = new Node(val);
        Node last = head;

        while(last.next != null)
        {
            last = last.next;
        }
        node.next = null;
        node.prev = last;
        last.next = node;
        last = node;
    }
    public void insertFirst(int val)
    {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) head.prev = node;
        head = node;
    }
    public void display(){
        Node temp = head;
        while(temp != null)
        {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    private class Node
    {
        int value;
        Node prev;
        Node next;

        public Node(int val)
        {
            this.value = val;
        }

        public Node(int value, Node prev, Node next) {
            this.value = value;
            this.prev = prev;
            this.next = next;
        }
    }

}
