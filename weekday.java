
//Switch case

import java.util.Scanner;


public class weekday 
{
    public static void main (String args[])
    {
        Scanner Sc=new Scanner(System.in);
System.out.println("Enter a weekday no");
int weekday=Sc.nextInt();

switch(weekday)
 
{
    case 1:
    
        System.out.println(" Monday");
        break;
    

    case 2:
    
        System.out.println(" Tusaday");
        break;
    

    case 3:
    
        System.out.println(" Wensday");
        break;
    

    case 4:
    
        System.out.println(" Thurasay");
        break;
    

    case 5:
    
        System.out.println(" Friaday");
        break;
    

    case 6:  
    
        System.out.println(" Saturday");
        break;
    

    case 7:
    
        System.out.println(" Sunday");
        break;
    
    default:

        System.out.println(" invalid");
        
      break;
}
    
        
}
        
     


    
}
