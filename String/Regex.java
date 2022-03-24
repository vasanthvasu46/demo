package String;
import java.util.Scanner;
import java.util.regex.*;
public class Regex {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter PAN number : ");
        String s=sc.next();
        String regex="[A-Z]{5}[0-9]{4}[A-Z]{1}";
        Pattern p= Pattern.compile(regex);
        if(s==null){
            System.out.println("Not number given");
        }
        Matcher m=p.matcher(s);
        if(m.matches()== true)
        {
            System.out.println("Valid PAN number");
        }
        else
        {
            System.out.println("Not Valid");
        }
    }
}