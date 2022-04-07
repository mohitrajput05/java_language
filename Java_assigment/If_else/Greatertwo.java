import java.util.Scanner;
class Greatertwo{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        byte a,b;
        System.out.println("enter the first number : ");
        a=scan.nextByte();
        System.out.println("Enter the second number : ");
        b=scan.nextByte();


        
        if(a > b)
        System.out.println("Greater Number is "+a);
        else 
        System.out.println("Greater Number is "+b);
    }
}