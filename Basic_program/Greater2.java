import java.util.Scanner;
class Greater2{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        byte a,b;
        System.out.println("Enter first number ");
        a=scan.nextByte();
        System.out.println("Enter second number ");
        b=scan.nextByte();
        if(a>b)
        System.out.println("Greater Number is : " +a); 
        else       
        System.out.printf("Greater Number : %d",b);
    }
}