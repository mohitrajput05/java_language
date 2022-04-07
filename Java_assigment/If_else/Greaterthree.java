import java.util.Scanner;
class Greaterthree{
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        byte a,b,c;
        int x,y;
        System.out.println("enter the first number : ");
        a=scan.nextByte();
        System.out.println("Enter the second number : ");
        b=scan.nextByte();
        System.out.println("Enter the second number : ");
        c=scan.nextByte();
        x= a>b ? a : b;
        y= x>c ? x : c;
        if(x>y)
        System.out.println("Greater Number is "+x);
        else 
        System.out.println("Greater Number is "+y);
    }
}