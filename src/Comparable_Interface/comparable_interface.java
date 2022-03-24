package Comparable_Interface;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Car implements Comparable<Car>
{
    int car_id;
    String car_name;
    int price;

    public Car(int car_id,String car_name,int price)
    {
        this.car_id=car_id;
        this.car_name=car_name;
        this.price=price;
    }

    public int getPrice()
    {
        return price;
    }

    public int compareTo(Car o) {
        if(this.getPrice()==o.getPrice())
        {
            return 0;
        }
        else if(this.getPrice()>o.getPrice())
        {
            return 1;
        }
        else return -1;
    }
}

public class comparable_interface {
    public static void main(String[] args) {
        Car c1=new Car('1',"Swift",400000);
        Car c2=new Car('2',"BMW",100000);
        Car c3=new Car('3',"Lamborghini_Diablo.",1400000);
        Car c4=new Car('4',"Swift_2",400000);

        ArrayList<Car> list=new ArrayList<>();
        list.add(c1);
        list.add(c2);
        list.add(c3);
        list.add(c4);

        Collections.sort(list);

        for(Car o:list)
        {
            System.out.println(o.car_id+" "+o.car_name+" "+o.price);
        }
    }
}
