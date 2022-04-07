import java.util.Scanner;
class AreaOfTriangle
{
    public static void main(String args[])
    {
        float result;
        byte base,height;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter  the base :");
        base= scan.nextByte();
        System.out.println("Enter  the Height  :");
        height= scan.nextByte();
        result=base*height*1/2;
        System.out.println("area of triangle  : " +result);
    }
    
}