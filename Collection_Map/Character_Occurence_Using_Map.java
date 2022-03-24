package Collection_Map;

import java.util.*;

public class Character_Occurence_Using_Map {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string:");
        String str=sc.next();

        TreeMap<String,Integer> map=new TreeMap<>();

        String[] s=str.split("");
        for(String i:s)
        {
            String s1 = i.toLowerCase();
            if(map.containsKey(s1))
            {
                map.put(s1,map.get(s1)+1);
            }
            else
            {
                map.put(s1,1);
            }
        }

        for(Map.Entry i:map.entrySet())
        {
            System.out.println(i.getKey()+"   "+i.getValue());
        }
    }
}
