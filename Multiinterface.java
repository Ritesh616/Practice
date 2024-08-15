 interface A
{
    void dispaly1();

}
interface B
{
    void display2();
}

class Test implements A,B
{
    public void display1()
    {
        System.out.println("interface A");

    }
   public void display2()
    {
        System.out.println("interface B");
    }
@Override
public void dispaly1() {
    // TODO Auto-generated method stub
    throw new UnsupportedOperationException("Unimplemented method 'dispaly1'");
}
}

public class Multiinterface 
{
   public static void main(String args[])
   {
    Test t=new Test();
    t.display1();
    t.display2();
   }
    
}
