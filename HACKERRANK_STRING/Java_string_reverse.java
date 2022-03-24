package HACKERRANK_STRING;

import java.util.Scanner;

public class Java_string_reverse {
    public static void main(String[] args) {

        int k=0;
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        for(int i=0,j=A.length()-1;i<=j;i++,j--) {

            if(A.charAt(i)!=A.charAt(j))
            { k=1;}

        }

        System.out.println((k==0)?"Yes":"No");

    }
}
