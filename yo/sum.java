import java.util.Scanner;


public class sum 

{
    public static void main(String args[])
    {
        int a,b,c;

        Scanner Sc=new Scanner(System.in);
       
        
        System.out.println("Enter first no");
        a=Sc.nextInt();
        System.out.println("Enter second no");
        b=Sc.nextInt();
        c=a+b;
        System.out.println("sum="+c);
    }
    
}
