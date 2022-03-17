package OOPs;
import java.util.*;

class Bank
{
    private String pass="vasanth";
    private double balance=100000.50;

    public boolean checkPassword(String pass)
    {
        if(this.pass.equals(pass))
        {
            return true;
        }
        return false;
    }
    //Getter method
    public double getBalance()
    {
        return balance;
    }

    //Setter Method
    public void setBalance(double a)
    {
        this.balance=this.balance+a;
    }
}

public class Encapsulation {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        boolean a=true;
        Bank b=new Bank();
        while(true)
        {
            System.out.println("Enter your password:");
            String p=sc.next();


            if(b.checkPassword(p)==true) {
                System.out.println("1. Check Balance");
                System.out.println("2. Add Amount");
                int choice = sc.nextInt();
                if (choice == 1) {
                    double balance=b.getBalance();
                    System.out.println("Balance:"+ balance);


                } else if (choice == 2) {
                    System.out.println("Enter amount to be added:");
                    double amount=sc.nextDouble();
                    b.setBalance(amount);

                } else if (choice == 3) {
                    a = false;
                }
            }
            else
            {
                System.out.println("Wrong Password..");
            }
        }

    }
}
