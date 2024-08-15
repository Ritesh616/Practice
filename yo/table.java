
import java .util.Scanner;
public class table 
{

    public static void main(String args[])
    {
        int a;
        System.out .println("Enter any no");
        Scanner Sc=new Scanner(System.in);
         a=Sc.nextInt();

        for(int i=1;i<=10;i++)
        {
        
        System.out.println(a*i);  
        }
    }
}
