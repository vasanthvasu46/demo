package HACKERRANK_ADVANCED;

public class Singleton {
    private static Singleton single_instance = null;
    public static String str;

    private Singleton() {}
    public static Singleton getSingleInstance()
    {
        if(single_instance == null)
        {
            single_instance = new Singleton();
        }

        return single_instance;
    }
}
