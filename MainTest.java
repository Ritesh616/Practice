class Test
{
    void display()
    {
        System.out.println("Display call");
    }

    void show()
    {                                      
        display();                                                  //nesting method
        System.out.println("Show call after display");
    }


}


class MainTest
{
    public static void main(String args[])
    {
        Test ob=new Test();
        ob.show();
    }
}