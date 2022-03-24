package HACKERRANK_OOPs;

class Animal{
    void walk(){
        System.out.println("I am walking");
    }
    public void sing()
    {
        System.out.println("I am singing");
    }
}

class Bird extends Animal{
    void fly(){
        System.out.println("I am flying");
    }
}

public class inhertance_1 {

    public static void main(String args[]){

        Bird bird = new Bird();
        bird.walk();
        bird.fly();
        bird.sing();

    }
}


