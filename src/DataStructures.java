import java.util.*;

public class DataStructures {
    public static void main(String[] args) {
//        stacks();
        queues();
    }
    public  static void  stacks()
    {
        Stack<String> stringStacks = new Stack<String>();
        System.out.println(stringStacks.empty());
        stringStacks.push("manikanta");
        stringStacks.push("Minnu");
        stringStacks.push("kajal");
        stringStacks.push("tanu");
        System.out.println(stringStacks.empty() + " after adding few elemnt.");
        System.out.println(stringStacks.search("Minnu")+" is the position of abhilash.");
        System.out.println(stringStacks.peek()+ " is the first element.");
        String firstName = stringStacks.pop();
        System.out.println(stringStacks.peek()+ " is the first element now and poped element is "+ firstName);
        System.out.println(stringStacks.search("Minnu")+" is the position of abhilash.");

    }
     public  static void queues()
     {
//         Queue<String> queue_ = new LinkedList<>();
         Queue<String> queue_ = new PriorityQueue<>();
         queue_.offer("mohanKrishna");
         queue_.offer("akhil");
         queue_.offer("prudhviRaj");
         queue_.offer("dileep");
//         System.out.println("element : " + queue_.element() + ", peek : " + queue_.peek() + "element : " + queue_.element() );
//         System.out.println(queue_.stream().count());
//         queue_.clear();
         System.out.println(queue_.size());
         System.out.println(queue_.contains("mohanKrishna"));
//         String s = queue_.poll();
//         System.out.println(queue_.size() + " s value is "+s) ;
         System.out.println(queue_.offer("2"));
         System.out.println(queue_.contains("mohanKrishna"));
         while (!queue_.isEmpty())
         {
             System.out.println(queue_.poll());
         }
//         for(String str: queue_)
//         {
//             System.out.println(queue_.poll());
//         }

         Queue<Double> DoubleQueue = new PriorityQueue<>(Collections.reverseOrder());
         DoubleQueue.offer(3.5);
         DoubleQueue.offer(3.78);
         DoubleQueue.offer(2.5);
         DoubleQueue.offer(39.5);
         DoubleQueue.offer(310.56);
//         for(Double d: DoubleQueue)
//         {
//             System.out.println(DoubleQueue.poll());
//         }
         while (!DoubleQueue.isEmpty())
         {
             System.out.println(DoubleQueue.poll());
         }

//         Queue<String> queue = new Queue<String>() {
//             @Override
//             public boolean add(String s) {
//                 return false;
//             }
//
//             @Override
//             public boolean offer(String s) {
//                 return false;
//             }
//
//             @Override
//             public String remove() {
//                 return null;
//             }
//
//             @Override
//             public String poll() {
//                 return null;
//             }
//
//             @Override
//             public String element() {
//                 return null;
//             }
//
//             @Override
//             public String peek() {
//                 return null;
//             }
//
//             @Override
//             public int size() {
//                 return 0;
//             }
//
//             @Override
//             public boolean isEmpty() {
//                 return false;
//             }
//
//             @Override
//             public boolean contains(Object o) {
//                 return false;
//             }
//
//             @Override
//             public Iterator<String> iterator() {
//                 return null;
//             }
//
//             @Override
//             public Object[] toArray() {
//                 return new Object[0];
//             }
//
//             @Override
//             public <T> T[] toArray(T[] a) {
//                 return null;
//             }
//
//             @Override
//             public boolean remove(Object o) {
//                 return false;
//             }
//
//             @Override
//             public boolean containsAll(Collection<?> c) {
//                 return false;
//             }
//
//             @Override
//             public boolean addAll(Collection<? extends String> c) {
//                 return false;
//             }
//
//             @Override
//             public boolean removeAll(Collection<?> c) {
//                 return false;
//             }
//
//             @Override
//             public boolean retainAll(Collection<?> c) {
//                 return false;
//             }
//
//             @Override
//             public void clear() {
//
//             }
//         }
     }
}
