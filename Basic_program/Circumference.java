import java.util.Scanner;
class Circumference{
    public static void main(String args[]){
    Scanner scan  = new Scanner(System.in);
    float r,result;
    System.out.println("Enter the radius");
    r=scan.nextFloat();
    result=2*3.14f*r;
    System.out.println("area of circumference "+result);
    
    }
}