import java.util.Scanner;

public class ReversString
 {
    private static int i;

    public static void main (String args[])
    {
        String str="Yogesh",nstr=" ";
        char ch;
        System.out.println("Original word");
        System.out.println("Yogesh");

        for(int i=0;i<str.length();i++);
        {
            
            ch=str.charAt(i);
            nstr=ch+nstr;
        }
        System.out.println("Reversed word:"+nstr);

    }
    
}
