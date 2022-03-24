package Collection_Map;

import java.util.*;

import static Collection_Map.Exam_Result.*;


class pass_check
{

    private static final Map<String,String> map=new HashMap<>();
    static{
        map.put("vasanth","vasanth");
        map.put("mohith","mohith");
        map.put("vijay","vijay");
        map.put("murugan","murugan");
    }


    public boolean check_password(String u,String p)
    {
        for(Map.Entry i: map.entrySet())
        {
            if(u.equals(i.getKey()) && p.equals(i.getValue()))
            {
                return true;
            }
        }
        return false;
    }
}

class Exam_Result
{
     private int Java;
     private int Operating_Systems;
     private int Machine_Learning;

     Exam_Result(int j, int os, int ml)
     {
         this.Java=j;
         this.Operating_Systems=os;
         this.Machine_Learning=ml;
     }

     private static HashMap<String,Exam_Result> mark=new HashMap<>();
     static
     {
         mark.put("vasanth",new Exam_Result(90,85,85));
         mark.put("mohith",new Exam_Result(80,85,95));
         mark.put("vijay",new Exam_Result(80,95,100));
         mark.put("murugan",new Exam_Result(100,100,99));
     }

     public static ArrayList<Integer> getMarks(String username)
     {
         ArrayList<Integer> list=new ArrayList<>();
         for(Map.Entry i:mark.entrySet())
         {
             if(username.equals(i.getKey()))
             {
                 Exam_Result e= (Exam_Result) i.getValue();
                 list.add(e.Java);
                 list.add(e.Operating_Systems);
                 list.add(e.Machine_Learning);

                 return list;
             }
         }
         return null;
     }
}

public class Hashmap_with_Encapsulation {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        boolean a=true;
        while(a==true)
        {

            System.out.println("1. To check your marks");
            System.out.println("2. To exit");
            int choice=sc.nextInt();


                if(choice==1) {
                    System.out.println("Enter username:");
                    String username = sc.next();
                    System.out.println("Enter password:");
                    String pass = sc.next();

                    pass_check p = new pass_check();
                    if (p.check_password(username, pass)) {
                        System.out.println("1. See marks");
                        System.out.println("2. To exit");
                        System.out.println();
                        int c=sc.nextInt();
                        if(c==1) {
                            ArrayList<Integer> marks = getMarks(username);
                            HashMap<String, Integer> m = new HashMap<>();
                            m.put("JAVA             ", marks.get(0));
                            m.put("Operating System ", marks.get(1));
                            m.put("Machine Learning ", marks.get(2));

                            System.out.println("SUBJECT             MARKS");
                            System.out.println();
                            for (Map.Entry i : m.entrySet()) {
                                System.out.println(i.getKey() + "   " + i.getValue());
                            }
                        }
                        else
                        {
                            a=false;
                        }

                    } else {
                        System.out.println("Wrong Password...");
                        a = false;
                    }
                }
                else
                {
                    a = false;
                }
            }

        }




    }

