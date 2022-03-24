package HACKERRANK_STRING;

import java.util.Scanner;

public class Java_anagrams {
    static boolean isAnagram(String a, String b) {
        // Complete the function
        Boolean retValue = false;
        if(a != null && b != null)
        {
            char [] arrayA = a.toLowerCase().toCharArray();
            char [] arrayB = b.toLowerCase().toCharArray();
            java.util.Arrays.sort(arrayA);
            java.util.Arrays.sort(arrayB);
            retValue = java.util.Arrays.equals(arrayA, arrayB);
        }
        return retValue;
    }
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
