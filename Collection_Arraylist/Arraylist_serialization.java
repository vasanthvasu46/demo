package Collection_Arraylist;

import java.util.*;
import java.io.*;
import java.util.concurrent.atomic.AtomicBoolean;

class Employee implements Serializable
{
    int id;
    String name;
    double salary;

    Employee(int id,String name,double salary)
    {
        this.id=id;
        this.name=name;
        this.salary=salary;
    }
}

public class Arraylist_serialization {

    public static void main(String[] args) {

        int[] id=new int[]{1,2,3,4,5,6,7};
        String[] names=new String[]{"Vasanth","Mohith","Sam","Vijay","Nelson","Anirudh","Pooja"};
        double[] salary=new double[]{45000.0,45000.0,40000.0,45000.0,40000.0,10000.0,20000.0};

        ArrayList<Employee> emp_details=new ArrayList<>();
        int len=id.length;
        for(int i=0;i<len;i++)
        {
            emp_details.add(new Employee(id[i],names[i],salary[i]));
        }
        System.out.println("Record in List:");
        for(int i=0;i<emp_details.size();i++)
        {
            Employee e=emp_details.get(i);
            System.out.println(e.id+" | "+e.name+" | "+e.salary);
        }

        //serializing array

        try{
            FileOutputStream fo=new FileOutputStream("Employee_details.txt");
            ObjectOutputStream o=new ObjectOutputStream(fo);

            o.writeObject(emp_details);
            o.close();
            fo.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
