
//ladreeal if else

import java.util.Scanner;
public class largest 
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter any three no");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();

        if(a>b && a>c)
        {
            System.out.println("a is largest");

        }
        else
        {
            if(b>a && b>c)
            {
                System.out.println("b is largest");

            }
            else
            {
                System.out.println("c is largest");
            }
        }
    }
}
