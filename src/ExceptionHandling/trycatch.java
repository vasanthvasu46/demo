package ExceptionHandling;

public class trycatch {
    public static void main(String[] args)
    {
        int[] arr=new int[]{1,2,3,4,5};
        try{
            System.out.println(arr[10]);
        }
        catch(Exception e){
            System.out.println("Some error: "+e);
        }
        finally{
            System.out.println("Thank you");
        }
    }
}


