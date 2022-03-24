package Collection_Queue;

import java.util.*;

public class deque {
    public static void main(String[] args) {
        Deque<Integer> deque=new ArrayDeque<Integer>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        deque.add(6);
        deque.add(7);
        deque.add(8);

        Iterator i=deque.iterator();
        while(i.hasNext()) {
            System.out.print(i.next()+"  ");
        }

        //offer() same ass add to insert elements

        deque.offer(9);
        deque.offer(10);
        deque.offer(11);
        System.out.println("");
        for(Integer m:deque)
        {
            System.out.print(m+"  ");
        }

        //poll()

        System.out.println(deque.poll());
        System.out.println("After poll():");
        for(Integer m:deque)
        {
            System.out.print(m+"  ");
        }

        //pollLast()
        System.out.println(deque.pollLast());
        System.out.println("After pollLast():");
        for(Integer m:deque)
        {
            System.out.print(m+"  ");
        }

        //remove()
        deque.remove();
        System.out.println(deque);
    }
}
