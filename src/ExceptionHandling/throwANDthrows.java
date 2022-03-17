package ExceptionHandling;
import java.util.*;
class AgeException extends Exception
{
    public AgeException(String msg)
    {
        super(msg);
    }
}
public class throwANDthrows {

    public static void checkAge(int age) throws AgeException
    {
        if(age>=18)
        {
            System.out.println("Valid age");
        }
        else
        {
            throw new AgeException("Invalid age. Age = "+age+", It should be greater than or equal to 18");
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
            checkAge(age);
        }
        catch (AgeException e) {
            System.out.println("Exception : "+e);
        }
    }
}
