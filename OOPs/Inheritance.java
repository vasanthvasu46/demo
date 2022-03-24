package OOPs;

//Single level Inheritance
class A{
    String str="Hello";
    public void display() {
        System.out.println(str);
    }
}

class B extends A{
    public void display() {
        System.out.println(str+" World");
    }
}

//Multilevel Inheritance
class Numbers{
    int a=10, b=20, c=30;
    public void numbers()
    {
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
    }
}

class Add extends Numbers{
    public void add()
    {
        System.out.println("Additon answer:"+ (a+b+c));
    }
}

class Sub extends Add{
    public void sub()
    {
        System.out.println("Subtraction answer:"+ (a-b-c));
    }
}

//Hierarchical inheritance

class Actions{
    public void action()
    {
        System.out.println("This class can dance");
    }
}

class Dog extends Actions {
    public void myaction() {

        System.out.println("This is class DOG. This extends Actions class");
    }
}

class Cat extends Actions{
    public void myaction() {

        System.out.println("This is class CAT. This extends Actions class");
    }

}

public class Inheritance {
    public static void main(String[] args)
    {
        //Single level inheritance

        B b_obj=new B();
        b_obj.display();

        //Multilevel inheritance
        Sub s_obj=new Sub();
        s_obj.add();
        s_obj.sub();

        //Hierarchical inheritance

        Dog d_obj=new Dog();
        Cat c_obj=new Cat();

        d_obj.action();
        d_obj.myaction();

        c_obj.action();
        c_obj.myaction();

    }
}