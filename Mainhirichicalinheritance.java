class A
{
    void display()
    {
        System.out.println("This is A");
    }
}

class B extends A
{
    void show1()
    {
    System.out.println("This is B");
    }
}

class C extends A
{
    void show2()
    {
        System.out.println("This is C");
    }
}

class D extends A
{
    void show3()
    {
        System.out.println("This is D");
    }
}





public class Mainhirichicalinheritance 

{

    public static void main (String args[])
    {

        D ob=new D();
        ob.show3();
        ob.display();
        
        C ob1=new C();
        ob1.show2();
        ob1.display();

        B ob2=new B();
        ob2.show1();
        ob2.display();

        


    }
}
