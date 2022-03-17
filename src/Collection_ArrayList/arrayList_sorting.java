package Collection_ArrayList;

import java.util.*;

public class arrayList_sorting {


    public static void main(String[] args)
    {
        ArrayList<Integer> list= new ArrayList<Integer>();
        list.add(12);
        list.add(3);
        list.add(1);
        list.add(4);
        list.add(76);
        list.add(23);
        list.add(2);
        list.add(34);

        //Ascending order
        System.out.println("Before sorting: "+list);
        ArrayList<Integer> asc_list=ascending_order(list);
        System.out.println("After sorting in ascending order: "+asc_list);

        //Descending order
        System.out.println("Before Sorting: "+list);
        ArrayList<Integer> dsc_list=descending_order(list);
        System.out.println("After sorting in descending order: "+dsc_list);
    }

    public static ArrayList<Integer> ascending_order(ArrayList<Integer> list) {
        Collections.sort(list);
        return list;
    }

    public static ArrayList<Integer> descending_order(ArrayList<Integer> list)
    {
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }
}
