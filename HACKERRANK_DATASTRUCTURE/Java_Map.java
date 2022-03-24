package HACKERRANK_DATASTRUCTURE;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Java_Map {
    public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        Map<String, Integer> map = new HashMap<>(n);
        for(int i=0; i <n; i++)
        {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            scan.nextLine();
            map.put(name, phone);
        }

        while(scan.hasNext())
        {
            String query = scan.nextLine();
            if(map.containsKey(query))
            {
                System.out.println(query + "=" + map.get(query));
                n--;
            }
            else
            {
                System.out.println("Not found");
                n--;
            }
        }
        scan.close();
    }
}
