package Collection_Map;

import java.util.*;

public class linkedhashMap {
    public static void main(String[] args) {

        LinkedHashMap<String,Integer> map=new LinkedHashMap<>();
        map.put("INDIA      ",220);
        map.put("AUSTRALIA  ",190);
        map.put("ENGLAND    ",185);
        map.put("PAKISTAN   ",170);
        map.put("WEST_INDIES",168);

        System.out.println("Team           Score");
        for(Map.Entry i:map.entrySet())
        {
            System.out.println(i.getKey()+"     "+i.getValue());
        }
    }
}
