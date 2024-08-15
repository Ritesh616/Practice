class A
{
    void display()
    {
          System .out.println("This is grandfather");
    }
}

class B extends A
{
    void show1()
    {
        System.out.println("This is father");
    }
}

class C extends B
{
    void show2()
    {
        System.out.println("This is son");
    }
}


public class Mainmultilevelinheritance 
{
   public static void main(String args[])
   {
    C ob = new C();
    ob.show2();
    ob.show1();
    ob.display();
   }    
}
