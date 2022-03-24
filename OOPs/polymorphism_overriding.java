package OOPs;

class Music
{
    Music()
    {
        System.out.println("Music: initializing song...");
    }
    public void play()
    {
        System.out.println("Music: Playing Music");
    }
}

class SonyMusic extends Music
{
    SonyMusic()
    {
        System.out.println("Sony Operations");
    }
    @Override
    public void play()
    {
        System.out.println("Sony: Playing Music");
    }
}

class AditiyaMusic extends Music
{
    AditiyaMusic()
    {
        System.out.println("AditiyaMusic Operations");
    }
    @Override
    public void play()
    {
        System.out.println("AditiyaMusic: Playing Music");
    }
}

public class polymorphism_overriding {
    public static void main(String[] args)
    {
        System.out.println("Sony:");
        SonyMusic s=new SonyMusic();
        s.play();
        System.out.println();
        System.out.println("AditiyaMusic:");
        AditiyaMusic a=new AditiyaMusic();
        a.play();
    }
}