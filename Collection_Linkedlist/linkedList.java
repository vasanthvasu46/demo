package Collection_Linkedlist;

import java.util.*;

public class linkedList {

    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        System.out.println(list);

        LinkedList<Integer> list2=new LinkedList<>();
        list2.add(100);
        list2.add(200);
        list2.add(300);
        list2.addAll(list);
        System.out.println(list2);

        //getFirst()

        System.out.println(list2.getFirst());

        //remove()
        list2.remove(2);
        System.out.println(list2);

        //set()
        list2.set(2,5000);
        System.out.println(list2);

        //addLast()
        list2.addLast(1000);
        System.out.println(list2);

        //addfirst
        list2.addFirst(2000);
        System.out.println(list2);

        //toArray()

        Object[] arr=list2.toArray();
        System.out.println("LinkedList to Array:");
        for(int i=0;i<arr.length;i++)
        {
            System.out.print(arr[i]+"  ");
        }
    }
}
