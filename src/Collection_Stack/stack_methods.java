package Collection_Stack;

import java.util.*;

public class stack_methods {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        //empty();
        System.out.println(stack.empty());

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        for(Integer i:stack)
        {
            System.out.print(i+" ");
        }
        System.out.println();
        //pop()
        stack.pop();
        for(Integer i:stack)
        {
            System.out.print(i+" ");
        }
        System.out.println();

        //pek()
        System.out.println(stack.peek());

        System.out.println();
        //search()
        System.out.println("Location of 30: "+stack.search(30));
    }
}
