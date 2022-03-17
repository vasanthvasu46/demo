package Collection_ArrayList;

import java.util.*;

public class Custom_Arraylist {

    static class Record
    {
        int emp_id;
        String emp_name;
        String job_role;
        double salary;
        String joining_date;
        public Record(int emp_id,String emp_name,String job_role,double salary,String joining_date)
        {
            this.emp_id=emp_id;
            this.emp_name=emp_name;
            this.job_role=job_role;
            this.salary=salary;
            this.joining_date=joining_date;
        }
    }
    public static void main(String[] args) {
        int emp_id[]=new int[]{1,2,3,4,5};
        String[] emp_name=new String[]{"Vasanth","Mohith","Murugan","Ram","Raul"};
        String[] job_role=new String[]{"Software_eng","Software_eng","Software_eng","Data_analyst","Data_analyst"};
        double[] salary=new double[]{45000.0,45000.0,40000.0,35000.0,35000.0};
        String[] joining_date=new String[]{"01/03/2022","01/03/2022","01/03/2022","01/03/2022","01/03/2022"};

        int len=emp_id.length;

        ArrayList<Record> records=new ArrayList<>();

        for(int i=0;i<len;i++)
        {
            records.add(new Record(emp_id[i],emp_name[i],job_role[i],salary[i],joining_date[i]));
        }
        System.out.println("Record in List:");
        for(int i=0;i<records.size();i++)
        {
            Record r=records.get(i);
            System.out.println(r.emp_id+" | "+r.emp_name+" | "+r.job_role+" | "+r.salary+" | "+r.joining_date);

        }

    }

}
