package HACKERRANK_DATASTRUCTURE;

import java.util.*;

public class Java_1D_Array_2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        scan.close();

        int[] a = new int[n];
        for(int i=0;i<=n-1;i++)
        {
            a[i]=scan.nextInt();
        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}

