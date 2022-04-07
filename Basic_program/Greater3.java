import java.util.Scanner;
class Greater3{
    public static void main(String args[]){
        Scanner scan  = new Scanner(System.in);
        byte a,b,c;
        int x,y;
        System.out.println("Enter first number ");
        a=scan.nextByte();
        System.out.println("Enter second number ");
        b=scan.nextByte();
        System.out.println("Enter third number ");
        c=scan.nextByte();
        x=(a>b?a:b);
        y=(x>c?x:c);
        
        System.out.printf("Greater of three number is  : %d\n",y);
    }
}