package OOPs;

class Painting
{
    String color1="";
    String color2="";
    String color3="";
    String defaultf_color="Black";

    //1 parameter method
    public void setColor()
    {
        System.out.println("Default Color:"+defaultf_color);
    }

    //2 parameters method
    public void setColor(String c1, String c2)
    {
        this.color1=c1;
        this.color2=c2;
        System.out.println("Color 1:"+color1+" --- "+"Color 2:"+color2);
    }

    //3 parameters method
    public void setColor(String c1, String c2, String c3)
    {
        this.color1=c1;
        this.color2=c2;
        this.color3=c3;
        System.out.println("Color 1:"+color1+" --- "+"Color 2:"+color2+" --- "+"Color 3:"+color3);
    }
}
public class polymorphism_overloading {
    public static void main(String[] args)
    {
        Painting p=new Painting();
        p.setColor();
        p.setColor("Pink","Blue");
        p.setColor("Orange","Yellow","White");
    }
}