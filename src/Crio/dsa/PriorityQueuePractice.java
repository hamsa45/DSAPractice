package Crio.dsa;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueuePractice {

    public static void main(String[] args) {
        int[] ar = new int[]{2,1,11,13,7};
        int length = ar.length;
        PriorityQueue<Integer> p = new PriorityQueue<>(length, Collections.reverseOrder());
        //addArrToQ(ar,p);
        addDiff(ar);
    }

    public static  void addArrToQ(int[] arr, PriorityQueue<Integer> p)
    {
        for(int i : arr)
        {
            p.offer(i);
        }
        int diff = p.poll() - p.poll();
        System.out.println(diff);
        System.out.println();
    }

    public static void addDiff(int[] a)
    {
        PriorityQueue<Integer> p = new PriorityQueue<>(a.length, Collections.reverseOrder());
        for (int j : a) {
            p.offer(j);
        }

        //printPQ(p);

        while(p.size() >= 2)
        {
            int diff = p.poll() - p.poll();
            System.out.println(diff+ " is the difference");
            p.offer(diff);
        }

        System.out.println(p.peek() + " is the last element.");
    }

    public static void printPQ(PriorityQueue<Integer> p)
    {
        PriorityQueue<Integer> pq = p;
        while (!pq.isEmpty()) {
            System.out.println(pq.poll());
            }
        //p.forEach(num -> System.out.println(num));
//        System.out.println("Printing Priority Queue");
//        for(Integer i : p)
//        {
//            System.out.print(p.poll());
//        }
    }
}
