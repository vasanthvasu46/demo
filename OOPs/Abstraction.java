package OOPs;

abstract class Robot{
    public void Walking()
    {
        System.out.println("Robot is walking...");
    }
    public abstract void Dancing();
    public abstract void Speaking();

}

abstract class DancingRobot extends Robot
{
    @Override
    public void Dancing()
    {
        System.out.println("Robot is dancing...");
    }
}
class CompletedRobot extends DancingRobot
{

    @Override
    public void Speaking() {
        System.out.println("Robot is Speaking...");
    }
}
public class Abstraction {
    public static void main(String[] args)
    {
        CompletedRobot c=new CompletedRobot();
        c.Walking();
        c.Dancing();
        c.Speaking();
    }
}