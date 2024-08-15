class Rectangle
{
    int length,width;
    void getData(int x,int y)

    {
        length=x;
        width=y;
    }
    void rect()
    {
        int result=length*width;
        System.out.println("angle="+result);
    }
} 


public class arearectangle {

    public static void main(String[] args) 
    {

        Rectangle ob=new Rectangle();
        ob.getData(10,20);
        ob.rect();
        
    }
    
}
