import java.util.Scanner;
class Swap{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        int a,b;
        System.out.println("Enter the First Number of Integer : ");
        a= scan.nextInt();
        System.out.println("Enter the Second Number of Integer : ");
        b= scan.nextInt();
        System.out.printf("Before Swapping \na : %d\nb : %d",a,b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.printf("\nAfter Swaping \na : %d\nb : %d",a,b);
    }
}