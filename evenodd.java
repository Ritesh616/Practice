

//if else
//WAP even odd no enter by user

import java.util.Scanner;
class evenodd
{
    public static void main(String args[])
    {
        int a;
        Scanner Sc=new Scanner(System.in);

        System.err.println("Enter any no.even odd");
        a=Sc.nextInt();

        if (a%2==0)
         {
            System.out.println("even no"+a);

         }

        else
        {
            System.out.println("odd no"+a);
        }
    }
}

