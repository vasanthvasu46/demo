package HACKERRANK_INTRODUCTION;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Java_loopI {
    private static final Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N =scanner.nextInt();
        scanner.skip("(\rn|[\n\r\u2029\u2029\u0085])?");
        for(int i=1;i<=10;i++)
        {
            System.out.println(N+" x "+i+" = "+N*i);
        }
        bufferedReader.close();
    }
}
