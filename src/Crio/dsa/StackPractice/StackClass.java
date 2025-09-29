package Crio.dsa.StackPractice;

import java.util.Stack;
import java.util.concurrent.atomic.AtomicReference;

public class StackClass {
    public static void main(String[] args) {
        implementationOfStack();
    }
    public static void implementationOfStack()
    {
        Stack<Integer> stack = new Stack<>();
        System.out.println(stack.isEmpty());
        System.out.println(stack.empty());
        System.out.println(stack.size()>1);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        stack.push(35);
        System.out.println(stack);
        System.out.println("--"+stack.empty());
        System.out.println("****"+stack.size());
        System.out.println("- The index of the element 25 is, "+stack.search(25));
        System.out.println(stack.search(31));
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println("- The index of the element 25 is, "+stack.search(25));
        

    }

}
