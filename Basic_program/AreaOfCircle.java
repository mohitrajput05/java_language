import java.util.Scanner;
class AreaOfCircle{
    public static void main(String args[]){
        int r;
        float result;
        Scanner scan  = new Scanner(System.in);
        System.out.println("Enter the radius");
        r=scan.nextInt();
        result=3.14f*r*r;
        System.out.println("Area of circle : "+result);
    }
}