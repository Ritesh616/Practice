import java.util.Scanner;
class Stringdemo
{
    public static void main(String args[])
    {
        String name=new String();
        String add=new String();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name =Sc.nextLine();
        System.out.println("Enter your Address");
        add = Sc.nextLine();
        System.out.println("Name="+name+"Address="+add);

    }
}

