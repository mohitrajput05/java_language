import java.util.Scanner;
class Iso_Equie_Scalen{
        public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        int angle1,angle2,angle3;
        System.out.println("Enter the Three angle ");
        angle1=scan.nextInt();
        angle2=scan.nextInt();
        angle3=scan.nextInt();
        if(angle1==angle2 && angle2==angle3)
          System.out.println("Equilateral triangle");
        else if(angle1==angle2 || angle2==angle3 || angle3==angle1)
               System.out.println("Isosceles Triangle");
        else
            System.out.println("scalene Triangle");
    }
 }