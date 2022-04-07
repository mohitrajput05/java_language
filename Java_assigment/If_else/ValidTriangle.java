import java.util.Scanner;
class ValidTriangle{
        public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        int angle1,angle2,angle3;
        System.out.println("Enter the Three angle ");
        angle1=scan.nextInt();
        angle2=scan.nextInt();
        angle3=scan.nextInt();
        if((angle1+angle2+angle3)==180)
            System.out.println("Valid triangle");
        else
            System.out.println("not valid triangle");
        
        }
            
 }