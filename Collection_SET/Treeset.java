package Collection_SET;

import java.util.*;

public class Treeset {
    public static void main(String[] args) {

        Set<Integer> set=new TreeSet<Integer>();

        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            int a=sc.nextInt();
            set.add(a);
        }

        //Displays list in ascending order
        System.out.println(set);

    }
}
