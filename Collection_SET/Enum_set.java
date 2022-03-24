package Collection_SET;
import java.util.*;
enum Color
{
    GREEN,BLUE,RED,BROWN,YELLOW,PINK,PURPLE;
}
public class Enum_set {
    public static void main(String[] args) {
        Set<Color> set = EnumSet.of(Color.BLUE,Color.PURPLE,Color.GREEN);

        Iterator i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }

        //allOf() and noneOf()
        Set<Color> set1= EnumSet.allOf(Color.class);
        Set<Color> set2= EnumSet.noneOf(Color.class);

        System.out.println(set1);
        System.out.println(set2);

    }
}
