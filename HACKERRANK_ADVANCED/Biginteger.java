package HACKERRANK_ADVANCED;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Biginteger {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        BigInteger b1=new BigInteger(sc.next());
        BigInteger b2=new BigInteger(sc.next());

        BigInteger add,mul;

        add=b1.add(b2);
        mul=b1.multiply(b2);

        String a1=""+add;
        String a2=""+mul;
        System.out.println(a1);
        System.out.println(a2);
    }
}

