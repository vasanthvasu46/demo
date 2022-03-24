package Comparable_Interface;



import java.util.ArrayList;

import java.util.Collections;

class Cars implements Comparable<Cars>
{
    int car_id;
    String car_name;
    int price;

    public Cars(int car_id,String car_name,int price)
    {
        this.car_id=car_id;
        this.car_name=car_name;
        this.price=price;
    }

    public String getName()
    {
        return car_name;
    }


    public int compareTo(Cars o) {
        if(this.getName()==o.getName())
        {
            return 0;
        }
        else if(this.getName().compareTo(o.getName())==1)
        {
            return 1;
        }
        else return -1;
    }


}


public class comparable_string_sorting {
    public static void main(String[] args) {
        Cars c1=new Cars('1',"D",400000);
        Cars c2=new Cars('2',"B",1000000);
        Cars c3=new Cars('3',"C",1400000);
        Cars c4=new Cars('4',"A",400000);

        ArrayList<Cars> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        Collections.sort(list);

        for(Cars o:list)
        {
            System.out.println(o.car_id+" "+o.car_name+" "+o.price);
        }
    }
}
