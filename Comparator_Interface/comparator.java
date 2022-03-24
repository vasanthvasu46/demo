package Comparator_Interface;

import java.util.*;
class Employee
{
    int id;
    String name;
    int age;

    Employee(int id,String name,int age)
    {
        this.id=id;
        this.name=name;
        this.age=age;
    }
}
class SortWithId implements Comparator
{
    public int compare(Object o1, Object o2) {

        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        if(e1.id==e2.id)
        {
            return 0;
        }
        else if(e1.id>e2.id)
        {
            return 1;
        }
        else
            return -1;
    }
}

class SortWithAge implements Comparator
{
    public int compare(Object o1, Object o2) {

        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        if(e1.age==e2.age)
        {
            return 0;
        }
        else if(e1.age>e2.age)
        {
            return 1;
        }
        else
            return -1;
    }
}
class SortByName implements Comparator
{
    public int compare(Object o1, Object o2) {

        Employee e1=(Employee)o1;
        Employee e2=(Employee)o2;
        if (e1.name == null && e2.name == null){
            return 0;
        }else if (e1.name == null){
            return -1;
        }else if (e2.name == null){
            return 1;
        }else{
            return e1.name.toUpperCase().compareTo(e2.name.toUpperCase());
        }
    }
}
public class comparator {
    public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(101,"Vasanth",22));
        list.add(new Employee(103,"Balu",30));
        list.add(new Employee(113,"Dinesh",35));
        list.add(new Employee(104,"Mohith",27));
        list.add(new Employee(106,"Prakash",23));

        System.out.println("Sorting by id:");
        Collections.sort(list,new SortWithId());
        for(Employee e:list)
        {
            System.out.println(e.id+"   "+e.name+"   "+e.age);
        }


        System.out.println("Sorting by Age:");
        Collections.sort(list,new SortWithAge());
        for(Employee e:list)
        {
            System.out.println(e.id+"   "+e.name+"   "+e.age);
        }

        System.out.println("Sorting by Name:");
        Collections.sort(list,new SortByName());
        for(Employee e:list)
        {
            System.out.println(e.id+"   "+e.name+"   "+e.age);
        }
    }
}
