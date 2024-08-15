class A
{
    void display()
    {
        System.out.println("This is perent class");
    }
}

class B extends A
{
    void show()
    {
        System.out.println("This is child class");
    }
}


class Mainsingleinheritance
{
    public static void main(String args[])
    {
        B ob=new B();
        ob.show();
        ob.display();
    }
}