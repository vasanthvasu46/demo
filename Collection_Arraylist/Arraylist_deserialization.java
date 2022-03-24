package Collection_Arraylist;
import java.util.*;
import java.io.*;

class Employees implements Serializable
{
    int id;
    String name;
    double salary;

    Employees(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}
public class Arraylist_deserialization {
    public static void main(String[] args) {
        ArrayList<Employee> emp_details=new ArrayList<>();
        try
        {
            FileInputStream fo = new FileInputStream("Employee_details.txt");
            ObjectInputStream o = new ObjectInputStream(fo);

            emp_details = (ArrayList) o.readObject();

            o.close();
            fo.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();

        }
        catch (ClassNotFoundException c)
        {
            c.printStackTrace();

        }
        for(int i=0;i<emp_details.size();i++)
        {
            Employee e=emp_details.get(i);
            System.out.println(e.id+" | "+e.name+" | "+e.salary);
        }
    }
}
