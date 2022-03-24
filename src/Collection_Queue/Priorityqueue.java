package Collection_Queue;

import java.util.*;

public class Priorityqueue {
    public static void main(String[] args) {

        PriorityQueue<String> queue=new PriorityQueue<>();
        queue.add("Black");
        queue.add("Green");
        queue.add("Red");
        queue.add("Orange");
        queue.add("Pink");

        System.out.println(queue);

        //element()
        System.out.println("Head element:"+queue.element());

        //peek()
        System.out.println("Peek element:"+queue.peek());


        //remove()
        queue.remove("Pink");
        //Iterating
        Iterator i=queue.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        System.out.println(queue);
    }
}
