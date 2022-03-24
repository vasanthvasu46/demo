package Collection_Map;
import java.util.*;

enum Subjects
{
    Java,OS,ML,Python;
}

public class Enum_map {
    public static void main(String[] args) {
        EnumMap<Subjects,Integer> marks=new EnumMap<Subjects, Integer>(Subjects.class);
        marks.put(Subjects.Java,98);
        marks.put(Subjects.ML,90);
        marks.put(Subjects.OS,80);

        for(Map.Entry i:marks.entrySet())
        {
            System.out.println(i.getKey()+"  "+i.getValue());
        }
    }
}
