package Collection_Map;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {

        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Green");
        map.put(2,"Yellow");
        map.put(3,"Red");
        map.put(4,"Orange");
        map.put(5,"Purple");

        for(Map.Entry i:map.entrySet())
        {
            System.out.println(i.getKey()+" : "+i.getValue());
        }
    }
}
