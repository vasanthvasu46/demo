package Collection_SET;

import java.util.*;

public class Set_methods {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<Integer>();
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);
        set.add(60);

        System.out.println(set);


        //addAll()
        Set<Integer> set2=new HashSet<Integer>();
        set2.addAll(set);
        System.out.println(set2);

        //clear()
        set2.clear();
        System.out.println(set2);

        //contains
        System.out.println(set.contains(30));
        System.out.println(set.isEmpty());

        //iterator()

        Iterator n=set.iterator();
        while(n.hasNext())
        {
            System.out.println(n.next());
        }

        //remove()
        set.remove(10);
        System.out.println(set);

        //removeAll()

        set2.addAll(set);
        set.removeAll(set2);
        System.out.println(set);
    }
}
