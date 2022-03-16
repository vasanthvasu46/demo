package String;

public class compare_methods {
    public static void main(String[] args)
    {
        Equal_method obj=new Equal_method();
        Equalto_operator obj2=new Equalto_operator();
        compareTo obj3=new compareTo();
        System.out.println(obj.compare("Vasanth","Vasanth"));
        System.out.println(obj2.compare("Vasanth","Vasanth"));
        System.out.println(obj3.compare("Vasanth","Vasanth"));
    }
}
class Equal_method
{
    String compare(String s1, String s2)
    {
        if(s1.equals(s2))
        {
            return "True";
        }
        return "False";

    }
}
class Equalto_operator
{
    String compare(String s1, String s2)
    {
        if(s1==s2)
        {
            return "True";
        }
        return "False";

    }
}
class compareTo
{
    String compare(String s1, String s2)
    {
        if(s1.compareTo(s2)==0)
        {
            return "True";
        }
        else if(s1.compareTo(s2)==1)
        {
            return "False";
        }
        return "False";

    }
}
