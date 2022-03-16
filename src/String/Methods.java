package String;

import java.util.Locale;

public class Methods {
    public static void main(String[] args)
    {
        String s1="Love for all, Hatred for none.";
        String s2="Vasanth";
        String s3="How r you?";

        //subString method
        System.out.println("Substring: "+s1.substring(0,12));

        //contains method
        System.out.println("Contains: "+s1.contains("Love"));

        //concat method
        System.out.println("Concat: "+s1.concat(" Muruganandam"));

        //replace method
        String s=s3.replace("r","are");
        System.out.println("Replace: "+s);

        //to upper case method
        String str="java tutorial from banfico";
        System.out.println("Uppercase : "+str.toUpperCase());

        //to lower case method
        String str1="JAVA TUTORIAL FROM BANFICO";
        System.out.println("Lowercase : "+str.toLowerCase());
    }
}
