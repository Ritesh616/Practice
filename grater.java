
//nested if else

import java.util.Scanner;
class grater
{
    public static void main(String[] args) 
    {
        int a,b,c;
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter any Three no");
        a=Sc.nextInt();
        b=Sc.nextInt();
        c=Sc.nextInt();

        if(a>b)
        {
            if(a>c)
            {
                System.out.println("a is gratter");

            }
            else
            {
                System.out.println("c is gratter");

            }
        }
        else
        {
            if(b>c)
            {
                System.out.println("b is gratter");
            }

            else
            {
                System.out.println("c is gratter");
            }
        }
        
    }
}