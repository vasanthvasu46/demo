package HACKERRANK_STRING;

import java.util.Scanner;

class MyRegex{

    String acceptable = "(\\d{1,2}|[01]\\d{2}|2[0-4]\\d|25[0-5])";
    public String pattern = acceptable + "." + acceptable + "." + acceptable + "." + acceptable;
}

public class Java_Regex {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}
