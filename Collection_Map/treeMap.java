package Collection_Map;

import com.sun.source.tree.Tree;

import java.util.*;

public class treeMap {
    public static void main(String[] args) {

        Map<String,String> map=new TreeMap<>();
        map.put("Vasanth","O-");
        map.put("Ajay","A+");
        map.put("Kishore","B+");
        map.put("Kannan","O+");
        map.put("Rahul","AB-");
        map.put("Vishnu","B+");

        for(Map.Entry i:map.entrySet())
        {
            System.out.println(i.getKey()+"     "+i.getValue());
        }
    }
}
