
//for loop

import java.util.Scanner;
class table
{
    public static void main(String args[])
    {
        System.out.println("Enter any no");
        Scanner Sc=new Scanner(System.in);
        int a=Sc.nextInt();

        for(int i=1;i<=10;i++)
        {
            System.out.println(a*i);
        }
    }
}
