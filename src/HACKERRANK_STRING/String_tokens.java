package HACKERRANK_STRING;

import java.util.Scanner;
import java.util.StringTokenizer;

public class String_tokens {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().replaceAll("[!,?._'@\\s]+", " ");
        StringTokenizer st = new StringTokenizer(s);
        int count = st.countTokens();
        System.out.println(count);
        for (int i = 0; i < count; i++) {
            System.out.println(st.nextToken());
        }

        scan.close();
    }
}
