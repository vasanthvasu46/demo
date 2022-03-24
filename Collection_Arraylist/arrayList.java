package Collection_ArrayList;
import java.util.*;

public class arrayList {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Green");
        list.add("Red");
        list.add("Pink");
        list.add("Yellow");
        System.out.println(list);

        //addAll()
        ArrayList<String> list2 = new ArrayList<String>();
        list2.add("Purple");
        list2.add("Blue");
        list2.addAll(list);
        System.out.println(list2);

        //get()
        System.out.println(list2.get(3));

        //clear()
        list.clear();
        System.out.println("list is empty: "+list.isEmpty());

        //remove()
        list2.remove(2);
        System.out.println(list2);

        //set()
        list2.set(1,"Green");
        System.out.println(list2);

        //size()
        System.out.println("Size: "+ list2.size());
    }
}
