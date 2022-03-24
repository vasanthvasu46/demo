package HACKERRANK_INTRODUCTION;

import java.util.Scanner;

public class If_Else {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        if(n%2==1 || (n>=6 && n <= 20)){
            System.out.println("Weird");
        }
        else{
            System.out.println("Not Weird");
        }
        scanner.close();
    }
}
