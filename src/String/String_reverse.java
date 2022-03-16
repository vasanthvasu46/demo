package String;
import java.util.*;
public class String_reverse {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        String s=sc.next();
        Solution obj=new Solution();
        System.out.println(obj.reverse(s));
    }
}
class Solution{
    String reverse(String s)
    {
        String str[]=s.split("\\.");
        String rev="";
        for(int i=str.length-1;i>=0;i--)
        {
            rev += str[i];
            if(i>0){
                rev=rev+".";
            }
        }
        return rev;
    }
}
